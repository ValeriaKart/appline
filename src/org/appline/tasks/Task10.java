package org.appline.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        double[][] matrix = inputMatrix();
        printFirstRowX3(matrix);
    }

    private static double[][] inputMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, количество строк:");
        int rows = input.nextInt();
        System.out.println("Введите, пожалуйста, количество столбцов:");
        int columns = input.nextInt();
        double[][] matrix = new double[rows][columns];
        System.out.println("Введите " + (rows * columns) + " элементов, начиная с первой строки первого столбца слева направо сверху вниз:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    private static void printFirstRowX3(double[][] matrix) {
        System.out.println("Вывод первой строки матрицы, где каждый элемент умножен на 3:");
        for (double val : matrix[0]) {
            System.out.print((val * 3) + " ");
        }
    }
}
