package src.com.mylearning.javabase.practice.集合;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */
/*
* TreeMap 有序的Map集合
*  顺序为根据键比较的顺序常用方法与HashMap完全相同
* 默认根据key升序
*
如果需要使用自定义的数据类型作为TreeMap的键 则必须实现Comparable接口重写 compareTo方法 或者 自定义比较器 实现 Comparator接口
*
* Comparable 接口属于自然排序（直接在本类中定义比较规则）
* Comparator接口属于非自然排序（需要单独定义类来编写比较规则）
* 如果我们不能修改比较对象类，则需要单独编写比较器来实现对象比较
* */
public class TreeMap类 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> objectObjectTreeMap = new TreeMap<>();
        objectObjectTreeMap.put(1,2);
        objectObjectTreeMap.put(9,10);
        objectObjectTreeMap.put(3,4);
        objectObjectTreeMap.put(7,8);
        objectObjectTreeMap.put(5,6);
        for (Map.Entry<Integer, Integer> i : objectObjectTreeMap.entrySet()){
            System.out.println(i.getKey()+i.getValue());
        }
    }
}
