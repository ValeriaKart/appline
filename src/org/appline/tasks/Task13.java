package org.appline.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Пожалуйста, введите строку из слов и цифр, разделенных пробелами:");
        String str = input.nextLine();
        String[] array = str.split(" ");

        int latinStrNum = 0;
        for (String s : array) {
            if (s.matches("[A-Za-z]+")) {
                latinStrNum += 1;
            }
        }

        String[] arrayLatin = new String[latinStrNum];
        int counterPlace = 0;

        for (String s : array) {
            if (s.matches("[A-Za-z]+")) {
                arrayLatin[counterPlace] = s;
                counterPlace++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : arrayLatin) {
            stringBuilder.append(word).append(" ");
        }
        System.out.println("Слова, состоящие только из латиницы: " + stringBuilder);
        System.out.println("Количество слов, состоящих только из латиницы: " + arrayLatin.length);
    }
}
