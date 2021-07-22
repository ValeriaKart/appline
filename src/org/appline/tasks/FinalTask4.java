package org.appline.tasks;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает." +
                "\nВведите ответ или \"Подсказка\". У вас три попытки, с подсказкой одна попытка.");
        int counter = 0;
        boolean isClueUsed = false;

        while (counter < 3) {
            System.out.println("Введите ответ: ");
            String str = input.nextLine();

            if (str.equals("Подсказка")) {
                if (counter == 0) {
                    System.out.println("Подсказка: Не лук. But you can unZIP it.");
                    isClueUsed = true;
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
            } else if (str.equals("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            } else {
                if (isClueUsed || counter == 2) {
                    System.out.println("Обидно, приходи в другой раз");
                    return;
                }
                System.out.println("Подумай еще!");
                counter++;
            }
        }
    }
}
