package Package3.Map;

import java.util.*;

public class CourseRegistration {

    public static void main(String[] args) {

        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("CS102", 52);
        courses.put("CS103", 3);
        courses.put("CS104", 60);
        courses.put("CS105", 10);

        String course = "CS101";

        courses.put(course, courses.getOrDefault(course, 0) + 1);

        int count = courses.get(course);
        if (count > 0) {
            courses.put(course, count - 1);
        }

        System.out.println("Near Full Courses:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() >= 50) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        System.out.println("\nUnder-subscribed Courses:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
