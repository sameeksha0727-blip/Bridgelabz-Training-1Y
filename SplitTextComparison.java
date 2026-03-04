package com.gla.level2;

import java.util.Scanner;

public class SplitTextComparison {

    public static String[] splitText(String text) {
        int words = 1;
        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ')
                    words++;
            } catch (Exception e) {
                break;
            }
        }

        String[] result = new String[words];
        int start = 0, index = 0;

        for (int i = 0; ; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    result[index++] = text.substring(start, i);
                    start = i + 1;
                }
            } catch (Exception e) {
                result[index] = text.substring(start);
                break;
            }
        }
        return result;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Are both arrays equal? " + compareArrays(userSplit, builtInSplit));
        sc.close();
    }
}
