package com.gla.level3;

public class FactorsProgram {

    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;

        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;

        return f;
    }

    public static int greatest(int[] f) {
        int max = f[0];
        for (int x : f) if (x > max) max = x;
        return max;
    }

    public static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    public static long product(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    public static double productCube(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] f = getFactors(n);

        System.out.println("Greatest: " + greatest(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of cubes: " + productCube(f));
    }
}

