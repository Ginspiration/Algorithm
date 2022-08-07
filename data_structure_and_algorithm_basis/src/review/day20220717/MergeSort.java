package review.day20220717;

import publics.GenerateArrayUtil;
import publics.SortedUtil;

public final class MergeSort {


    public static void sort(int[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    private static void mergeSort(int[] data, int l, int r) {
        if (l == r) return;
        int mid = (l + r) / 2;
        mergeSort(data, l, mid);
        mergeSort(data, mid + 1, r);
        merge(data, mid, l, r);
    }

    private static void merge(int[] data, int mid, int l, int r) {

        int[] tempData = new int[data.length];

        int left = l;
        int midPlus1 = mid + 1;

        int index = l;

        while (index <= r) {
            if (left > mid) {
                tempData[index++] = data[midPlus1++];
                continue;
            }
            if (midPlus1 > r) {
                tempData[index++] = data[left++];
                continue;
            }
            tempData[index++] = data[left] < data[midPlus1] ? data[midPlus1++] : data[left++];
        }
        for (int i = l; i <= r; i++) {
            data[i] = tempData[i];
        }
    }

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(10, true);
        sort(data);
        SortedUtil.isSorted(data, true, true);
    }
}