package Package3.Map;

import java.util.*;

public class EmployeeSalary {

    public static void main(String[] args) {

        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Aman", 30000.0);
        salaries.put("Riya", 40000.0);
        salaries.put("Raj", 35000.0);
        salaries.put("Simran", 50000.0);
        salaries.put("Karan", 45000.0);
        salaries.put("Neha", 50000.0);

        String emp = "Raj";
        double percent = 10;

        if (salaries.containsKey(emp)) {
            double newSalary = salaries.get(emp) * (1 + percent / 100);
            salaries.put(emp, newSalary);
        } else {
            System.out.println("Employee not found");
        }

        double total = 0;
        for (double s : salaries.values()) {
            total += s;
        }
        double avg = total / salaries.size();

        System.out.println("Average Salary: " + avg);

        double max = Collections.max(salaries.values());

        System.out.println("Highest Paid Employees:");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
