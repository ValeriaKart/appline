package org.appline.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double x = input.nextDouble();

        System.out.println("Введите второе число:");
        double y = input.nextDouble();

        System.out.println("Введите третье число:");
        double z = input.nextDouble();

        double avgSum = (x + y + z) / 3;

        System.out.println("Среднее арифметическое трех введенных чисел = " + avgSum);

        double halfAvgSum = Math.floor(avgSum / 2);

        if(halfAvgSum > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}



