package src.com.mylearning.javabase.practice;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
* JDK1.8新增日期类
* */
public class LocalDate_LocalTime_LocalDateTime类 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now()); //获取当前系统日期
        System.out.println(LocalTime.now()); //获取当前系统时间
        System.out.println(LocalDateTime.now()); // 获取日期+时间
        System.out.println(LocalDate.of(2024, 1, 31));
        LocalDate now = LocalDate.now();
        System.out.println(now.getChronology());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonthValue());
        System.out.println(LocalDateTime.of(2023, 10, 1, 1, 20, 30, 123));
    }
}
