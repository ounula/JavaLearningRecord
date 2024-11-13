package src.com.mylearning.javabase;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args){
        final double PI = 3.14;
        System.out.print("请输入半径: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        double c = 2 * PI * r;
        double d = PI * Math.pow(r, 2);

        System.out.println("周长为: " + c);
        System.out.println("面积为: " + d);

    }
}
