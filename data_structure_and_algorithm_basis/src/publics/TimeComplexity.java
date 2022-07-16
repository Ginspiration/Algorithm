package publics;

import sort.mergeSort.MergeSort;
import sort.quickSort.QuickSort;

public class TimeComplexity {

    public static <T> void computeAndIsSorted(Class<T> classType, int[] data, int n) {
        String classTypeSimpleName = classType.getSimpleName();
        long start = System.nanoTime();
        if (MergeSort.class.getSimpleName().equals(classTypeSimpleName)) {
            MergeSort.sort(data);
        }
        if (QuickSort.class.getSimpleName().equals(classTypeSimpleName)) {
            QuickSort.sort(data);
        }
        long end = System.nanoTime();
        printInfo(classTypeSimpleName, data, n, start, end);
    }

    private static void printInfo(String algorithmName, int[] data, int n, long start, long end) {
        double second = (end - start) / 1000000000.0;
        char[] chars = String.valueOf(n).toCharArray();
        StringBuilder str = new StringBuilder(n);
        int flag = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            str.append(chars[i]);
            if (flag++ % 4 == 0) {
                str.append("_");
            }
        }
        if (str.lastIndexOf("_") == str.length() - 1) {
            str.deleteCharAt(str.length() - 1);
        }
        System.out.printf("%s,n=%s,spendTime:%fs ", algorithmName, str.reverse(), second);
        SortedUtil.isSorted(data);
    }
}
