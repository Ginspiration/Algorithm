package publics;


public class Test {
    public static void main(String[] args) {
        int n=100000;

        int[] data = GenerateArrayUtil.random(n);
        TimeComplexity.computeAndIsSorted("MergeSort",data,n);

        data = GenerateArrayUtil.random(n, n);
        TimeComplexity.computeAndIsSorted("QuickSort",data,n);

        int[] data2 = GenerateArrayUtil.quickSort_nn_Error(n);
        TimeComplexity.computeAndIsSorted("QuickSort",data2,n);
    }
}