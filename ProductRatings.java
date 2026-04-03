import java.util.ArrayList;
import java.util.Objects;

public class ProductRatings {
    public static void main(String[] args) {

        int[] oldRatings = {4, 5, 3};

        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5);
        newRatings.add(null);
        newRatings.add(4);

        ArrayList<Integer> allRatings = new ArrayList<>();

        for (int rating : oldRatings) {
            allRatings.add(rating);   // auto-boxing
        }

        allRatings.addAll(newRatings);

        int sum = 0;
        int count = 0;

        for (Integer rating : allRatings) {
            if (Objects.nonNull(rating)) {
                sum += rating;   // auto-unboxing
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average Rating = " + average);
    }
}
