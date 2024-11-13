package src.com.mylearning.javabase.practice;

import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class String类 {

    public static void main(String[] args) {
        String name = "韩币b";
        String name2 = "日币A";
        String name3 = "韩币B";
        String name4 = " 韩币B4 ";
        System.out.println(name.equals(name2));
        System.out.println(name.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name3.equalsIgnoreCase(name));

        System.out.println(name3.concat(name2.concat(name)));
        System.out.println(name3.indexOf("币B"));   // 查找第一个出现的字符的下标
        System.out.println(name4.indexOf(4));   // 查找第一个出现的字符(ascii码)
        System.out.println(name4.lastIndexOf('币')); //查找最后一次出现的字符串下标
        System.out.println(name4.substring(2)); // 截取字符串,左开右闭 默认至最后
        System.out.println(name4.trim());// 去除字符串左右最两端的空格
        System.out.println(Arrays.toString(name4.split("B", 1))); // 按regex拆分字符串
        System.out.println(name4.contains("B")); //是否包含
        System.out.println(name4.startsWith(" ")); //判断字符串是否以某个字符串开头
        System.out.println(name4.isEmpty()); //判断字符串长度是否为0
        System.out.println(name4.matches(".*B.*")); //是否匹配正则
        System.out.println(name4.replace("B", "A")); //替换
        System.out.println(name4.charAt(5)); //获取某个字符
        System.out.println(String.valueOf(123));
    }
    /*
    * 面试题
    * 1、String类底层实现
    *String类底层帮我们维护的是一个char数组，我们创建的每一个字符串对象都以char数组的形式来保存
    *
    * 2、String类对象是否可以改变
    * 不可改变，任何对String类对象内容的修改都会创建新的对象
    *
    * 3、为什么String类是不可变对象
    * 原因1:底层为char数组维护的String对象 而数组的长度是固定的原因
    * 2:此数组为final修饰 表示不能指向新的地址, 同时也使用private修饰 表示不能被外界访问原因
    * 3:String类是final修饰的
    *
    * 4、Sting类中intern()干什么用的
    * 调动intern()会先去字符串常量池中检查是否有当前字符串完全相同的内容，如果有则直接引用如果没有则将字符串内容存进常量池再引用地址
    * */
}
