package sort.bubbleSort;

import publics.GenerateArrayUtil;

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
        int[] data = GenerateArrayUtil.random(100000);
        bubbleSort(data);
        System.out.println(Arrays.toString(data));
    }
}
