package com.gla.level1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = sumOfNaturalNumbers(n);
        System.out.println("Sum of " + n + " natural numbers = " + result);

        sc.close();
    }
}
