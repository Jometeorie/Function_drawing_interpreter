# 函数绘图解释器
## 概况
本项目通过Java调用Antrl工具生成，并采用Python的绘图库生成结果，实现函数绘图语言功能。项目主要语法如下：
* ORIGIN IS (expr, expr): 用于设置平移坐标
* ROT IS (expr, expr): 用于设置旋转角度
* SCALE IS expr: 用于设置缩放比例
* FOR T FROM expr TO expr DRAW (expr, expr): 用于循环绘制点坐标
* COLOLR IS (expr, expr, expr): 用于设置点的颜色，参数大小均在0-1之间
* DOTSIZE IS expr: 用于设置点的大小
* STYLE IS (styleID): 设置绘图板的背景风格，目前有darkgrid, whitegrid, dark, white, ticks五个选项。
* expr: 各种简单的运算式，以及添加了sin, cos, tan, ln等函数

代码目前添加了一些简单的异常处理机制，包括除零异常、参数大小异常、背景风格异常、死循环异常等。

## 运行和演示
运行命令如下：

![image](https://github.com/frozenlalala/Function_drawing_interpreter/blob/master/img/运行脚本.png)

其中，最后一行路径可以进行修改。例如这里指向的文件中的代码如下——

![image](https://github.com/frozenlalala/Function_drawing_interpreter/blob/master/img/testtxt.png)

其运行后的效[果图如下。

![image](https://github.com/frozenlalala/Function_drawing_interpreter/blob/master/img/demo.png)