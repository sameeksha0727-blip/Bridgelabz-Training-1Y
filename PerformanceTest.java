package Package2.Collections.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PerformanceTest {

    public static void testPerformance(Set<Policy> set, String name) {
        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            set.add(new Policy(i, "User" + i,
                    LocalDate.now().plusDays(i % 100),
                    "Health", 1000));
        }
        end = System.nanoTime();
        System.out.println(name + " Add Time: " + (end - start));

        Policy search = new Policy(5000, "User5000",
                LocalDate.now(), "Health", 1000);

        start = System.nanoTime();
        set.contains(search);
        end = System.nanoTime();
        System.out.println(name + " Search Time: " + (end - start));

        start = System.nanoTime();
        set.remove(search);
        end = System.nanoTime();
        System.out.println(name + " Remove Time: " + (end - start));
    }
}
