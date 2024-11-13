package src.com.mylearning.javabase.practice;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class 单例模式 {
    private static 单例模式 instance = new 单例模式();

    private 单例模式() {
    }

    ;

    public static 单例模式 getInstance() {
        return instance;
    }

}

class Test{
    public static void main(String[] args) {
        单例模式 a  = 单例模式.getInstance();
        单例模式 b  = 单例模式.getInstance();
        System.out.println(a==b);

    }
}
