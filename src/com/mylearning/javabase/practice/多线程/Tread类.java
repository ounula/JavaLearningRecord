package src.com.mylearning.javabase.practice.多线程;

/*
 * @Auther: hugo z
 * @Description: src.com.mylearning.javabase.practice.多线程
 */
public class Tread类 {
    public static void sleepTime() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(Tread类.sleepTime);
        System.out.println(Thread.currentThread()); // 获取当前线程
        System.out.println(thread.getName()); //获取线程名
        thread.start();
        System.out.println(thread.isAlive());
        thread.stop();
        System.out.println(thread.getId());
        System.out.println(thread.getThreadGroup());
        System.out.println(Thread.getAllStackTraces());
    }
}
