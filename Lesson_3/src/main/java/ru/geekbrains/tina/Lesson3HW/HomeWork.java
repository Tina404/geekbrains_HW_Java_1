package ru.geekbrains.tina.Lesson3HW;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        System.out.println("Задание №7");
        System.out.print("Размер массива: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        Task7(arr2, size2);
    }

    public static void Task1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задача №1");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task2() {
        int[] arr = new int[100];

        System.out.println("\nЗадача №2");
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("\nЗадача №3");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task4() {
        int size = 6;
        int[][] arr = new int[size][size];

        System.out.println("\nЗадача №4");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    arr[i][j] = 1;
                } else if (j == size - i - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача №5");
        System.out.print("Длина массива? ");
        int len = sc.nextInt();
        System.out.print("Значение массива? ");
        int initialValue = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }

    public static void Task6() {
        int[] arr = {1, 6, 12, 45, 64, 88, 90, 2, 4, 8, 9, 99};
        System.out.println("\nЗадача №6");
        int max = 0;
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static boolean Task7(int[] arr, int size) {
        int sum = 0;
        int sum2 = 0;
        boolean checkBalance = false;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < size; i++) {
            sum2 += arr[i];
            if (sum2 == sum - sum2) {
                checkBalance = true;
            }
        }
        System.out.println(checkBalance);
        return checkBalance;
    }
}

