package Package3.Map;

import java.util.*;

public class AttendanceTracker {

    public static void main(String[] args) {

        Map<String, Integer> attendance = new HashMap<>();

        String[] students = {"Aman", "Riya", "Raj", "Simran", "Karan"};

        for (String s : students) {
            attendance.put(s, 0);
        }

        String[][] dailyAttendance = {
                {"Aman", "Riya"},
                {"Raj", "Simran"},
                {"Aman", "Karan"},
                {"Aman", "Riya", "Raj"},
                {"Simran"},
                {"Aman", "Raj"},
                {"Riya", "Karan"},
                {"Aman"},
                {"Raj"},
                {"Simran", "Karan"},
                {"Aman", "Riya"},
                {"Raj"},
                {"Aman", "Simran"},
                {"Karan"},
                {"Aman", "Raj"}
        };

        for (String[] day : dailyAttendance) {
            for (String student : day) {
                attendance.put(student, attendance.get(student) + 1);
            }
        }

        System.out.println("Attendance:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nUnder-attending students:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < 10) {
                System.out.println(entry.getKey());
            }
        }
    }
}
