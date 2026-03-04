package com.gla.level3;

import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    public static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found)
                temp[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueChars(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);

        System.out.println("Char\tFrequency");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);

        sc.close();
    }
}
