package src.com.mylearning.javabase.practice;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class Object类 {

    //析构方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收了");
        super.finalize();
    }

    public static void main(String[] args) {

    }
}
