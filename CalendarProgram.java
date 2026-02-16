package com.gla.level3;

import java.util.Scanner;

public class CalendarProgram {

    static String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };

    static int[] daysInMonth = {
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month - 1];
    }

    // Zeller's Congruence / Gregorian approach (simplified)
    public static int getFirstDay(int month, int year) {
        int d = 1;
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int day = (d + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        return (day + 6) % 7; // convert to 0=Sunday
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int days = getDays(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
    }
}

