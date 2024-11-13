package src.com.mylearning.javabase.practice.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.io
 */
/*
* 缓冲流， 属于字符流
* 如何提高字符流读取文本文件的效率？  使用FileReader类和BufferedReader类
* */
public class BufferedReader类 {
    public static void main(String[] args) {
        String filePath = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";
        FileReader fileReader;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
