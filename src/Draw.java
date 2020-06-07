
public class Draw {
      public static void main(String[] args) throws Exception {
        if( args.length < 1){
          System.err.println("应提供…源文件！\n");
          System.exit(1);
       }
        String file = args[0];
        FrontEnd fe = new FrontEnd(file);
        int nErr = fe.doParse();
        if(nErr > 0) {
          System.err.println("语法分析发现错误了!");
          System.exit(1);
        }

        BackEnd be =new BackEnd(fe.getTree());
        be.run();
      }
}
