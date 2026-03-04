package com.gla.level1;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate exception
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled!");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in text form: ");
        String text = sc.next();

        // Uncomment to generate exception
        // generateException(text);

        handleException(text);
        sc.close();
    }
}
