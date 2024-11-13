package src.com.mylearning.javabase.practice.io;

import java.io.File;
import java.io.IOException;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class File类 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Develop\\Code\\Java\\JavaLearningRecord\\JavaLearningRecord\\src\\com\\mylearning\\javabase\\practice\\textFile.txt");
        System.out.println(file.createNewFile()); //创建文件
        System.out.println(file.isFile()); // 是否文件
        System.out.println(file.getPath()); //获取相对路径
        System.out.println(file.getAbsolutePath()); // 获取绝对路径
        System.out.println(file.getName()); //获取文件名称
        System.out.println(file.length()); //获取文件大小 字节
        file.deleteOnExit(); //程序结束后删除
        System.out.println(file.exists()); // 判断文件是否存在
        System.out.println(file.isHidden()); // 判断文件是否隐藏
        System.out.println(file.delete());//删除文件
        System.out.println(file.canWrite());//是否可写
        System.out.println(file.lastModified()); // 最后修改时间
        File file1 = new File("./JavaLearningRecord/src/com/mylearning/javabase/A/B");
        System.out.println(file1.mkdir()); //创建单级目录
        System.out.println(file1.mkdirs()); // 创建多级目录
        System.out.println(file1.delete()); //删除文件夹

    }
}
