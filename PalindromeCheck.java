package com.gla.level3;

import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse & Compare
    public static String reverse(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--)
            rev += text.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + isPalindrome(text));
        System.out.println("Logic 2: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + text.equals(reverse(text)));

        sc.close();
    }
}
