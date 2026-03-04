package com.gla.level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate exception
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled!");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // Uncomment to generate exception
        // generateException(text);

        handleException(text);
        sc.close();
    }
}
