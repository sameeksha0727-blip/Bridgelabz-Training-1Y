package LamdaExpresison;

import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String toString() {
        return message + " (" + type + ")";
    }
}

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Heart rate high", "CRITICAL"),
                new Alert("Appointment reminder", "NORMAL"),
                new Alert("Low BP warning", "CRITICAL")
        );

        Predicate<Alert> criticalFilter = a -> a.type.equals("CRITICAL");

        alerts.stream()
                .filter(criticalFilter)
                .forEach(System.out::println);
    }
}
