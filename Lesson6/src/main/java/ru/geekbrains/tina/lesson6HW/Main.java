package ru.geekbrains.tina.lesson6HW;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Бандит", "Рыжий", 5, 100,500);
        Cat cat2 = new Cat("Философ", "Серый", 2, 100,80);
        Dog dog = new Dog("Пончик", "Белый", 4,100,10);
        Dog dog2 = new Dog("Шарик", "Черный", 10,10,600);
        cat.run(cat.getRunning());
        cat.swim(cat.getSwimming());
        dog.run(dog.getRunning());
        dog.swim(dog.getSwimming());
        cat2.run(cat2.getRunning());
        cat2.swim(cat2.getSwimming());
        dog2.run(dog2.getRunning());
        dog2.swim(dog2.getSwimming());
        System.out.println("Всего было создано животных: " + Animal.getCount());
        System.out.println("Всего было создано котов: " + Cat.getCount());
        System.out.println("Всего было создано собак: " + Dog.getCount());

    }
}
