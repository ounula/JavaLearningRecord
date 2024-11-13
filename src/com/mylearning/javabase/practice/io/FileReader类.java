package src.com.mylearning.javabase.practice.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.io
 */
/*
只能按照本地平台默认的编码格式读取数据，不能单独指定数据
* */
public class FileReader类 {
    public static void main(String[] args) {
        String filePath = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
            int readData;
            while ((readData = fileReader.read())!= -1){
                System.out.println("readData= "+ (char)readData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        String filePath2 = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";
        FileReader fileReader2 = null;
        try {
            fileReader2 = new FileReader(filePath2);
            char[] data = new char[10];
            int readData2;
            while ((readData2 = fileReader2.read(data))!= -1){
                System.out.println("readData= "+ new String(data));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (fileReader2 != null) {
                try {
                    fileReader2.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
