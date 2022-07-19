package publics;

import sort.bubbleSort.BubbleSort;
import sort.insertSort.InsertSort;
import sort.mergeSort.MergeSort;
import sort.quickSort.QuickSort;

import java.lang.reflect.Method;

public class TimeComplexity {

    public static <T> void computeAndIsSorted(Class<T> classType, int[] data, int n ) {
        computeAndIsSorted(classType,data,n,"");
    }

    public static <T> void computeAndIsSorted(Class<T> classType, int[] data, int n , String message ) {
        String classSimpleName = classType.getSimpleName();
        long start = System.nanoTime();
        if (MergeSort.class.getSimpleName().equals(classSimpleName)) {
            MergeSort.sort(data);
        }
        if (QuickSort.class.getSimpleName().equals(classSimpleName)) {
            QuickSort.sort(data);
        }
        if (BubbleSort.class.getSimpleName().equals(classSimpleName)){
            BubbleSort.sort(data);
        }
        if (InsertSort.class.getSimpleName().equals(classSimpleName)){
            InsertSort.sort(data);
        }
        long end = System.nanoTime();
        printInfo(classSimpleName, data, n, start, end , message);
    }

    private static void printInfo(String algorithmName, int[] data, int n, long start, long end , String message) {
        long nanoSecond = end - start;
        double second = nanoSecond / 1000000000.0;
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
        System.out.printf("%s,n=%s%s,spendTime:%fs(%dns)", algorithmName, str.reverse(), "("+message+")",second,nanoSecond);
        SortedUtil.isSorted(data);
    }
}
