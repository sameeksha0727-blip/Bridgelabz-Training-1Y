import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0) {

            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial = " + factorial);

        } else {
            System.out.println("Enter a positive integer");
        }

        sc.close();
    }
}