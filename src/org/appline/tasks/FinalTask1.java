package org.appline.tasks;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, текущий курс доллара:");
        double dollarExchRate = input.nextDouble();
        System.out.println("Введите, пожалуйста, сумму в рублях:");
        double sumRub = input.nextDouble();

        int i = 0;
        while (dollarExchRate <= 0 || sumRub <= 0) {
            System.out.println("Оба значения должны быть положительными. Введите оба значения еще раз:");
             dollarExchRate = input.nextDouble();
             sumRub = input.nextDouble();
            i++;
        }
        double sumDollars = sumRub / dollarExchRate;
        System.out.printf("Итого: %.2f долларов", sumDollars);
    }

}

