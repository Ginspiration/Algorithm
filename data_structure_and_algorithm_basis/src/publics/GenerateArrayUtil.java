package publics;

import java.util.Arrays;

public class GenerateArrayUtil {
    /**
     * @param max    最大值（int）
     * @param length 长度
     * @return 随机数组
     */
    public static int[] random(int max, int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = (int) Math.round(Math.random() * max);
        }
        return res;
    }
    public static int[] random(int n) {
        return random(n,n);
    }
    public static int[] sorted(int max, int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = i;
        }
        return res;
    }
    public static int[] sorted(int n) {
        return sorted(n,n);
    }
    public static int[] quickSort_nn_Error(int n){
        int[] data = sorted(n);
        data[n/2] = data[0];
        return data;
    }
    public static int[] staticData() {
        return new int[] {234, 2, 23, 51,1, 53, 123, 3123, 41, 1,3,436,1,1,1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort_nn_Error(10)));
    }
}
