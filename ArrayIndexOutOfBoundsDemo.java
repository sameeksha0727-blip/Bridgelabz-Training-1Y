package com.gla.level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateException(String[] names) {
        System.out.println(names[names.length + 1]);
    }

    // Method to handle exception
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled!");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // Uncomment to generate exception
        // generateException(names);

        handleException(names);
        sc.close();
    }
}
