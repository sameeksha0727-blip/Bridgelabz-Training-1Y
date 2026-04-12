package Package3.Map;

import java.util.*;

public class ExamResults {

    public static void main(String[] args) {

        Map<String, Map<String, Integer>> data = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("Aman", 85);
        math.put("Riya", 95);
        math.put("Raj", 78);

        Map<String, Integer> science = new HashMap<>();
        science.put("Aman", 88);
        science.put("Riya", 91);
        science.put("Raj", 93);

        data.put("Math", math);
        data.put("Science", science);

        System.out.println("Topper per Subject:");
        for (String subject : data.keySet()) {

            Map<String, Integer> marks = data.get(subject);

            String topper = null;
            int max = 0;

            for (Map.Entry<String, Integer> e : marks.entrySet()) {
                if (e.getValue() > max) {
                    max = e.getValue();
                    topper = e.getKey();
                }
            }

            System.out.println(subject + " -> " + topper + " (" + max + ")");
        }

        System.out.println("\nAverage Marks:");
        for (String subject : data.keySet()) {

            Map<String, Integer> marks = data.get(subject);

            int sum = 0;
            for (int m : marks.values()) {
                sum += m;
            }

            double avg = (double) sum / marks.size();
            System.out.println(subject + " : " + avg);
        }

        System.out.println("\nSubjects with marks > 90:");
        for (String subject : data.keySet()) {

            for (int m : data.get(subject).values()) {
                if (m > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }
}
