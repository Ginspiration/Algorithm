package publics;

import java.util.Arrays;

public class ArrayPrinter {
    public final static void print(int[] data) {
        System.out.println(Arrays.toString(data));
    }

    public final static void print(int[] data, Object flag) {
        System.out.println(Arrays.toString(data) + " " + flag);
    }
}
