import java.util.ArrayList;

public class PriceCollection {
    public static void main(String[] args) {

        double[] prices = {10.5, 20.0, 35.75, 5.5};

        ArrayList<Double> priceList = new ArrayList<>();

        for (double p : prices) {
            priceList.add(p);   // auto-boxing
        }

        double max = priceList.get(0);
        double sum = 0;

        for (Double p : priceList) {
            if (p > max) {
                max = p;
            }

            sum += p;
        }

        double average = sum / priceList.size();

        System.out.println("Highest price = " + max);
        System.out.println("Average price = " + average);
    }
}
