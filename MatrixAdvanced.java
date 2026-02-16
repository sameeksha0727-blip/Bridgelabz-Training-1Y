package com.gla.level3;

import java.util.Random;

public class MatrixAdvanced {

    public static double[][] randomMatrix(int n) {
        Random r = new Random();
        double[][] m = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = r.nextInt(10);
        return m;
    }

    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    public static double det2x2(double[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double det3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = det2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;
        return inv;
    }

    public static void print(double[][] m) {
        for (double[] row : m) {
            for (double x : row) System.out.printf("%.2f ", x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] A = randomMatrix(2);
        System.out.println("Matrix A:");
        print(A);

        System.out.println("Transpose:");
        print(transpose(A));

        System.out.println("Determinant 2x2: " + det2x2(A));

        System.out.println("Inverse 2x2:");
        print(inverse2x2(A));
    }
}
