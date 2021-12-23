package ru.geekbrains.tina.lesson2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Задача №1");
        System.out.println("Введите первое число");
        //возникла проблема с вводом строки (некорректно работал in.nextLine(), in.next() работал
        //Найденое решение: https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
        int a = Integer.parseInt(in.nextLine());
        System.out.println("Введите второе число");
        int b = Integer.parseInt(in.nextLine());
        System.out.println("Результат: " + within10and20(a, b));

        System.out.println("Задача №2");
        System.out.println("Введите число: ");
        int x = Integer.parseInt(in.nextLine());
        PositiveOrNegative(x);

        System.out.println("Задача №3");
        System.out.println("Введите число: ");
        int y = Integer.parseInt(in.nextLine());
        System.out.println("Число отрицательное? Ответ: " + IsNegative(y));

        System.out.println("Задача №4");
        System.out.println("Введите строку:");
        String word = in.nextLine();
        System.out.println("Сколько раз напечатать?");
        int times = Integer.parseInt(in.nextLine());
        PrintWordNTimes(word, times);

        System.out.println("Задача №5*");
        System.out.println("Введите год:");
        int year = Integer.parseInt(in.nextLine());
        System.out.println("Год високосный? " + LeapYear(year));
    }
    public static boolean within10and20(int x1, int x2) {
        return (x1+x2) >= 10 && (x1+x2) <= 20;
        }

    public static void PositiveOrNegative(int x1) {
        if (x1 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean IsNegative(int y1) {
        return y1 < 0;
        }

    public static void PrintWordNTimes(String word1, int times1) {
        for (int i = 0; i < times1; i++) {
            System.out.println(word1);
        }
    }

    public static boolean LeapYear(int year) {
       return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        }
    }