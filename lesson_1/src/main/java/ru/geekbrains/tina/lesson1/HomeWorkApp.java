package ru.geekbrains.tina.lesson1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //Посмотрела и изучила в указанной доп. литературе как сделать ввод с консоли. Показалось так удобнее.
    //И это еще было в подгот. курсе
    public static void printThreeWords() {
        System.out.println("Задача №2");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        Scanner in = new Scanner(System.in);

        System.out.println("Задача №3");
        System.out.println("Введите а");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();

        if ((a+b) >= 0) {
            System.out.println("Сумма a+b положительная");
        } else {
            System.out.println("Сумма a+b отрицательная");
            }
        }

    public static void printColor() {
        Scanner in = new Scanner(System.in);

        System.out.println("Задача №4");
        System.out.println("Введите value");
        int value = in.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        Scanner in = new Scanner(System.in);

        System.out.println("Задача №5");
        System.out.println("Введите а");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    }
