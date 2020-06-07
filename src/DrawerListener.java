import org.antlr.v4.runtime.*; // ANTLR API
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import tools.DrawGraphBaseListener;
import tools.DrawGraphParser;

import java.io.*;
import java.util.Arrays;

import tools.FileMethod;

public class DrawerListener extends DrawGraphBaseListener {
    ParseTreeProperty<Double> values  = new ParseTreeProperty<Double>();

      // 跨产生式使用的语义变量
    private double valueOfT =0; // 循环变量 T 的值
    private double originX =0; // 坐标平移参数
    private double originY =0; 
    private double scaleX  =1;  // 横向缩放因子
    private double scaleY  =1;  // 纵向缩放因子
    private double rotate  =0;  // 旋转角度
    private double color1 = 0 ;// 绘图色彩，颜色大小均在0-1之间
    private double color2 = 0 ;
    private double color3 = 0 ;
    private double dotSize = 10; // 绘图点大小
    private String uiStyle = "white"; // 用于控制绘图UI的风格，这里借用Python中的seaborn,
    // 目前只支持darkgrid, whitegrid, dark, white, ticks五种风格
    private String[] allUI = {"darkgrid", "whitegrid", "dark", "white", "ticks"};
    private boolean isStyleSet = false; // 整个绘图函数只能设置一次UI风格，否则需要报错

    private int loopTimes = 0; // 记录进入forStatement的次数，便于在同一张图中多次调用for循环
    private String outPutPath = "Output"; // 存放参数文件的路径

    void setValue (ParseTree node, double value)  { 
        values.put(node, value); 
    }

    double getValue (ParseTree node) { 
        return values.get(node); 
    }

    public void enterProgram (DrawGraphParser.ProgramContext ctx) {
        // 程序执行入口，创建用于记录绘图参数的文件夹
        File file = new File(outPutPath);
        if(file.exists()){
            FileMethod.deleteDir(file);
        }
        // 此时重新创建该空文件夹，用于存放参数文件
        file.mkdir();
    }

    public void exitOriginStatement (DrawGraphParser.OriginStatementContext ctx)  {  
        // 计算语义值. 此时 expr 的值已计算好
        originX = getValue ( ctx.expr(0) );
        originY = getValue ( ctx.expr(1) );
    }

    public void exitScaleStatement (DrawGraphParser.ScaleStatementContext ctx) {
        scaleX = getValue(ctx.expr(0));
        scaleY = getValue(ctx.expr(1));
    }

    public void exitRotStatement (DrawGraphParser.RotStatementContext ctx) {
        rotate = getValue(ctx.expr());
    }

    public void exitForStatement (DrawGraphParser.ForStatementContext ctx) {
        // 循环开始、结束、步数
        double beginValue = getValue(ctx.expr(0));
        double endValue = getValue(ctx.expr(1));
        double stepValue = getValue(ctx.expr(2));
        // 步数不能为小数或者负数
        if ((stepValue <= 0 && beginValue < endValue) || (stepValue >= 0 && beginValue > endValue)) {
            System.err.println("For循环中出现死循环，请检查绘图语言是否正确！");
            System.exit(0);
        }
        System.out.println("当前坐标平移参数：OriginX = " + String.valueOf(originX) + 
            ", OriginY = " + String.valueOf(originY));
        System.out.println("当前缩放因子：ScaleX = " + String.valueOf(scaleX) + 
            ", ScaleY = " + String.valueOf(scaleY));
        System.out.println("当前旋转角度：Rotate = " + String.valueOf(rotate));
        System.out.println("当前绘图颜色：Color1 = " + String.valueOf(color1) + 
            ", Color2 = " + String.valueOf(color2) + ", Color3 = " + String.valueOf(color3));
        System.out.println("当前绘图点大小：DotSize = " + String.valueOf(dotSize));

        // 这里每执行一次for循环，则将当前的各种参数以及for循环中所有的点坐标记录在对应的文件夹中
        loopTimes += 1;
        String outputName = outPutPath + "/Loop" + String.valueOf(loopTimes) + ".txt";
        System.out.println(outputName);
        File outputFiile = new File(outputName);
        // 颜色参数
        FileMethod.writeToFile(outputFiile, String.valueOf(color1) + "#" + String.valueOf(color2) 
            + "#" + String.valueOf(color3) + "\n");
        // 点大小的参数
        FileMethod.writeToFile(outputFiile, String.valueOf(dotSize));

        // 开始循环
        System.out.println("需要绘制的坐标：");
        // 用于多次遍历
        ParseTreeWalker walker = new ParseTreeWalker();
        for (valueOfT = beginValue; valueOfT <= endValue; valueOfT+= stepValue) {
            // 获取需要绘制的坐标值，每次循环时需要重复遍历，否则每次都会获取到相同的值
            walker.walk(this , ctx.expr(3)); 
            double tempX = getValue(ctx.expr(3));

            walker.walk(this , ctx.expr(4)); 
            double tempY = getValue(ctx.expr(4));

            // 比例变换
            tempX *= scaleX;
            tempY *= scaleY;

            // 旋转变换
            double temp;
            temp = tempX * Math.cos(rotate) + tempY * Math.sin(rotate);
            tempY = tempY * Math.cos(rotate) - tempX * Math.sin(rotate);
            tempX = temp;

            // 平移变换
            tempX += originX;
            tempY += originY;

            // 将点的坐标写入参数文件中
            FileMethod.writeToFile(outputFiile, "\n" + String.valueOf(tempX) + "#" + String.valueOf(tempY));

            System.out.println("(" + String.valueOf(tempX) + ", " + String.valueOf(tempY) + ")");
        }
    }

