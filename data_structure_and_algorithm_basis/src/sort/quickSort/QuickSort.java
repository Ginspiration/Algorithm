package sort.quickSort;

import sort.insertSort.InsertSort;

public class QuickSort {

    public static void sort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private static void quickSort(int[] data, int left, int right) {
//        if (left >= right) { //QuickSort,n=100000000,spendTime:10.0430825s 排序成功
//            return;
//        }
        if (right - left <= 15) {//小规模数据量插入排序发快 QuickSort,n=100000000,spendTime:8.833512s排序成功
            InsertSort.sort(data,left,right);
            return;
        }
        int p = partitionPlus(data, left, right);
        quickSort(data, left, p - 1);
        quickSort(data, p + 1, right);
    }

    /**-------------------------------------------------------------------
     * 数据结构算法体系课
     * QuickSort,spendTime:10.1966425s 排序成功
     * @param data
     * @param left
     * @param right
     * @return
     */
    private static int partitionPlus(int[] data, int left, int right) {

//        int randomP = new Random().nextInt(right - left) + left;//生成一个随机下标
//        swap(data,randomP,left);

        int medianP = (left + right)/2;//取中间值
        swap(data,medianP,left);

        //指定随机一个中间值
        int p = data[left];
        int i = left; //小于p的那些值的右边界
        int j = left + 1;//依次向右边遍历
        while (j <= right) {
            if (data[j] < p) {
                swap(data,++i,j);
            }
            j++;
        }
        swap(data,left,i);
        return i;
    }
    /**
     * 交换
     */
    private static void swap(int[] data, int a ,int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    /**-------------------------------------------------------------------
     * 原理见png挖坑填数
     * QuickSort,spendTime:10.7414781s 排序成功
     * @param data
     * @param start
     * @param end
     * @return
     */
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
