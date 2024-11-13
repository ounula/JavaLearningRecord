package src.com.mylearning.javabase.practice.集合;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice.集合
 */

import java.util.LinkedHashMap;
import java.util.Map;

/*
* 有序hashmap*/
public class LinkedHashMap类 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<>();
        stringStringLinkedHashMap.put("a","1");
        stringStringLinkedHashMap.put("b","2");
        stringStringLinkedHashMap.put("c","3");
        stringStringLinkedHashMap.put("d","4");
        stringStringLinkedHashMap.put("e","5");

        stringStringLinkedHashMap.forEach((k,v)->{
            System.out.println(k+v);
        });
        for(Map.Entry<String, String> i : stringStringLinkedHashMap.entrySet()){
            System.out.println(i.getKey()+i.getValue());
        }
    }
}
