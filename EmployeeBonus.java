package com.gla.level3;

import java.util.Random;

public class EmployeeBonus {

    public static int[][] generateData() {
        Random r = new Random();
        int[][] data = new int[10][2]; // [salary, years]
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + r.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + r.nextInt(10); // years of service
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][2]; // [newSalary, bonus]
        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void display(int[][] oldData, double[][] newData) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;

        System.out.println("Emp\tOldSal\tYears\tBonus\tNewSal");
        for (int i = 0; i < 10; i++) {
            sumOld += oldData[i][0];
            sumNew += newData[i][0];
            sumBonus += newData[i][1];

            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\n",
                    i+1, oldData[i][0], oldData[i][1], newData[i][1], newData[i][0]);
        }

        System.out.println("Total Old Salary: " + sumOld);
        System.out.println("Total Bonus: " + sumBonus);
        System.out.println("Total New Salary: " + sumNew);
    }

    public static void main(String[] args) {
        int[][] data = generateData();
        double[][] result = calculateBonus(data);
        display(data, result);
    }
}

