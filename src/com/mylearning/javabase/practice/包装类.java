package src.com.mylearning.javabase.practice;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.jar.JarEntry;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
* 所有包装类都可将与之对应的基本数据类型作为参数，来构造它们的实例
* public Type (type value)·如:
    除Character类外，其他包装类可将一个字符串作为参数构造它们的实例
    public Type (String value)
Short Integer Long Character 包装类相关面试题
这四个包装类 直接使用等号赋值的方式创建对象 如果在byte取值范围以内 则从缓存数组中取出对应的元素
* */
public class 包装类 {

    public static void main(String[] args) {
        Integer i = new Integer("10");
        Integer j = 11;

        Byte b1 = (byte) 120;
        Byte b2 = new Byte("123");

        Long l1 = new Long(123421421421421L);
        Long l2 = new Long("3213123213213213321");

        Boolean bl1 = new Boolean("true");
        Boolean bl2 = new Boolean("True");
        // 除了true以外的字符串都等效False
        Boolean bl3 = new Boolean("asdasdsa");
        Boolean bl4 = Boolean.FALSE;

        System.out.println(bl4.booleanValue());

        //Character c1 = new Character("a");  character 不支持字符串构造
        System.out.println(i + j);
        System.out.println(b1 + b2);
        System.out.println(l1 + l2);
        System.out.println(bl1);
        System.out.println(bl2);
        System.out.println(bl3);

        System.out.println(Integer.parseInt("321"));

        //自动装箱：将基本数据类型转换为包装类对象
        Integer i1 = 100; // Integer.valueOf(100)
        int number = i1 ;  // 拆箱
    }
}
