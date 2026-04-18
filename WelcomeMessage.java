package StreamAPI;

import java.util.*;

public class WelcomeMessage {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Suhani", "Ravi", "Ankit");

        attendees.forEach(name ->
                System.out.println("Welcome " + name + "!")
        );
    }
}
