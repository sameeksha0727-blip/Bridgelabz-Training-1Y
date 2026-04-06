package com.gla.package1;

import java.util.Scanner;

public class ArmstrongTailRecursion {

    // Tail recursive function to count digits
    static int countDigits(int n, int count) {
        if (n == 0)
            return count;
        return countDigits(n / 10, count + 1);
    }

    // Tail recursive function to calculate power
    static int power(int base, int exp, int result) {
        if (exp == 0)
            return result;
        return power(base, exp - 1, result * base);
    }

    // Tail recursive function to calculate Armstrong sum
    static int armstrongSum(int n, int digits, int sum) {
        if (n == 0)
            return sum;

        int digit = n % 10;
        int value = power(digit, digits, 1);

        return armstrongSum(n / 10, digits, sum + value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digits = countDigits(num, 0);
        int result = armstrongSum(num, digits, 0);

        if (result == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is NOT an Armstrong number");

        sc.close();
    }
}
