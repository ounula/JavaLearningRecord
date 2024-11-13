package src.com.mylearning.javabase.practice;

import java.util.Properties;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class System类 {
    public class Test {
        public int a = 10;

        @Override
        public String toString() {
            return "Test{" +
                    "a=" + a +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};
        int[] array2 = new int[4];
        System.arraycopy(array, 1, array2, 0, 4);
        System.out.println(System.nanoTime()); // 获取当前系统时间 纳秒
        System.out.println(System.currentTimeMillis()); //获取时间 从1970-01-01 00:00:00 至当前时间的毫秒数
        Properties properties = System.getProperties(); //获取系统信息
        properties.list(System.out); //打印列表
        System.out.println(System.getProperty("os.name")); // 根据键获取属性值
        System.clearProperty("os.name"); //根据键删除属性
        System.out.println(System.getProperty("os.name")); // 根据键获取属性值
        Object类 _object = new Object类();
        System.out.println(_object);
        _object = null;
        System.gc(); // 运行垃圾回收
        System.out.println(_object);
        System.exit(1);  //退出虚拟机,后续所有不执行(包括finally)
        System.out.println("程序结束了");
    }
}
