package com.gla.level3;

public class NumberChecker3 {

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int sumDigits(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    public static int sumSquares(int[] d) {
        int s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    public static boolean isHarshad(int n, int[] d) {
        return n % sumDigits(d) == 0;
    }

    public static void frequency(int[] d) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;

        for (int x : d) freq[x][1]++;

        System.out.println("Digit  Frequency");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + "      " + freq[i][1]);
        }
    }

    public static void main(String[] args) {
        int n = 21;
        int[] d = getDigits(n);

        System.out.println("Sum digits: " + sumDigits(d));
        System.out.println("Sum squares: " + sumSquares(d));
        System.out.println("Harshad: " + isHarshad(n, d));
        frequency(d);
    }
}

