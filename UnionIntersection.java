package Package2.Collections.SetInterface;

import java.util.*;

public class UnionIntersection {

    public static <T> void findUnionIntersection(Set<T> s1, Set<T> s2) {
        Set<T> union = new HashSet<>(s1);
        union.addAll(s2);

        Set<T> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 4, 5));

        findUnionIntersection(s1, s2);
    }
}
