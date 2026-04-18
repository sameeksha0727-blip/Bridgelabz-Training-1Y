package StreamAPI;

import java.util.*;

public class NameTransform {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Suhani", "Ravi", "Ankit");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
