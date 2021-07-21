package org.appline.tasks;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите, пожалуйста уравнение для решения без пробелов в данном формате:" +
                "\nВторой символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’." +
                "\nПервым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ " +
                "(на лат. раскладке клавиатуры, обозначает неизвестное) в любом порядке." +
                "\nНапример, x+5=7:");
        String str = input.nextLine();
        System.out.println(validateInputAndCompute(str));
    }

    private static boolean validateInputAndCompute(String input) {
        char a = input.charAt(0);
        char op = input.charAt(1);
        char b = input.charAt(2);
        char eq = input.charAt(3);
        char c = input.charAt(4);

        if (input.length() == 5 && eq == '=') {
            int num1, num2;
            if ((a == 'x' && Character.isDigit(b) && Character.isDigit(c))) {
                num1 = Character.getNumericValue(b);
                num2 = Character.getNumericValue(c);
                if (op == '+') {
                    num1 = -num1;
                }
            } else if (Character.isDigit(a) && b == 'x' && Character.isDigit(c)) {
                num1 = Character.getNumericValue(a);
                num2 = Character.getNumericValue(c);
                if (op == '+') {
                    num1 = -num1;
                } else if (op == '-') {
                    num2 = -num2;
                }
            } else if (Character.isDigit(a) && Character.isDigit(b) && c == 'x') {
                num1 = Character.getNumericValue(a);
                num2 = Character.getNumericValue(b);
                if (op == '-') {
                    num2 = -num2;
                }
            } else {
                return false;
            }
            System.out.println("x = " + (num1 + num2));
            return true;
        } else {
            return false;
        }
    }

}
