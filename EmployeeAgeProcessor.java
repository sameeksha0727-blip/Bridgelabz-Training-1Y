import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAgeProcessor {
    public static void main(String[] args) {

        int[] ages = {22, 45, 18, 31, 50};

        ArrayList<Integer> ageList = new ArrayList<>();

        for (int age : ages) {
            ageList.add(age);   // auto-boxing
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Youngest Age = " + youngest);
        System.out.println("Oldest Age = " + oldest);
    }
}
