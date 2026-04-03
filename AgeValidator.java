public class AgeValidator {

    public static boolean isValidAge(String age) {
        try {
            int value = Integer.parseInt(age);

            if (value >= 18) {
                return true;
            } else {
                return false;
            }

        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isValidAge("20"));
        System.out.println(isValidAge("17"));
        System.out.println(isValidAge("abc"));
    }
}
