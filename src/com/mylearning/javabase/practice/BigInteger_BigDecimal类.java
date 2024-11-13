package src.com.mylearning.javabase.practice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
/*
* number类子类，不可变的任意精度的整数、浮点数*/
public class BigInteger_BigDecimal类 {
    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("321312321321321321321424532513252");
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger("321312312312312");
        System.out.println(bigInteger1.add(bigInteger)); // 加
        System.out.println(bigInteger1.subtract(bigInteger)); //减
        System.out.println(bigInteger.multiply(bigInteger1)); // 乘
        System.out.println(bigInteger.divide(bigInteger1));//除


        BigDecimal bigDecimal = new BigDecimal("321312321.321321");
        BigDecimal bigDecimal1 = new BigDecimal("321312321.111");
        System.out.println(bigDecimal.divide(bigDecimal1, RoundingMode.HALF_UP));// 四舍五入除法

    }

}
