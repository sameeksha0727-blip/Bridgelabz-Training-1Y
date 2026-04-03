import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAgeProcessor2 {
    public static void main(String[] args) {

        int[] employeeAges = {24, 19, 42, 37, 55};

        ArrayList<Integer> list = new ArrayList<>();

        for (int age : employeeAges) {
            list.add(age);
        }

        System.out.println("Youngest Employee = " + Collections.min(list));
        System.out.println("Oldest Employee = " + Collections.max(list));
    }
}
