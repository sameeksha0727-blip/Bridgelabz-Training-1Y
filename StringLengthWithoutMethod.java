package com.gla.level2;

import java.util.Scanner;

public class StringLengthWithoutMethod {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("User Defined Length: " + userLength);
        System.out.println("Built-in Length: " + builtInLength);

        sc.close();
    }
}
