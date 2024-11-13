package src.com.mylearning.javabase.practice.集合;

import java.util.Properties;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */
public class Properties类 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties);
        properties.setProperty("haha","gogo");
        properties.list(System.out);
    }
}
