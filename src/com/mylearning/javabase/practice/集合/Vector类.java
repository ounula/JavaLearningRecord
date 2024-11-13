package src.com.mylearning.javabase.practice.集合;

import java.util.Vector;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */
/*
* 与ArrayList不同的是，此类为线程安全的
* 内部起始数据数组大小为10，标准容量增量为0
* 可以指定容量增量
* Vector扩容2倍
* */
public class Vector类 {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("dog");
        System.out.println(strings);
    }
}
