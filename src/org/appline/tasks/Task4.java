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

        System.out.println("Среднее арифретическое трех введенных чисел = " + avgSum);

    }



    }



