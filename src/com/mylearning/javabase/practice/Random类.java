package src.com.mylearning.javabase.practice;

import java.util.Random;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class Random类 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextBoolean());
        System.out.println(random.nextInt(100));// 100以内随机数
        System.out.println(random.nextFloat());
        System.out.println(random.nextDouble());
        System.out.println(random.nextLong());
    }
}
