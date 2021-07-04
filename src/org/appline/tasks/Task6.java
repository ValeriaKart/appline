package org.appline.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, выберете, что нужно перевести: 1 - масса, 2 - расстояние");
        byte convertType = input.nextByte();

        if (convertType == 1) {
            weightLogic(input);
        } else if (convertType == 2) {
            distanceLogic(input);
        } else {
            System.out.println("Введено некорректное значение. Корректные значения - 1 или 2");
        }
    }

    private static void weightLogic(Scanner input) {
        System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - грамм, 4 - унция");
        byte unitOfMeasurement = input.nextByte();

        if (unitOfMeasurement < 1 || unitOfMeasurement > 4) {
            System.out.println("Введено некорректное значение. Корректные значения - 1, 2, 3, 4. Завершаю программу.");
            return;
        }

        System.out.println("Введите количество выбранных единиц");
        double quantity = input.nextDouble();

        double kilos = 0;
        double pounds = 0;
        double grammes = 0;
        double ounces = 0;

        switch (unitOfMeasurement) {
            case 1:
                kilos = quantity;
                pounds = quantity * 2.2046;
                grammes = quantity * 1000;
                ounces = quantity * 35.2739;
                break;

            case 2:
                pounds = quantity;
                kilos = quantity * 0.4536;
                grammes = quantity * 453.59;
                ounces = quantity * 16;
                break;

            case 3:
                grammes = quantity;
                kilos = quantity * 0.001;
                pounds = quantity * 0.0022;
                ounces = quantity * 0.0353;
                break;

            case 4:
                ounces = quantity;
                kilos = quantity * 0.0283;
                grammes = quantity * 28.3495;
                pounds = quantity * 0.0625;
                break;
        }
        System.out.println("Результат:\n" +
                "Килограммы: " + kilos + ",\nФунты: " + pounds + ", \nГраммы: " + grammes + ", \nУнции: " + ounces + ".");
    }

    private static void distanceLogic(Scanner input) {
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        byte unitOfMeasurement = input.nextByte();

        if (unitOfMeasurement < 1 || unitOfMeasurement > 4) {
            System.out.println("Введено некорректное значение. Корректные значения - 1, 2, 3, 4. Завершаю программу.");
            return;
        }

        System.out.println("Введите количество выбранных единиц");
        double quantity = input.nextDouble();

        double metres = 0;
        double miles = 0;
        double yards = 0;
        double feet = 0;

        switch (unitOfMeasurement) {
            case 1:
                metres = quantity;
                miles = quantity * 0.000621;
                yards = quantity * 1.0936;
                feet = quantity * 3.2808;
                break;

            case 2:
                miles = quantity;
                metres = quantity * 1609.34;
                yards = quantity * 1760;
                feet = quantity * 5280;
                break;

            case 3:
                yards = quantity;
                metres = quantity * 0.9144;
                miles = quantity * 0.000568;
                feet = quantity * 3;
                break;

            case 4:
                feet = quantity;
                yards = quantity * 0.3333;
                metres = quantity * 0.3048;
                miles = quantity * 0.000189;
                break;
        }
        System.out.println("Результат:\n" +
                "Метры: " + metres + ",\nМили: " + miles + ", \nЯрды: " + yards + ", \nФуты: " + feet + ".");
    }
}
