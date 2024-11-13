package src.com.mylearning.javabase.practice;

import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class Array工具类 {
    public static void main(String[] args) {
        int[] nums = {56,12,22,41,85,99};
        //排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //填充数组
        Arrays.fill(nums,41414);
        System.out.println(Arrays.toString(nums));
        //二分查找，数组必须有序
        int index = Arrays.binarySearch(nums,41414);
        System.out.println(index);


    }
}
