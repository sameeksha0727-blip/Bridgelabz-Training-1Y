package Package3.Map;

import java.util.*;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Map<String, Double> grades = new HashMap<>();

        grades.put("Aman", 85.5);
        grades.put("Riya", 90.0);
        grades.put("Raj", 78.0);

        grades.put("Raj", 82.0);

        grades.remove("Aman");

        System.out.println("Student Grades (Sorted):");

        Map<String, Double> sortedMap = new TreeMap<>(grades);

        for (Map.Entry<String, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
