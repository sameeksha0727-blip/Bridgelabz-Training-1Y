import java.util.function.Function;

public class StringLengthCheck {
    public static void main(String[] args) {

        Function<String, Integer> length = str -> str.length();

        System.out.println("Length: " + length.apply("Hello World"));
    }
}
