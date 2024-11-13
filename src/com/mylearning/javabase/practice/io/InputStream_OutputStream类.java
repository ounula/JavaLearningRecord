package src.com.mylearning.javabase.practice.io;

import java.io.*;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice
 */
/*
* 字节读取流和写入流
* */
public class InputStream_OutputStream类 {
    public static void main(String[] args) throws IOException {
        String filePath = "./JavaLearningRecord/src/com/mylearning/javabase/testFile.txt";
        File file = new File(filePath);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath, true); // 第二参数为追加
            fileOutputStream.write(65);
            fileOutputStream.write(66);  // 写入ascii
            fileOutputStream.write(new byte[]{97, 98, 99, 100});
            String str = "测试中文 hello chinese！";
            byte[] bytes = str.getBytes();
            fileOutputStream.write(bytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            assert fileOutputStream != null;
            fileOutputStream.close();
        }

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            //int readCount = -1;
            //while ((readCount = fileInputStream.read(bytes)) != -1) {
            //    System.out.println(new String(bytes, 0, readCount));
            //}
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            assert fileInputStream != null;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"GBK");
        char[] data = new char[10];
        System.out.println(inputStreamReader.read(data));


    }

}
