package src.com.mylearning.javabase.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*SimpleDateFormat是一个具体的泪，用于格式化（日期文本），解析（文本日期）和归一化*/
public class SimpleDateFormat类 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat.format(date));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println(simpleDateFormat1.format(date));
        System.out.println(simpleDateFormat1. parse("2023-10-11 10:30:39:309"));
    }
}
