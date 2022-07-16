package review;

import publics.GenerateArrayUtil;

import java.util.Arrays;

public class QuickSort20220627 {
    public static void sort(int[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    public static void mergeSort(int[] data, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = partition(data, left, right);
        mergeSort(data, left, p - 1);
        mergeSort(data, p + 1, right);
    }

    public static int partition(int[] data, int left, int right) {
        int p = data[right];
        while (left < right) {
            //从左边向右边遍历,取出大于p的值，从right位置向左边依次覆盖
            while (left < right && data[left] < p)
                left++;
            if (left < right)
                data[right--] = data[left];
            //由右边向左边遍历,取出小于p的值，从right位置向左边依次覆盖
            while (left < right && data[right] > p)
                right--;
            if (left < right)
                data[left++] = data[right];
        }
        //将中间值赋给中间位置
        data[left] = p;
        return left;
    }

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(10);
        System.out.println(Arrays.toString(data));
        sort(data);
        System.out.println(Arrays.toString(data));
    }
}
