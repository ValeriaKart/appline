package org.appline.tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        String firstInput = input.next();

        System.out.println("Введите второе целое число:");
        String secondInput = input.next();
        int secondNum = Integer.parseInt(secondInput);

        int firstNum = Integer.parseInt(firstInput);

        if (firstNum == secondNum) {
            System.out.println("Числа равны.");
        } else if(firstNum > secondNum) {
            System.out.println("Большее число: " + firstNum + "\nМеньшее число: " + (double) secondNum);
        }
        else {
            System.out.println("Большее число: " + secondNum + "\nМеньшее число: " + (double) firstNum);
        }


    }
}
