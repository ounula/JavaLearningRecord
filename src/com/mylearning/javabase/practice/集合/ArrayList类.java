package src.com.mylearning.javabase.practice.集合;


import java.util.ArrayList;
import java.util.Iterator;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */
/*
* ArrayList 吉和特点：有序，有下标，允许重复，允许null 线程不安全
* 默认0，插入第一个数据拓展至长度10，超过10之后每次拓展1.5倍原来容量
* 增删改查效率
* 查询，修改很快
* 增加如果需要扩容，插入元素的情况效率较低，因为需要复制数组或者移动元素
* 删除需要的元素效率低
* */
public class ArrayList类 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("dog");
        stringArrayList.add("cat");
        stringArrayList.add("monkey");  // 增加元素
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(1)); // 获取下标元素
        System.out.println(stringArrayList.remove(1)); // 删除下表元素并返回该元素内容
        System.out.println(stringArrayList.remove("monkey")); // 删除指定元素并返回是否删除成功
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.set(0, "fish"));//设置指定位置元素，不能超出长度设置
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.isEmpty());
        stringArrayList.add("dog");
        stringArrayList.add("cat");
        // 普通for循环遍历
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        Iterator<String> iterator = stringArrayList.iterator();
        // 迭代器遍历
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 增强for循环  核心还是迭代器遍历
        for (String i : stringArrayList) {
            System.out.println(i);
        }
    }
}
