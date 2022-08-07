package review.old;

import publics.GenerateArrayUtil;
import publics.SortedUtil;

import java.util.Arrays;

public class MergeSort20220623 {
    public static void sort(int[] data) {
        int[] dataTemp = Arrays.copyOf(data, data.length);
        mergeSort(data, 0, data.length - 1, dataTemp);
    }

    public static void mergeSort(int[] data, int left, int right, int[] dataTemp) {
        if (right == left) return;
        int mid = (left + right) / 2;
        mergeSort(data, left, mid, dataTemp);
        mergeSort(data, mid + 1, right, dataTemp);
        merge(data, left, mid, right, dataTemp);
    }

    public static void merge(int[] data, int left, int mid, int right, int[] dataTemp) {
        int index = left;
        int i = left;
        int j = mid + 1;
        while (index <= right) {
            if (i > mid) {
                dataTemp[index++] = data[j++];
                continue;
            }
            if (j > right) {
                dataTemp[index++] = data[i++];
                continue;
            }
            dataTemp[index++] = data[i] > data[j] ? data[j++] : data[i++];
        }
        for (int k = left; k <= right; k++) {
            data[k] = dataTemp[k];
        }
    }

    public static void main(String[] args) {
        int n = 100_0000;
        int[] data = GenerateArrayUtil.random(n, n);
        //System.out.println(Arrays.toString(data));
        sort(data);
        SortedUtil.isSorted(data);
    }
}
