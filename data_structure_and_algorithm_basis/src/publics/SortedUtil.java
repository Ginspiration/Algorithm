package publics;

public class SortedUtil {
    public static void isSorted(int[] data){
        for (int i = 0; i < data.length-1; i++) {
            if(data[i]>data[i+1]) {
                System.out.println("排序失败!");
                return;
            }
        }
        System.out.println("排序成功");
    }
}
