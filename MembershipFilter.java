package StreamAPI;

import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }

    public String toString() {
        return name + " | Expiry: " + expiry;
    }
}

public class MembershipFilter {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("A", LocalDate.now().plusDays(10)),
                new Member("B", LocalDate.now().plusDays(40)),
                new Member("C", LocalDate.now().plusDays(20))
        );

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        members.stream()
                .filter(m -> !m.expiry.isBefore(today) && !m.expiry.isAfter(limit))
                .forEach(System.out::println);
    }
}
