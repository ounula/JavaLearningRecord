package src.com.mylearning.javabase.practice.集合;

import java.util.HashMap;
import java.util.Map;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */
/*
* hashmap中没一个元素是一个node对象，属于entry接口的实现类，其每个entry中包含hash值以及key和value，
* 放在默认16长度数组中（根据key计算的hash值与数组长度进行与运算），当容量达到75% 扩容为两倍
* */
public class Hashmap类 {

    public static void main(String[] args) {
        HashMap<String, Integer> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("good",1);
        stringStringHashMap.put("bad",2);
        stringStringHashMap.put("normal",3);
        stringStringHashMap.put("very good",4);
        stringStringHashMap.put("very bad",5);
        System.out.println(stringStringHashMap.get("very bad"));
        System.out.println(stringStringHashMap.containsKey("very bad"));
        System.out.println(stringStringHashMap.containsValue(5));
        System.out.println(stringStringHashMap.remove("very bad"));
        System.out.println(stringStringHashMap.remove("very good", 3));
        System.out.println(stringStringHashMap.remove("very good", 4));
        for (String s : stringStringHashMap.keySet()) {
            System.out.println(s);
        }
        for (Integer value : stringStringHashMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : stringStringHashMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+stringIntegerEntry.getValue());
        }


        stringStringHashMap.forEach((key,value)->{
            System.out.println(key+ "-----" + value);
        });
        stringStringHashMap.clear();
        System.out.println(stringStringHashMap);

    }
}
