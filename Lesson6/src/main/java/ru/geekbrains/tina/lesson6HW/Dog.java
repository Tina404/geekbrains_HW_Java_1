package ru.geekbrains.tina.lesson6HW;

public class Dog extends Animal {
    private static int count;
    public Dog(String name, String color, int age, int swimming, int running) {
        super(name, color, age, swimming, running);
        count++;
    }
    @Override
    void swim(int length) {
        if ((length <= 10) && (length > 0)) System.out.println("Пес по кличке " + getName() + " проплыл " + length + " м.");
        else System.out.println("Пес по кличке " + getName() + " не может проплыть такую дистанцию");
    }
    @Override
    void run(int length) {
        if ((length <= 500) && (length > 0)) System.out.println("Пес по кличке " + getName() + " пробежал " + length + " м.");
        else System.out.println("Пес по кличке " + getName() + " не может пробежать такую дистанцию");
    }
    public static int getCount() {
        return count;
    }
}
