import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {

        Predicate<Double> isHighTemp = temp -> temp > 40;

        System.out.println(isHighTemp.test(35.0));
        System.out.println(isHighTemp.test(45.0));
    }
}
