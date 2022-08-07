package sort.quickSort;

import publics.GenerateArrayUtil;
import publics.SortedUtil;

import static publics.SwapUtil.swap;

/**
 * 三路快速排序
 */
public class QuickSortThreeWay {

    public static void sort(int[] data) {
        quickSortThreeWay(data, 0, data.length - 1);
    }

    private static void quickSortThreeWay(int[] data, int left, int right) {

        if (left >= right) return;

        int p = data[left];//取出data【left】的值保存
        int lt = left;
        int gt = right;
        int i = lt + 1;

        while (i <= gt) {
            if (data[i] < p) {
                swap(data, i++, lt++);
            } else if (data[i] == p) {
                i++;
            } else if (data[i] > p) {
                swap(data, gt--, i);
            }
        }
        quickSortThreeWay(data, left, lt - 1);
        quickSortThreeWay(data, gt + 1, right);
    }

    public static void main(String[] args) {
        //int[] data = {0,1,-4,2,4,2,-1};
        int n = 100;
        int[] data = GenerateArrayUtil.random(n);
        sort(data);
        SortedUtil.isSorted(data,true);
    }

}