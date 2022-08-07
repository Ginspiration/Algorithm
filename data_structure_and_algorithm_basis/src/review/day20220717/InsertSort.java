package review.day20220717;

import publics.GenerateArrayUtil;
import publics.SortedUtil;

public class InsertSort {

    public static void sort(int[] nums) {

        for (int i = 0; i <= nums.length - 1; i++) {
            int max = nums[i];
            int j;
            for (j = i; j - 1 >= 0 && nums[j - 1] < max; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = max;
        }
    }

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(1000, true);
        sort(data);
        SortedUtil.isSorted(data, true, true);
    }
}