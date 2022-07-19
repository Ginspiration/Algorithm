package review.day20220717;

import dataStructure.Array;
import publics.GenerateArrayUtil;
import publics.SortedUtil;

import java.util.Arrays;

public class InsertSort {

    public static void sort(int[] data) {

        for (int i = 0; i <= data.length - 1; i++) {
            int max = data[i];
            int j;
            for ( j = i; j-1 >= 0 && data[j-1] < max; j--) {
                data[j] = data[j-1];
            }
            data[j] = max;
        }
    }

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(1000,true);
        sort(data);
        SortedUtil.isSorted(data,true,true);
    }
}