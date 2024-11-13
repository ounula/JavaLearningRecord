package src.com.mylearning.javabase.practice.io;

import java.io.*;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.io
 */
/*
* 数据流，属于字节流，读取二进制文件*/
public class DataStream类 {
    public static void main(String[] args) throws IOException {
        String filePath = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";

        FileInputStream fileInputStream = new FileInputStream(filePath);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        byte [] data = new byte[fileInputStream.available()];
        dataInputStream.read(data);
        dataInputStream.close();
        fileInputStream.close();
        System.out.println(new String(data,0,data.length));

        FileOutputStream fileOutputStream = new FileOutputStream("./JavaLearningRecord/src/com/mylearning/javabase/testFile2.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.write(data);
        dataOutputStream.close();
        fileOutputStream.close();

    }
}