    public void exitProgram (DrawGraphParser.ProgramContext ctx) {
        // 调用Python绘图程序
        String cmd = "python draw.py --output_path=" + outPutPath + "/ --UI_style=" + uiStyle;
        try {
            Process p = Runtime.getRuntime().exec(cmd);
        }
        catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }

    public void exitColorStatement (DrawGraphParser.ColorStatementContext ctx) {
        color1 = getValue(ctx.expr(0));
        color2 = getValue(ctx.expr(1));
        color3 = getValue(ctx.expr(2));
        // 检查三种颜色的参数值是否均在0-1之间
        if (color1 < 0 || color1 > 1) {
            System.err.println("参数Color1的值不在0-1之间，请检查绘图语言是否正确！");
            System.exit(0);
        }
        if (color2 < 0 || color2 > 1) {
            System.err.println("参数Color2的值不在0-1之间，请检查绘图语言是否正确！");
            System.exit(0);
        }
        if (color3 < 0 || color3 > 1) {
            System.err.println("参数Color3的值不在0-1之间，请检查绘图语言是否正确！");
            System.exit(0);
        }
    }

    public void exitDotSizeStatement (DrawGraphParser.DotSizeStatementContext ctx) {
        dotSize =getValue(ctx.expr());
        if (dotSize < 0) {
            System.err.println("参数DotSize不能为负数，请检查绘图语言是否正确！");
            System.exit(0);
        }
    }

    public void exitStyleStatement (DrawGraphParser.StyleStatementContext ctx) {
        if (isStyleSet == false) {
            uiStyle = ctx.styleType.getText().toLowerCase();
            if (Arrays.asList(allUI).contains(uiStyle) == false) {
                System.err.println("不存在风格" + uiStyle + "，请检查绘图语言是否正确！");
                System.exit(0);
            }
        }
        else {
            System.err.println("UI风格不能重复设置，请检查绘图语言是否正确！");
            System.exit(0);
        }
    }
    
    // 乘方运算
    public void exitPowerExpr (DrawGraphParser.PowerExprContext ctx) {
        double L =getValue(ctx.expr(0)); // 左操作数的值
        double R =getValue(ctx.expr(1)); // 右操作数的值
        double value = Math.pow( L , R );
        setValue(ctx, value);
    }

    // 处理一元运算
    public void exitUnaryExpr (DrawGraphParser.UnaryExprContext ctx) {
        double V =getValue(ctx.expr()); 
        if (ctx.op.getType() == DrawGraphParser.PLUS) {
            setValue(ctx, V);
        }
        else if (ctx.op.getType() == DrawGraphParser.MINUS) {
            setValue(ctx, -V);
        }
    }

    // 处理乘除运算
    public void exitMulDivExpr (DrawGraphParser.MulDivExprContext ctx) {
        double L = getValue(ctx.expr(0));
        double R = getValue(ctx.expr(1));
        if (ctx.op.getType() == DrawGraphParser.MUL) {
            double value = L * R;
            setValue(ctx, value);
        }
        else if (ctx.op.getType() == DrawGraphParser.DIV) {
            // 除数为0的情况，抛出异常终止程序
            if (R == 0) {
                System.err.println("除数为0，请检查绘图语言是否正确！");
                System.exit(0);
            }
            else {
                double value = L / R;
                setValue(ctx, value);
            }
        }
    }

    // 处理加减运算
    public void exitPlusMinusExpr (DrawGraphParser.PlusMinusExprContext ctx) {
        double L = getValue(ctx.expr(0));
        double R = getValue(ctx.expr(1));
        if (ctx.op.getType() == DrawGraphParser.PLUS) {
            double value = L + R;
            setValue(ctx, value);
        }
        else if (ctx.op.getType() == DrawGraphParser.MINUS) {
            double value = L - R;
            setValue(ctx, value);
        }
    }

    // 处理常数
    public void exitConst (DrawGraphParser.ConstContext ctx) {
        // 首先处理常数为E和PI的情况，这里大小写不敏感
        if (ctx.getText().toLowerCase().equals("e")) {
            setValue(ctx, 2.7182818);
        }
        else if (ctx.getText().toLowerCase().equals("pi")) {
            setValue(ctx, 3.1415926);
        }
        else {
            setValue(ctx, Double.valueOf(ctx.getText()));
        }
    }

    // 设置循环过程中T的值
    public void exitVarT (DrawGraphParser.VarTContext ctx) {
        setValue(ctx, valueOfT);
    }

    // 处理函数，目前有sin, cos, tan, ln
    public void exitFuncExpr (DrawGraphParser.FuncExprContext ctx) {
        double V =getValue(ctx.expr()); 
        if (ctx.func.getText().toLowerCase().equals("sin")) {
            double value = Math.sin(V);
            setValue(ctx, value);
        }
        else if (ctx.func.getText().toLowerCase().equals("cos")) {
            double value = Math.cos(V);
            setValue(ctx, value);
        }
        else if (ctx.func.getText().toLowerCase().equals("tan")) {
            double value = Math.tan(V);
            setValue(ctx, value);
        }
        else if (ctx.func.getText().toLowerCase().equals("ln")) {
            double value = Math.log(V);
            setValue(ctx, value);
        }
        // 函数不存在的异常处理
        else {
            System.err.println("函数" + ctx.func.getText() + "不存在，请检查绘图语言是否正确！");
            System.exit(0);
        }
    }

    // 处理括号
    public void exitNestedExpr (DrawGraphParser.NestedExprContext ctx) {
        double V = getValue(ctx.expr());
        setValue(ctx, V);
    }
}