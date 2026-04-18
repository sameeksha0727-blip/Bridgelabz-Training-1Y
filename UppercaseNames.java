package LamdaExpresison;

import java.util.*;
import java.util.stream.*;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Suhani", "Ravi", "Ankit");

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upper.forEach(System.out::println);
    }
}
