package ru.geekbrains.tina.lesson6HW;

public class Cat extends Animal {
    private static int count;
    public Cat(String name, String color, int age, int swimming, int running) {
        super(name, color, age, swimming, running);
        count++;
    }

    @Override
    void run(int length) {
        if ((length <= 200) && (length > 0)) System.out.println("Кот по кличке " + getName() + " пробежал " + length + " м.");
        else System.out.println("Кот по кличке " + getName() + " столько не пробежит");
    }
    @Override
    void swim(int length) {
        System.out.println("Кот по кличке " + getName() + " не умеет плавать");
    }

    public static int getCount() {
        return count;
    }

}
