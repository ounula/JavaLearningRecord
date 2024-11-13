package src.com.mylearning.javabase.practice;

import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class 选择 {
    public static void main(String[] args) {
        int[] nums = {555, 456, 110, 23, 65, 88, 98, 985};
        for (int i = 0; i < nums.length; i++) {
            int temp = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[temp] > nums[j]) {
                    temp = j;
                }
            }
            if (temp != i) {
                int temp2 = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
