package com.gla.level3;

import java.util.Random;
import java.util.Scanner;

public class StudentMarks {

    public static int[][] generateMarks(int n) {
        Random r = new Random();
        int[][] m = new int[n][3];
        for (int i = 0; i < n; i++) {
            m[i][0] = 10 + r.nextInt(90);
            m[i][1] = 10 + r.nextInt(90);
            m[i][2] = 10 + r.nextInt(90);
        }
        return m;
    }

    public static double[][] calculate(int[][] m) {
        int n = m.length;
        double[][] res = new double[n][3]; // total, avg, percent
        for (int i = 0; i < n; i++) {
            int total = m[i][0] + m[i][1] + m[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;

            res[i][0] = total;
            res[i][1] = Math.round(avg * 100) / 100.0;
            res[i][2] = Math.round(percent * 100) / 100.0;
        }
        return res;
    }

    public static void display(int[][] m, double[][] r) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i][0]+"\t"+m[i][1]+"\t"+m[i][2]+"\t"+
                    r[i][0]+"\t"+r[i][1]+"\t"+r[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculate(marks);
        display(marks, result);
    }
}

