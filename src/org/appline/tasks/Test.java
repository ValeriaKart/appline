package org.appline.tasks;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            switch(i) {
                default:
                    System.out.printf("i = %d \n", i++);
                    break;
            }
        }
        int x = 5;
        int y = 60;

        for(; x < y; x += 10, y --) ;
            System.out.println(x + " " + y);

        for(double i = 0; i<5; i++ ){
            System.out.println(i);

        }
        }
    }
