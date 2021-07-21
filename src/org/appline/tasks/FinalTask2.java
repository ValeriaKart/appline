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

        while(!str.contains("x") || !str.contains("+") || !str.contains("=") || str.length() != 5) {
            System.out.println("Уравнение не по формату. Введите уравнение в корректном формате:");
            str = input.nextLine();
        }

        int a = 0;
        int b = 0;

        if(str.charAt(0) == 'x') {
            a = Character.getNumericValue(str.charAt(2));
            b = Character.getNumericValue(str.charAt(4));
                if(str.charAt(1) == '-') {
                    a = -a;
            }
            System.out.println("x = "+ (b - a));
        }else if (str.charAt(2) == 'x') {
            a = Character.getNumericValue(str.charAt(0));
            b = Character.getNumericValue(str.charAt(4));
                if(str.charAt(1) == '-') {
                    a = -a;
                    b = -b;
            }
            System.out.println("x = " + (b - a));
        }else if (str.charAt(4) == 'x'){
            a = Character.getNumericValue(str.charAt(0));
            b = Character.getNumericValue(str.charAt(2));
                if(str.charAt(1) == '-') {
                    b = -b;
            }
            System.out.println("x = " + (a + b));
        }else{
            System.out.println("Уравнение не по формату.");
        }
    }
}
