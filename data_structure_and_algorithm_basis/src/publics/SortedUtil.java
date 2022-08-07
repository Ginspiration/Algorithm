package publics;

import java.util.Arrays;

public class SortedUtil {
    /**
     * @param condition 1是否打印,2是否逆序,为空则不打印,不逆序
     */
    public static void isSorted(int[] data, boolean... condition) {
        boolean ifReverse = false;
        boolean ifPrint = false;
        if (condition.length == 1) {
            ifPrint = condition[0];
        } else if (condition.length == 2) {
            ifPrint = condition[0];
            ifReverse = condition[1];
        }

        if (ifPrint) {
            System.out.println("after sort data: " + Arrays.toString(data));
        }

        if (!ifReverse) {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    System.out.println("正序排序失败");
                    return;
                }
            }
            System.out.println("正序排序成功");
        } else {
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] < data[i + 1]) {
                    System.out.println("逆序排序失败");
                    return;
                }
            }
            System.out.println("逆序排序成功");
        }
    }
}
