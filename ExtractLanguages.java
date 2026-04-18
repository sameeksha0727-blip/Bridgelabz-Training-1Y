import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, JavaScript, Go";

        Matcher m = Pattern.compile("Java|Python|JavaScript|Go").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
