package org.appline.tasks;

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int strQuantity = input.nextInt();
        String[] arrayStr = new String[strQuantity];
        System.out.println("Введите строки:");

        int[] difCharsCount = new int[strQuantity];


        for(int i = 0; i < strQuantity; i++) {
            StringBuilder str = new StringBuilder();
            arrayStr[i] = input.next();
            for(int j = 0; j < arrayStr[i].length(); j++) {
                char chars = arrayStr[i].charAt(j);
                if (!str.toString().contains(String.valueOf(chars))) {
                    str.append(chars);
                }
            }
            difCharsCount[i] = str.length();
        }
        int max = difCharsCount[0];
        int indexMax = 0;

        for(int i = 1; i < difCharsCount.length; i++) {
           if (difCharsCount[i] > max) {
               max = difCharsCount[i];
               indexMax = i;
           }
        }
        System.out.println("Строка с максимальным количеством различных символов: " + arrayStr[indexMax]);
    }
}

