package src.com.mylearning.javabase.practice.集合;

import java.util.HashSet;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */
public class HashSet类 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.add("1"));
        System.out.println(set.add("1"));  //重复添加会添加失败，返回值为false
        System.out.println(set);
    }
}
