package sort.insertSort;

/**
 * O(n2)
 */
public class InsertSort {
    public static void sortOrdinary(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                //是否小于前置数
                if (data[j] < data[j - 1]) {
                    //交换位置
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    /**
     * 优化
     *
     * @param data
     */
    public static void sort(int[] data) {
        sort(data,0, data.length -1);
    }
    public static void sort(int[] data,int left , int right) {
        for (int i = left; i <= right; i++) {
            int min = data[i];
            int j;
            //            for (int j = i; j >= 0; j--) { 这种方式无论如何复杂度都是O(n^2)
            //                if (min < data[j]) {
            //                    data[j + 1] = data[j];
            //                    minIndex = j;
            //                }
            //            }
            for (j = i; j - 1 >= left && min < data[j - 1]; j--) {//在极端情况下,即数组本来就是有序的,在循环条件为与(&&)的情况下,时间复杂度会变为O(n)
                data[j] = data[j - 1];
            }
            data[j] = min;
        }
    }
}
