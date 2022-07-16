package publics;

import sort.mergeSort.MergeSort;
import sort.quickSort.QuickSort;

public class TimeComplexity {
    public static void computeAndIsSorted(String algorithmName, int[] data, int n) {
        long start = System.nanoTime();
//        if (algorithmName.equals("SelectSort")) {
//            SelectSort.fun(data);
//        }
//        if (algorithmName.equals("InsertSort1")) {
//            InsertSort.fun1(data);
//        }
//        if (algorithmName.equals("InsertSort2")) {
//            InsertSort.fun2(data);
//        }
//        if (algorithmName.equals("InsertSort3")) {
//            InsertSort.fun3(data);
//        }
        if (algorithmName.equals("MergeSort")) {
            MergeSort.sort(data);
        }
        if ("QuickSort".equals(algorithmName)) {
            QuickSort.sort(data);
        }

        long end = System.nanoTime();
        printInfo(algorithmName, data, n, start, end);
    }

    private static void printInfo(String algorithmName, int[] data, int n, long start, long end) {
        double second = (end - start) / 1000000000.0;
        char[] chars = String.valueOf(n).toCharArray();
        StringBuilder str = new StringBuilder(n);
        int flag = 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            str.append(chars[i]);
            if ( flag++ % 4 == 0) {
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
