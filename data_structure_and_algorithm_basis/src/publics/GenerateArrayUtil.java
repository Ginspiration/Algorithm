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
        return random(n, n);
    }

    public static int[] random(int n, boolean ifPrintData) {
        int[] data = random(n, n);
        if (ifPrintData)
            System.out.println("source data: " + Arrays.toString(data));
        return data;
    }

    public static int[] sorted(int max, int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = i;
        }
        return res;
    }

    public static int[] sorted(int n) {
        return sorted(n, n);
    }

    /**
     * 234, 2, 23, 51,1, 53, 123, 3123, 41, 1,3,436,1,1,1
     *
     * @return int[] data
     */
    public static int[] staticData() {
        return new int[]{234, 2, 23, 51, 1, 53, 123, 3123, 41, 1, 3, 436, 1, 1, 1};
    }

    /**生成值一样的数组*/
    public static int[] same(int n){
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = 0;
        }
        return data;
    }
}
