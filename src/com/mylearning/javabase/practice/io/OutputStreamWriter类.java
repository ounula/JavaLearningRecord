package src.com.mylearning.javabase.practice.io;

import java.io.*;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.io
 */
public class OutputStreamWriter类 {
    public static void main(String[] args) {
        String filePath = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        try {
            outputStreamWriter.write("\ndsadsadsadsadasda擦擦哦, 嘿嘿嘿");
            outputStreamWriter.flush();  //将缓冲写入硬盘
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            outputStreamWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
