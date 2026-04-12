package Package3.Map;

import java.util.*;

public class EmployeeDepartment {

    public static void main(String[] args) {

        Map<Integer, String> empDept = new HashMap<>();

        empDept.put(1, "HR");
        empDept.put(2, "IT");
        empDept.put(3, "HR");
        empDept.put(4, "Finance");
        empDept.put(5, "IT");

        empDept.put(3, "IT");

        System.out.println("Employees in IT:");
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            if (e.getValue().equals("IT")) {
                System.out.println("EmpID: " + e.getKey());
            }
        }

        Map<String, Integer> deptCount = new HashMap<>();

        for (String dept : empDept.values()) {
            deptCount.put(dept, deptCount.getOrDefault(dept, 0) + 1);
        }

        System.out.println("\nEmployees per Department:");
        deptCount.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
