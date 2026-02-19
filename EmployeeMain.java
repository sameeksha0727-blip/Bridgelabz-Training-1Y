package employee;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(1, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(2, "Aman", 500, 40);

        employees.add(e1);
        employees.add(e2);

        for (Employee e : employees) {
            e.displayDetails();  // Polymorphism
        }
    }
}

