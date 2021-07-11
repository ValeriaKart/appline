package org.appline.tasks;

import java.util.Scanner;

public class Task7 {
    static final int X = 1;
    static final int Y = 5;
    static final int Z = 7;

    public static void main(String[] args) {

        int[] myArray2 = createArray();

        compareToConst(myArray2);

    }

    public static int[] createArray() {
        System.out.println("Пожалуйста, введите длину массива");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int[] myArray = new int[arrayLength];

        int counter = 0;
        while (counter < arrayLength) {
            System.out.println("Пожалуйста, введите значение " + (counter + 1) + " массива:");
            myArray[counter] = input.nextInt();
            counter++;
        }
        return myArray;
    }

    public static void compareToConst(int[] array) {
        for (int value : array) {
            if (value == X || value == Y || value == Z) {
                System.out.println("Значение " + value + " имеется в константах");
                break;
            }
        }
    }
}