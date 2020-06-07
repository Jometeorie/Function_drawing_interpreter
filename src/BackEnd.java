import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;
public class BackEnd {
    protected ParseTree tree =null; // 分析树
    // protected BaseUI theUI =null;// UI类型自定义
  
    // public BackEnd(ParseTree t, BaseUI ui)  
    public BackEnd(ParseTree t)  {
        tree=t;  
        // theUI = ui; 
    }
  
    // 关键操作：执行应用层的计算逻辑    
    // 关键操作：执行应用层的计算逻辑
    public void run() { // 示例
        ParseTreeWalker walker  = new ParseTreeWalker(); /*树遍历器,只需1个*/
        DrawerListener eval = new DrawerListener();
        // eval.setUI( theUI ); // 关联 UI 对象
        walker.walk( eval , tree ); // 监听器模式
        // // --------------
        // CheckerVisitor check1 =new CheckerVisitor();
        // check1.setUI( theUI );
        // check1.visit( tree ); // 访问者模式
        // // --------------
        // ... ...
    }

    
    interface BaseUI {  // 声明后端所需 UI 操作
       void showMessage(String text);
       void DrawPixel(int x, int y);
       void setColor(int red, int green, int blue);
       void beginDraw();  void endDraw();
    //    ……
    }
    
}