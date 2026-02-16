package com.gla.level3;

public class NumberChecker2 {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            d[i] = s.charAt(i) - '0';
        }
        return d;
    }

    public static boolean isDuck(int[] d) {
        for (int x : d) if (x == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] d) {
        int power = d.length;
        int sum = 0;
        for (int x : d) sum += Math.pow(x, power);
        return sum == n;
    }

    public static void largestSecondLargest(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }
        System.out.println("Largest: " + max1 + ", Second Largest: " + max2);
    }

    public static void smallestSecondSmallest(int[] d) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1) {
                min2 = x;
            }
        }
        System.out.println("Smallest: " + min1 + ", Second Smallest: " + min2);
    }

    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);

        System.out.println("Digit count: " + countDigits(n));
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(n, d));
        largestSecondLargest(d);
        smallestSecondSmallest(d);
    }
}

