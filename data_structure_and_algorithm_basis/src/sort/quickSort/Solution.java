package sort.quickSort;

import publics.GenerateArrayUtil;

import java.util.Random;
import java.util.TreeSet;

class Solution {

    public static void main(String[] args) {
        int[] data = GenerateArrayUtil.random(10000000);
        Solution solution = new Solution();
        int kthLargest = solution.findKthLargest(data, 999);
        System.out.println(kthLargest);
    }

    /**
     * <a href="https://leetcode.cn/problems/kth-largest-element-in-an-array/">215. 数组中的第K个最大元素</a>
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        return quickSort(nums,0,nums.length-1,k);
    }

    private static int quickSort(int[] data, int left, int right,int k ) {
        if (left >= right) {
            return data[left];
        }
        int p = partition(data, left, right);
        if(k > p){
            return quickSort(data, p + 1, right,k);
        }else if(k < p){
            return quickSort(data, left, p - 1,k);
        }else{
            return data[p];
        }
    }

    private static int partition(int[] data, int start, int end) {



        // 确定枢轴元素
        int pivot = data[start];
        // 定义两个指针（引用），一个指向数组左端，一个指向数组右端
        int left = start;
        int right = end;
        while (left < right) {
            // 从右往左扫描，寻找比枢轴元素小的，并填入坑中
            while (left < right && data[right] >= pivot) {
                right--;
            }
            if (left < right) {
                data[left++] = data[right];
            }
            // 从左往右扫描，寻找比枢轴元素大的，并填入新坑中
            while (left < right && data[left] < pivot) {
                left++;
            }
            if (left < right) {
                data[right--] = data[left];
            }
        }
        //扫描完成后,将枢轴元素填入新坑中
        data[left] = pivot;
        return left;
    }
}