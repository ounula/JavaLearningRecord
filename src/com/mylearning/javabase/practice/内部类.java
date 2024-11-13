package src.com.mylearning.javabase.practice;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
* 内部类存在原因：
* 当我们需要使用类描述某个信息 并且这个信息属于某个类 不能被其他类直接访问那么可以将此信息以内部类来描述
*
* 内部类生成的class文件名格式:外部类$内部类.class
* 内部类分类：
* 普通内部类
* 静态内部类
* 局部内部类
* 匿名内部类
*
* */
interface B{
    void a();
}
abstract class C{
    abstract void d();
}
public class 内部类 {
    static class A{
        private static String sex = "公";
        public static void wangwang(){
            String dog = "哈士奇";
            System.out.println(dog+" 正在叫");
        }

        public static String getSex() {
            return sex;
        }

        public static void setSex(String sex) {
            A.sex = sex;
        }
    }

    public static void main(String[] args) {
        // 匿名内部类
        B b = new B(){
            @Override
            public void a(){
                System.out.println("haha");
            }
        };
        b.a();
        //InterfaceC c = new InterfaceC() {
        //    @Override
        //    void d() {
        //        System.out.println("dd");
        //    }
        //};
        //
        //c.d();
    }



}
