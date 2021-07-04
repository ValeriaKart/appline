package org.appline.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, выберете, что нужно перевести: 1 - масса, 2 - расстояние");
        byte convertType = input.nextByte();

        if (convertType == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - грамм, 4 - унция");
            byte unitOfMeasurement = input.nextByte();

            if(unitOfMeasurement != 1 && unitOfMeasurement != 2 && unitOfMeasurement != 3 && unitOfMeasurement != 4){
                System.out.println("Введено некорректное значение. Корректные значения - 1, 2, 3, 4");
            }else {

                System.out.println("Введите количество выбранных единиц");
                double quantity = input.nextDouble();

                System.out.println("Результат:");

                double kilos, pounds, grammes, ounces;

                switch (unitOfMeasurement) {
                    case 1:
                        kilos = quantity;
                        pounds = quantity * 2.2046;
                        grammes = quantity * 1000;
                        ounces = quantity * 35.2739;
                        System.out.println("Килограммы: " + kilos + ",\nФунты: " + pounds + ", \nГраммы: " + grammes + ", \nУнции: " + ounces + ".");
                        break;

                    case 2:
                        pounds = quantity;
                        kilos = quantity * 0.4536;
                        grammes = quantity * 453.59;
                        ounces = quantity * 16;
                        System.out.println("Килограммы: " + kilos + ",\nФунты: " + pounds + ", \nГраммы: " + grammes + ", \nУнции: " + ounces + ".");
                        break;

                    case 3:
                        grammes = quantity;
                        kilos = quantity * 0.001;
                        pounds = quantity * 0.0022;
                        ounces = quantity * 0.0353;
                        System.out.println("Килограммы: " + kilos + ",\nФунты: " + pounds + ", \nГраммы: " + grammes + ", \nУнции: " + ounces + ".");
                        break;

                    case 4:
                        ounces = quantity;
                        kilos = quantity * 0.0283;
                        grammes = quantity * 28.3495;
                        pounds = quantity * 0.0625;
                        System.out.println("Килограммы: " + kilos + ",\nФунты: " + pounds + ", \nГраммы: " + grammes + ", \nУнции: " + ounces + ".");
                        break;

                }
            }

        } else if (convertType == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            byte unitOfMeasurement = input.nextByte();

            if(unitOfMeasurement != 1 && unitOfMeasurement != 2 && unitOfMeasurement != 3 && unitOfMeasurement != 4){
                System.out.println("Введено некорректное значение. Корректные значения - 1, 2, 3, 4");
            }else {

                System.out.println("Введите количество выбранных единиц");
                double quantity = input.nextDouble();

                System.out.println("Результат:");

                double metres, miles, yards, feet;

                switch (unitOfMeasurement) {
                    case 1:
                        metres = quantity;
                        miles = quantity * 0.000621;
                        yards = quantity * 1.0936;
                        feet = quantity * 3.2808;
                        System.out.println("Метры: " + metres + ",\nМили: " + miles + ", \nЯрды: " + yards + ", \nФуты: " + feet + ".");
                        break;

                    case 2:
                        miles = quantity;
                        metres = quantity * 1609.34;
                        yards = quantity * 1760;
                        feet = quantity * 5280;
                        System.out.println("Метры: " + metres + ",\nМили: " + miles + ", \nЯрды: " + yards + ", \nФуты: " + feet + ".");
                        break;

                    case 3:
                        yards = quantity;
                        metres = quantity * 0.9144;
                        miles = quantity * 0.000568;
                        feet = quantity * 3;
                        System.out.println("Метры: " + metres + ",\nМили: " + miles + ", \nЯрды: " + yards + ", \nФуты: " + feet + ".");
                        break;

                    case 4:
                        feet = quantity;
                        yards = quantity * 0.3333;
                        metres = quantity * 0.3048;
                        miles = quantity * 0.000189;
                        System.out.println("Метры: " + metres + ",\nМили: " + miles + ", \nЯрды: " + yards + ", \nФуты: " + feet + ".");
                        break;

                    /* default не нужен, потому что это условие проверяется ранее
                        default:
                        System.out.println("Введено некорректное значение. Корректные значения - 1, 2, 3, 4");
                        break; */
                }
            }

        }else{
            System.out.println("Введено некорректное значение. Корректные значения - 1 или 2");

        }
    }
}
