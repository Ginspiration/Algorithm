package sort.mergeSort;

import publics.ArrayPrinter;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] data = {9, 2, 7, 3, 9, 8, 7, 6, 5};
        //int[] data = GenerateArrayUtil.random(100, 10);
        ArrayPrinter.print(data);
        sort(data);
        ArrayPrinter.print(data);
    }

    private static void mergeSort(int[] data, int left, int right, int[] copyOfData) {
        if (left == right) return;
        int mid = (left + right) / 2;
        mergeSort(data, left, mid, copyOfData);
        mergeSort(data, mid + 1, right, copyOfData);
        merge(data, left, mid, right, copyOfData);
    }

    private static void merge(int[] data, int left, int mid, int right, int[] copyOfData) {
        int i = left;
        int j = mid + 1;
        int index = left;
        while (index <= right) {
            if (j > right) {
                copyOfData[index++] = data[i++];
                continue;
            } else if (i > mid) {
                copyOfData[index++] = data[j++];
                continue;
            }
            copyOfData[index++] = data[i] < data[j] ? data[i++] : data[j++];
        }
        for (int k = left; k <= right; k++) {
            data[k] = copyOfData[k];
        }
    }

    public static void sort(int[] data) {
        mergeSort(data, 0, data.length - 1, Arrays.copyOf(data, data.length));
    }


}
