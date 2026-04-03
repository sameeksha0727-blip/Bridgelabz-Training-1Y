public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double value = 45.67;

        double d = value;      // auto-unboxing
        int i = (int) d;       // casting

        System.out.println("Double value = " + d);
        System.out.println("Int value = " + i);
    }
}
