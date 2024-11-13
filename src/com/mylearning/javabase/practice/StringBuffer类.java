package src.com.mylearning.javabase.practice;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */

/*StringBuffer
* 线程安全，可变的字符序列
* StringBuilder
* 线程不安全，其余和StringBuffer用法一致
* String 也是线程不安全的
* */
public class StringBuffer类 {
    public static void main(String[] args) {
        StringBuffer abc = new StringBuffer("abc");
        System.out.println(abc);
        abc.append(3);
        System.out.println(abc);
        System.out.println(abc.capacity());
        abc.delete(1,2);
        System.out.println(abc);
        abc.deleteCharAt(1);
        System.out.println(abc);
        abc.insert(1,"12");
        System.out.println(abc);
        String abc2 = "abc";
        System.out.println(abc.replace(1, 4, "54321"));
        abc.deleteCharAt(0);
        System.out.println(abc);
        abc.insert(5,true);
        System.out.println(abc);
    }
}
