package Package2.Collections.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    public void displayAll() {
        System.out.println("All Policies (HashSet):");
        for (Policy p : hashSet) {
            System.out.println(p);
        }
    }

    public void expiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        System.out.println("\nPolicies Expiring Soon:");
        for (Policy p : hashSet) {
            if (!p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    public void filterByType(String type) {
        System.out.println("\nPolicies with Coverage: " + type);
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    public void findDuplicates(List<Policy> list) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Policy p : list) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }

        System.out.println("\nDuplicate Policy Numbers: " + duplicates);
    }

    public void displaySetTypes() {
        System.out.println("\nLinkedHashSet (Insertion Order):");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\nTreeSet (Sorted by Expiry Date):");
        treeSet.forEach(System.out::println);
    }
}
