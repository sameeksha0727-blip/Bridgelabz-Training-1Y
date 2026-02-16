package com.gla.level2;

import java.util.Scanner;

public class FactorsOfNumber {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int productOfFactors(int[] arr) {
        int product = 1;
        for (int x : arr) product *= x;
        return product;
    }

    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);

        System.out.print("Factors: ");
        for (int x : factors) System.out.print(x + " ");
        System.out.println();

        System.out.println("Sum = " + sumOfFactors(factors));
        System.out.println("Product = " + productOfFactors(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}

