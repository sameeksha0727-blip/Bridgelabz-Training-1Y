import java.time.LocalDate;

public interface DateUtil {

    static String formatDate(LocalDate date) {
        return date.toString();
    }
}
