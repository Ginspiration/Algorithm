package sort.bubbleSort;

import static publics.SwapUtil.swap;

public class BubbleSort {
    /**
     * 冒泡排序发的特点是：
     * 每次第二个循环都把最大的数放在最右边，
     * 这样n^2后，排序完成
     *
     * @param data
     */
    public static void sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }
}
