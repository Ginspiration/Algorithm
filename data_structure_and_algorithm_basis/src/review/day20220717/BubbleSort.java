package review.day20220717;

import publics.GenerateArrayUtil;
import publics.SortedUtil;

import static publics.SwapUtil.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(10,true);
        sort(data);
        SortedUtil.isSorted(data,true,true);
    }
    public static void sort(int[] data){
        for (int i = 0; i < data.length -1 ; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j]<data[j+1]) swap(data,j,j+1);
            }
        }
    }
}
