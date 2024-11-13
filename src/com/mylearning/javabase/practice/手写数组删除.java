package src.com.mylearning.javabase.practice;

import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class 手写数组删除 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 8, 9};
        int[] newNums = delete(nums, 0);
        System.out.println(Arrays.toString(newNums));
    }

    public static int[] delete(int[] srcArray, int index) {
        if (index < 0 || index >= srcArray.length) {
            return srcArray;
        }
        int[] dstArray = new int[srcArray.length - 1];
        for (int i = 0; i < srcArray.length; i++) {
            if (index > i) {
                dstArray[i] = srcArray[i];
            } else if (index < i) {
                dstArray[i - 1] = srcArray[i];
            }
        }
        return dstArray;
    }
}
