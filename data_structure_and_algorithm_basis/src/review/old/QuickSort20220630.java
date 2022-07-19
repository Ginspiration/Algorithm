package review.old;

import publics.ArrayPrinter;
import publics.GenerateArrayUtil;
import publics.SortedUtil;

public class QuickSort20220630 {
    public static void sort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    public static void quickSort(int[] data, int left, int right) {
        //终止条件
        if (left >= right) return;
        int p = partition(data, left, right);
        quickSort(data, left, p - 1);
        quickSort(data, p + 1, right);
    }

    public static int partition(int[] data, int left, int right) {
        int p = data[right];
        while (right > left) {
            //找大的填在右边
            while (right > left && data[left] < p)
                left++;
            if (right > left)
                data[right--] = data[left];
            //找小的填在左边
            while (right > left && data[right] > p)
                right--;
            if (right > left)
                data[left++] = data[right];
        }
        //将中间值赋值，left==right
        data[left] = p;
        return left;
    }

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(10000);
        sort(data);
        SortedUtil.isSorted(data);
        ArrayPrinter.print(data);
    }
}
