package search;

public class LinearSearch {
    public static int find(int[] data, int target) {
        if (data.length == 0) return -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
