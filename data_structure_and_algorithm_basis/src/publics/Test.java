package publics;


import sort.insertSort.InsertSort;
import sort.mergeSort.MergeSort;
import sort.quickSort.QuickSort;
import sort.quickSort.QuickSortThreeWay;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        int n = 500000;
        //extracted();
        //extracted1();
        //extracted2();
        //extracted(n);


    }

    private static void extracted(int n) {
        int[] data = GenerateArrayUtil.random(n);
        TimeComplexity.computeAndIsSorted(QuickSortThreeWay.class, data, n,"随机数组");

        data = GenerateArrayUtil.random(n);
        TimeComplexity.computeAndIsSorted(QuickSort.class, data, n,"随机数组");


        data = GenerateArrayUtil.same(n);
        TimeComplexity.computeAndIsSorted(QuickSortThreeWay.class, data, n,"一致数组");

        data = GenerateArrayUtil.same(n);
        TimeComplexity.computeAndIsSorted(QuickSort.class, data, n,"一致数组");

        //QuickSortThreeWay, n=50_0000(随机数组), spendTime:0.055944s(55944000ns) 正序排序成功
        //QuickSort, n=50_0000(随机数组), spendTime:0.049890s(49889700ns) 正序排序成功
        //QuickSortThreeWay, n=50_0000(一致数组), spendTime:0.000767s(766900ns) 正序排序成功
        //QuickSort, n=50_0000(一致数组), spendTime:25.414224s(25414224200ns) 正序排序成功
    }

    private static void extracted2() throws InterruptedException {
        String a2 = "aaa";
        String b2 = "bbb";

        System.out.println(a2.concat(b2));


        System.out.println(Integer.MAX_VALUE*2);
        System.out.println(Integer.MIN_VALUE*2);

        String a = "1231.3123";
        System.out.println(Arrays.toString(a.split("\\.")));

        Thread thread = new Thread(() -> {
            int i = 0;
            while (i<3){
                Thread thread1 = Thread.currentThread();
                System.out.println("inside"+thread1.isAlive());
                i++;
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("out"+thread.isAlive());
        TimeUnit.SECONDS.sleep(10);

        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("线程2执行开始。。。");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("线程2执行结束。。。");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("线程1执行开始。。。");
                thread2.join();
                System.out.println("线程1执行结束。。。");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread1.start();
        thread2.start();
    }

    private static void extracted1() {
        int n = 15;

        int[] data2 = GenerateArrayUtil.sorted(n);
        TimeComplexity.computeAndIsSorted(MergeSort.class, data2, n, "sorted");
        TimeComplexity.computeAndIsSorted(QuickSort.class, data2, n, "sorted");
        TimeComplexity.computeAndIsSorted(InsertSort.class, data2, n, "sorted");


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
            TimeComplexity.computeAndIsSorted(MergeSort.class, data, i, "unsorted");
            data = GenerateArrayUtil.random(i);
            TimeComplexity.computeAndIsSorted(QuickSort.class, data, i, "unsorted");
        }
    }

    private static void extracted() {
        int n = 100000;

        int[] data = GenerateArrayUtil.random(n);
        TimeComplexity.computeAndIsSorted(MergeSort.class, data, n);

        data = GenerateArrayUtil.random(n, n);
        TimeComplexity.computeAndIsSorted(QuickSort.class, data, n);
    }
}