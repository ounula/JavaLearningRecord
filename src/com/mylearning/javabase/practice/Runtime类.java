package src.com.mylearning.javabase.practice;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */

import java.io.IOException;

/*
 * 记录当前运行时的各种信息，通过getRuntime运行时
 * */
public class Runtime类 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime(); //获取运行时实例
        runtime.exec("ping 127.0.0.1"); // 执行本地可执行文件
        System.out.println(runtime.freeMemory() / 1024 / 1024 + " MB"); //获取jvm空闲内存，字节
        System.out.println(runtime.maxMemory() / 1024 / 1024 + " MB"); //获取jvm最大内存，字节
        System.out.println(runtime.totalMemory() / 1024 / 1024 + " MB"); //获取jvm总内存，字节
        runtime.gc(); // 运行垃圾回收器
        runtime.exit(123);//退出虚拟机  System.exit()
    }
}
