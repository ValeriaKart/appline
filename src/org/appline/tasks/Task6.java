package org.appline.tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, выберете, что нужно перевести: 1 - масса, 2 - расстрояние");
        byte convertType = input.nextByte();

        if (convertType == 1) {
            System.out.println("масса");

        } else if (convertType == 2){
            System.out.println("расстояние");
        }else{
            System.out.println("Введено некорректное значение. Корректные значения - 1 или 2");

        }
    }
}
