package org.appline.tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите положительное целое число:");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Сумма всех нечетных чисел от 1 до " + number + ": " + sum(number));
        } else {
            System.out.println("Введенное Вами число отрицательное. Пожалуйста, в следующей попытке введите положительное целое число.");
        }
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if ((i % 2) != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
