package src.com.mylerarning.javabase.oo;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public static void main(String[] args) {

        int[][] ints = new int[3][3];
        ints[0] = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(ints[i][j]);
            }
        }

        for (int[] a : ints) {
            for (int num : a) {
                System.out.println(num);
            }
        }
        int[][] ints1 = new int[3][2];
        ints1[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        ints[1][3] = 5;
        for (int[] ins : ints1) {
            System.out.println(Arrays.toString(ins));
        }
        System.out.println(Arrays.toString(ints1));
    }

}
