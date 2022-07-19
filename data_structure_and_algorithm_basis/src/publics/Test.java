package publics;


import sort.insertSort.InsertSort;
import sort.mergeSort.MergeSort;
import sort.quickSort.QuickSort;

public class Test {
    public static void main(String[] args) {
        //extracted();
        extracted1();
    }

    private static void extracted1() {
        int n = 15;

        int[] data2 = GenerateArrayUtil.sorted(n);
        TimeComplexity.computeAndIsSorted(MergeSort.class,data2,n,"sorted");
        TimeComplexity.computeAndIsSorted(QuickSort.class,data2,n,"sorted");
        TimeComplexity.computeAndIsSorted(InsertSort.class,data2,n,"sorted");


        int[] ns = {
                15,
                1000,
                10000,
                100000,
                1000000,
                10000000,
                100000000,
                1000000000
        };
        int[] data;
        for (int i : ns) {
            System.out.println();
            data = GenerateArrayUtil.random(i);
            TimeComplexity.computeAndIsSorted(MergeSort.class,data,i,"unsorted");
            data = GenerateArrayUtil.random(i);
            TimeComplexity.computeAndIsSorted(QuickSort.class,data,i,"unsorted");
        }
    }

    private static void extracted() {
        int n=100000;

        int[] data = GenerateArrayUtil.random(n);
        TimeComplexity.computeAndIsSorted(MergeSort.class,data,n);

        data = GenerateArrayUtil.random(n, n);
        TimeComplexity.computeAndIsSorted(QuickSort.class,data,n);
    }
}