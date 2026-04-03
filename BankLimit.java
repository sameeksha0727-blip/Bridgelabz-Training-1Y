public class BankLimit {

    public static double getRemainingLimit(Double limit, double used) {

        if (limit == null) {
            return 0.0;
        }

        return limit - used;
    }

    public static void main(String[] args) {

        Double limit1 = 5000.0;
        Double limit2 = null;

        System.out.println(getRemainingLimit(limit1, 1200));
        System.out.println(getRemainingLimit(limit2, 1200));
    }
}
