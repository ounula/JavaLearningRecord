package src.com.mylearning.javabase.practice;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */

import java.util.Arrays;

/*
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 6 10 10 5 1
 * */
public class 杨辉三角 {
    public static void main(String[] args) {
        int[][] yh = new int[6][6];
        for (int row = 0; row < yh.length; row++) {
            yh[row][0] = 1;
            yh[row][row] = 1;
            if (row > 1) {
                for (int col = 1; col < yh[row].length - 1; col++) {
                    yh[row][col] = yh[row - 1][col - 1] + yh[row - 1][col];
                }
            }
        }
        System.out.println(Arrays.deepToString(yh));


    }
}
