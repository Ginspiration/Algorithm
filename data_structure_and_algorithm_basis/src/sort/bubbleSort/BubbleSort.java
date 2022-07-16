package sort.bubbleSort;

import publics.GenerateArrayUtil;
import publics.TimeComplexity;

import java.util.Arrays;

import static publics.SwapUtil.swap;

public class BubbleSort {
    public static void bubbleSort(int[] data){
        for (int i = 0; i < data.length -1 ; i++) {
            for (int j = 0; j < data.length -1 - i; j++) {
                if (data[j]>data[j+1]) {
                    swap(data,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 1000;
        int[] data = GenerateArrayUtil.random(n);
        bubbleSort(data);
        TimeComplexity.computeAndIsSorted(BubbleSort.class,data,n);
    }
}
