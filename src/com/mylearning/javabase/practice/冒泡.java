package src.com.mylearning.javabase.practice;

import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class 冒泡 {
    public static void main(String[] args) {
        int[] nums = {555, 456, 110, 23, 65, 88, 98, 985};
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
