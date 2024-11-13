package src.com.mylearning.javabase.practice.io;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.io
 */


import java.io.FileWriter;
import java.io.IOException;

/*
* 只能按照本地默认的编码格式写入文件*/
public class FileWriter类 {
    public static void main(String[] args) {
        String filePath = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath,true);
            fileWriter.write("hello world, woshi666");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (null!=fileWriter){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
