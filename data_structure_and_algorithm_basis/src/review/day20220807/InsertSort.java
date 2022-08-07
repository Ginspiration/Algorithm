package review.day20220807;

import publics.GenerateArrayUtil;
import publics.SortedUtil;

import static publics.SwapUtil.swap;

/**
 * 错误出现的地方：j >= 0 && nums[j-1] > nums[j]
 * 原因：没有走一遍循环
 */
public class InsertSort {
    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0 && nums[j-1] > nums[j]; j--) {
                swap(nums,j-1,j);
            }
        }
    }

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(10, true);
        sort(data);
        SortedUtil.isSorted(data, true, false);
    }
}
