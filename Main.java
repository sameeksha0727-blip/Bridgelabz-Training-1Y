package Package2.Collections.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy(1, "Aman", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy(2, "Riya", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy(3, "Raj", LocalDate.now().plusDays(20), "Health", 7000);
        Policy p4 = new Policy(1, "Duplicate", LocalDate.now().plusDays(15), "Home", 4000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4);

        manager.displayAll();
        manager.expiringSoon();
        manager.filterByType("Health");
        manager.displaySetTypes();

        List<Policy> list = Arrays.asList(p1, p2, p3, p4);
        manager.findDuplicates(list);

        System.out.println("\n--- Performance Test ---");
        PerformanceTest.testPerformance(new HashSet<>(), "HashSet");
        PerformanceTest.testPerformance(new LinkedHashSet<>(), "LinkedHashSet");
        PerformanceTest.testPerformance(new TreeSet<>(), "TreeSet");
    }
}
