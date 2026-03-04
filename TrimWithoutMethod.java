package com.gla.level2;

import java.util.Scanner;

public class TrimWithoutMethod {

    public static String trimText(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ')
            start++;

        while (text.charAt(end) == ' ')
            end--;

        return text.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String userTrim = trimText(text);
        String builtInTrim = text.trim();

        System.out.println("User Trim: " + userTrim);
        System.out.println("Built-in Trim: " + builtInTrim);
        System.out.println("Are Equal? " + userTrim.equals(builtInTrim));

        sc.close();
    }
}
