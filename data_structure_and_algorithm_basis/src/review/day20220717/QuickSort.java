package review.day20220717;

import publics.GenerateArrayUtil;
import publics.SortedUtil;
import publics.TimeComplexity;

import java.util.Random;

import static publics.SwapUtil.swap;

public class QuickSort {

    public static void sort(int[] data) {
        quickSort(data,0,data.length-1);
    }

    public static void quickSort(int[] data, int left, int right) {
            if (left>=right)
                return;
        int p = partition(data, left, right);
        quickSort(data,left,p-1);
        quickSort(data,p+1,right);
    }

    public static int partition(int[] data, int left, int right) {
        //生成一个随机下标和p位置交换
        int randomP = new Random().nextInt(right - left) + left;//生成一个随机下标
        swap(data,randomP,left);

        //从小到大排序
        //以left为空槽p
        int p = data[left];
        //循环遍历，直到遍历结束，结束条件：left>=right,反过来就是 left<right为true
        while (left < right) {
            //从右往左边遍历,找出小于p的值x
            while (left < right && data[right] > p)
                right--;
            //将x填入p所在位置,这时x所在位置为空槽,同时left++
            if (left < right)
                data[left++] = data[right];
            //从左往右遍历,找出大于p的值y
            while (left < right && data[left] < p)
                left++;
            //将y填入x所在位置,这时y所在位置为空槽,同时right--
            if (left < right)
                data[right--] = data[left];
        }
        data[left] = p;
        return left;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] data = GenerateArrayUtil.random(n, true);
        sort(data);
        SortedUtil.isSorted(data,true);
    }
}