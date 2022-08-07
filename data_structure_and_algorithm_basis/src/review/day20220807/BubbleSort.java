package review.day20220807;

import publics.GenerateArrayUtil;
import publics.SortedUtil;

import static publics.SwapUtil.swap;

/**
 * &#064;错误：data[j] < data[j - 1]
 * &#064;原因：正序逆序反了
 * &#064;解决：画图
 */
public class BubbleSort {
    public static void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                if (data[j] < data[j - 1]) {
                    swap(data, j, j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(10, true);
        sort(data);
        SortedUtil.isSorted(data, true, false);
    }
}
