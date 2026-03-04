package com.gla.level3;

import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int firstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        System.out.println("\n   " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int first = firstDay(month, year);
        int numDays = days[month-1];

        if (month == 2 && isLeap(year))
            numDays = 29;

        for (int i = 0; i < first; i++)
            System.out.print("    ");

        for (int d = 1; d <= numDays; d++) {
            System.out.printf("%3d ", d);
            if ((d + first) % 7 == 0)
                System.out.println();
        }

        sc.close();
    }
}
