package src.com.mylearning.javabase.practice;

import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
 * 自定义枚举不能继承其他类，但是可以实现接口
 * 枚举类中默认书写的全部内容为：全局静态常量 public static final
 * 枚举类构造方法不可以用public修饰构造方法（无法new对象）
 * */
public class 枚举 {
    public enum Genders {
        MAIL("男性"), FEMAIL("女性");
        private String title;

        public static void playWithOther(String thing) {
            System.out.println("mail and femail playing " + thing);
        }

        Genders(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void playWithAnother(){
            System.out.println(Arrays.toString(Genders.values()));
            if (this.getTitle() == "女性"){
                System.out.println("她正在和一个男生玩耍");
            } else {
                System.out.println("他正在和一个女生玩耍");
            }
        }

        @Override
        public String toString() {
            return "Genders{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }

    public Genders sex;

    public 枚举(Genders sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        枚举 meiJ = new 枚举(Genders.MAIL);
        System.out.println(meiJ.sex);
    }
}
