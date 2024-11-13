package src.com.mylearning.javabase.practice.集合;

import java.util.LinkedList;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */
/*
* 除了和arraylist相同的方法以外，还单独提供了专门用于操作头部和尾部的方法*/
public class LinkedList类 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("bbb");
        strings.addFirst("first");
        strings.addLast("good");
        strings.push("ccc");
        System.out.println(strings.pop());
        System.out.println(strings.get(0));
        System.out.println(strings.remove());
        System.out.println(strings);
    }
}
