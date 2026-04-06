package package2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main <K> {

    public <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static <T extends Number> void printNumbers(List<T> list) {
        for (T num : list) {
            System.out.println(num);
        }
    }

    public static void printNumbersWildcard(List<? extends Number> list) {
        // list.add(28)
        List<? extends Number> list2 = new ArrayList<Integer>();
        // list.add(3.14)
        List<? super Number> list3 = new ArrayList<Object>();
        list3.add(42);
        list3.add(3.14);
        System.out.println(list3);

        // list<T super Number> list4 = new ArrayList<Object>();

        for (Number num : list) {
            System.out.println(num.doubleValue());
        }
    }
}


























