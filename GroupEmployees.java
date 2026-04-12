package Package3.Map.MapInterface.GroupEmployees;

import java.util.*;

public class GroupEmployees {

    public static Map<String, List<Employee>> groupByDept(List<Employee> employees) {

        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            map.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }

        return map;
    }

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> result = groupByDept(list);

        for (String dept : result.keySet()) {
            System.out.println(dept + ": " + result.get(dept));
        }
    }
}
