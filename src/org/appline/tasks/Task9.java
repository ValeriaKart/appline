package org.appline.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        double[] array = inputArray();
        double mathMean = mathMean(array);
        System.out.println("Вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое:");
        for(int i = 0; i < array.length; i++){
            System.out.print((array[i] * mathMean) + " ");
        }
    }

    private static double[] inputArray () {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива (целое положительное число):");
        int length = input.nextInt();
        double[] array = new double[length];
        System.out.println("Пожалуйста, введите по порядку слева направо элементы массива:");
        for(int i = 0; i < length; i++) {
            array[i] = input.nextDouble();
        }
        return array;
    }

    private static double mathMean(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
        }
        double mathMean = sum / array.length;
        return mathMean;
    }
}
