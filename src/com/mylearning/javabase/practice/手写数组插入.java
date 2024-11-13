package src.com.mylearning.javabase.practice;

import java.util.Arrays;

/*
 * @Auther: hugo z
 * @Description: src.com.mylerarning.javabase.practice
 */
public class 手写数组插入 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] newArray = insert(nums, 5, 5555);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] insert(int[] old, int index, int num) {
        if (index < 0 || index > old.length) {
            return old;
        }
        int[] newArray = new int[old.length + 1];
        for (int i = 0; i < old.length; i++) {
            if (i > index) {
                newArray[i + 1] = old[i];
            } else {
                newArray[i] = old[i];
            }
            newArray[index] = num;

        }
        return newArray;
    }

}
