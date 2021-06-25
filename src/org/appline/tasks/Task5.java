package org.appline.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = input.nextDouble();

        System.out.println("Введите второе число:");
        double b = input.nextDouble();

        System.out.println("Введите символ соответствующей арифметической операции: +, -, *, /");
        char symbol = input.next().charAt(0);

        switch(symbol) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0){
                    System.out.println("На ноль делить нельзя!");
                }else{
                System.out.println(a / b);}

                break;
            default:
                System.out.println("Данная операция не поддерживается.");
                break;
        }

    }
}
