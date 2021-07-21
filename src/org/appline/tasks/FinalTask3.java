package org.appline.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int strQuantity = input.nextInt();
        String[] arrayStr = new String[strQuantity];

        System.out.println("Введите строки:");
        //int strCounter = 0;
        for(int i = 0; i < strQuantity; i++) {
            arrayStr[i] = input.nextLine();
            //strCounter++;
        }
        System.out.println(Arrays.toString(arrayStr));
    }
}

