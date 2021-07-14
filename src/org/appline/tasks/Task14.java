package org.appline.tasks;

import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        System.out.println("Сгенерированный массив:\n" + Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(array[i], min);
            max = Math.max(array[i], max);
        }
        System.out.println("Максимальный элемент: " + max + "\nМинимальный элемент: " + min);
        System.out.println("Максимальное значение по модулю: " + Math.max(Math.abs(min), Math.abs(max)));
    }
}
