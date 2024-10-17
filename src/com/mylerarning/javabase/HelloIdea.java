package src.com.mylerarning.javabase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HelloIdea {

    public static void main(String[] args) {

        int[][] ints = new int[3][3];
        ints[0] = new int[]{1, 2, 3};
        for (int i=0 ;i <3;i++){
            for (int j =0;j<3;j++){
                System.out.println(ints[i][j]);
            }
        }

        for (int[] a:ints){
            for (int num:a){
                System.out.println(num);
            }
        }
        int[][] ints1 = new int[3][2];
        ints1[0] = new int[]{1, 2,3,4,5,6,7,8};
        ints[1][3] = 5;
        for(int[] ins:ints1){
            System.out.println(Arrays.toString(ins));
        }
        System.out.prin tln(Arrays.toString(ints1));
    }

}
