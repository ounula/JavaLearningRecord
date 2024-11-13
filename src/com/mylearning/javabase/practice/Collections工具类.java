package src.com.mylearning.javabase.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
* 集合工具类
* */
public class Collections工具类 {
    public static void main(String[] args) {
        System.out.println(Collections.EMPTY_LIST);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("c");
        strings.add("e");
        strings.add("d");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
        System.out.println(Collections.binarySearch(strings, "d"));  // 二分查找
        Collections.addAll(new ArrayList<String>());
        System.out.println(Collections.max(strings)); // 最大值
        System.out.println(Collections.min(strings)); // 最小值
        Collections.reverse(strings); // 反转
        System.out.println(strings);
        Collections.swap(strings,0,3); // 交换元素
        System.out.println(strings);
        Collections.fill(strings,"bbb"); // 填充
        System.out.println(strings);

    }
}
