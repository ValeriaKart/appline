package org.appline.tasks;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = {5, 10, 15, 20, 25};
        int first = myArray[0];
        int last = myArray[myArray.length - 1];
        int medium = myArray[(myArray.length - 1) / 2];

        myArray[0] = last;
        myArray[myArray.length - 1] = first;

        int total = last + medium;
        System.out.println("Результат суммы первого и среднего элемента:" + total);
    }
}