import java.util.Scanner;

public class PalindromeChecker {

    static String getInput(Scanner sc) {
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    static void displayResult(boolean result) {
        if (result)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is not a Palindrome.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = getInput(sc);

        boolean result = isPalindrome(input);
        displayResult(result);

        sc.close();
    }
}
