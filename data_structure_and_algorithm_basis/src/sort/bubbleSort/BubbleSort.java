package sort.bubbleSort;

import publics.GenerateArrayUtil;
import publics.TimeComplexity;
import sort.insertSort.InsertSort;
import sort.mergeSort.MergeSort;
import sort.quickSort.QuickSort;


import static publics.SwapUtil.swap;//JDK1.5之后

public class BubbleSort {
    /**
     * 冒泡排序发的特点是：
     * 每次第二个循环都把最大的数放在最右边，
     * 这样n^2后，排序完成
     * @param data
     */
    public static void sort(int[] data){
        for (int i = 0; i < data.length -1 ; i++) {
            for (int j = 0; j < data.length -1 - i; j++) {
                if (data[j]>data[j+1]) {
                    swap(data,j,j+1);
                }
            }
        }
    }
}
