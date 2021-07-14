package org.appline.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, строку \"I like Java!!!\")");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        boolean result1 = str.contains("Java");
        boolean result2 = str.startsWith("I like");
        boolean result3 = str.endsWith("!!!");

        if (result1 == true && result2 == true && result3 == true) {
            System.out.println(str.toUpperCase());
        }
        String newStr = str.replace('a', 'o');
        System.out.println(newStr.substring(7, 11));
    }
}
