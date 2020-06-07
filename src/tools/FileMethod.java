package tools;
import java.io.*;

// 用于绘图程序必要的文件操作
public class FileMethod {

    // 用于删除某个文件夹
    public static void deleteDir(File file){
        //判断文件不为null或文件目录存在
        if (file == null || !file.exists()) {
            System.out.println("文件删除失败！保存参数文件时无法删除原始文件夹！");
            return;
        }
        //取得这个目录下的所有子文件对象
        File[] files = file.listFiles();
        for (File f: files) {
            if (f.isDirectory()){
                deleteDir(f);
            }
            else {
                f.delete();
            }
        }
        file.delete();
    }

    // 用于创建新文件或在已有的文件后追加新的内容
    public static void writeToFile(File file, String content) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }   
            BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
            output.write(content);
            output.flush();
            output.close();
        }
        catch (IOException e) {
            System.out.println("IOException thrown  :" + e);
        }
    }
}