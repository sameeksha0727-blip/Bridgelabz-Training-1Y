package com.gla.package1;

import java.util.Scanner;

public class ArmstrongNormalRecursion {

        // Function to count digits using recursion
        static int countDigits(int n) {
            if (n == 0)
                return 0;
            return 1 + countDigits(n / 10);
        }

        // Function to calculate power using recursion
        static int power(int base, int exp) {
            if (exp == 0)
                return 1;
            return base * power(base, exp - 1);
        }

        // Function to calculate Armstrong sum using recursion
        static int armstrongSum(int n, int digits) {
            if (n == 0)
                return 0;

            int digit = n % 10;
            return power(digit, digits) + armstrongSum(n / 10, digits);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int digits = countDigits(num);
            int result = armstrongSum(num, digits);

            if (result == num)
                System.out.println(num + " is an Armstrong number");
            else
                System.out.println(num + " is NOT an Armstrong number");

            sc.close();
        }
}

