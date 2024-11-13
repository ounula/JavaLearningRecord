package src.com.mylearning.javabase.practice;

import java.util.Date;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
 * 处理日期工具类，很多构造和方法已经弃用，但是依然可以用，不过不推荐使用*/
public class Date工具类 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(new Date(2023 - 1900, 11, 31));
        Date date1 = new Date(System.currentTimeMillis());
        System.out.println(date1);
        System.out.println(date1.getMonth());
        System.out.println(date1.getDate());
        System.out.println(date1.getYear() + 1900);
        System.out.println(date1.getHours());
        System.out.println(date1.getMinutes());
    }
}
