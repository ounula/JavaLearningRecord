package src.com.mylearning.javabase.practice.io;

import java.io.*;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.io
 */
/*
* 带有缓冲区的写入流对象*/
public class BufferedWriter类 {
    public static void main(String[] args) throws IOException {

        String filePath = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));
        bufferedWriter.write("heiheheihei");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
