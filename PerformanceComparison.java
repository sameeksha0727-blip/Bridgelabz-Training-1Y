import java.util.ArrayList;

public class PerformanceComparison {
    public static void main(String[] args) {

        // ArrayList<Integer>
        long start1 = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);   // auto-boxing
        }

        long sum1 = 0;

        for (Integer num : list) {
            sum1 += num;   // auto-unboxing
        }

        long end1 = System.currentTimeMillis();

        // int[]
        long start2 = System.currentTimeMillis();

        int[] arr = new int[1000000];

        for (int i = 0; i < 1000000; i++) {
            arr[i] = i;
        }

        long sum2 = 0;

        for (int num : arr) {
            sum2 += num;
        }

        long end2 = System.currentTimeMillis();

        System.out.println("ArrayList<Integer> Sum = " + sum1);
        System.out.println("ArrayList<Integer> Time = " + (end1 - start1) + " ms");

        System.out.println("int[] Sum = " + sum2);
        System.out.println("int[] Time = " + (end2 - start2) + " ms");
    }
}
