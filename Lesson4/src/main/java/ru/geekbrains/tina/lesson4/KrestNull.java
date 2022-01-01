package ru.geekbrains.tina.lesson4;

import java.util.Random;
import java.util.Scanner;

public class KrestNull {
    private final static int SIZE = 5;
    private final static char DOT_EMPTY = '.';
    private final static char DOT_X = 'X';
    private final static char DOT_O = 'O';
    private final static Random RANDOM = new Random();
    private final static char[][] MAP = new char[SIZE][SIZE];
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            HumanTurn();
            printMap();
            if (CheckWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (IsMapFull()) {
                System.out.println("Ничья");
                break;
            }
            AITurn();
            printMap();
            if (CheckWin(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (IsMapFull()) {
                System.out.println("Ничья");
                break;
            }
            System.out.println("Конец игры");
            SCANNER.close();
        }
            }
    private static boolean CheckWin(char symbol) {
        //диагонали, строки и столбцы на поле для проверки выйгрыша
        int DIAG_1, DIAG_2, str, stolb;

        for (int i = 0; i < SIZE; i++) {
            str = 0; stolb = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symbol) {
                    str++;
                }
                if (MAP[j][i] == symbol) {
                    stolb++;
                }
            }
            if (str == SIZE || stolb == SIZE) {
                return true;
            }
        }
        DIAG_1 = 0; DIAG_2 = 0;
        for (int i = 0; i<SIZE; i++) {
            if (MAP[i][i] == symbol) {
                DIAG_1++;
            }
            if (MAP[i][SIZE-i-1] == symbol) {
            DIAG_2++;
            }
        }
        if (DIAG_1 == SIZE || DIAG_2 == SIZE) {
            return true;
         }
        return false;
    }
    private static void HumanTurn() {
        int x;
        int y;
        do {
            System.out.println("Ведите координаты (x,y): ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x,y));
        MAP[y][x] = DOT_X;
}

    public static void AITurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.println("Ход компьютера: " + (x+1) + " " + (y+1));
        MAP[y][x] = DOT_O;
    }
    private static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }

        return MAP[y][x] == DOT_EMPTY;
    }
    private static boolean IsMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }
    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }
    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

