package org.appline.tasks;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите, пожалуйста уравнение для решения без пробелов в данном формате:" +
                "\nВторой символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’." +
                "\nПервым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ " +
                "(на лат. раскладке клавиатуры, обозначает неизвестное) в любом порядке." +
                "\nНапример, x+5=7:");
        String str = input.nextLine();

        char a = str.charAt(0);
        char op = str.charAt(1);
        char b = str.charAt(2);
        char eq = str.charAt(3);
        char c = str.charAt(4);

        if (str.length() == 5 && eq == '=') {
            int num1, num2;
            if (a == 'x' && Character.isDigit(b) && Character.isDigit(c)) {
                num1 = Character.getNumericValue(b);
                num2 = Character.getNumericValue(c);
                if (op == '-') {
                    num1 = -num1;
                }
                System.out.println("x = " + (num2 - num1));
            } else if (b == 'x' && Character.isDigit(a) && Character.isDigit(c)) {
                num1 = Character.getNumericValue(a);
                num2 = Character.getNumericValue(c);
                if (op == '-') {
                    num1 = -num1;
                    num2 = -num2;
                }
                System.out.println("x = " + (num2 - num1));
            } else if (c == 'x' && Character.isDigit(a) && Character.isDigit(b)) {
                num1 = Character.getNumericValue(a);
                num2 = Character.getNumericValue(b);
                if (op == '-') {
                    num2 = -num2;
                }
                System.out.println("x = " + (num1 + num2));
            } else {
                System.out.println("Уравнение не по формату.");
            }
        }
    }
}
