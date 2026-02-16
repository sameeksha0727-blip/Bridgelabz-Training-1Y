package com.gla.level3;

import java.util.Arrays;

public class NumberChecker4 {

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean isPalindrome(int[] d) {
        return Arrays.equals(d, reverse(d));
    }

    public static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 121;
        int[] d = getDigits(n);

        System.out.println("Palindrome: " + isPalindrome(d));
        System.out.println("Duck: " + isDuck(d));
    }
}

