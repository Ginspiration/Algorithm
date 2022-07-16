package sort.selectSort;

/**
 * O(n2)
 */
public class SelectSort {
    //正序
    public static void fun(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            //查找最小元素
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            //交换位置
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }
    //逆序
    public static void fun2(int[] data) {
        for (int i = data.length - 1; i >0; i--) {
            int maxIndex = i;
            //查找最小元素
            for (int j = i -1; j >= 0; j--) {
                if (data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            //交换位置
            int temp = data[i];
            data[i] = data[maxIndex];
            data[maxIndex] = temp;
        }
    }
}
