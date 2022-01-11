package ru.geekbrains.tina.lesson6HW;

abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int swimming;
    protected int running;
    protected static int count;

    abstract void swim(int length);

    abstract void run(int length);

    public Animal(String name, String color, int age, int swimming, int running) {
        System.out.println("Создался объект с кличкой " + name);
        this.setName(name);
        this.setColor(color);
        if (isValidAge(age)) {
            this.setAge(age);
        }
        this.setSwimming(swimming);
        this.setRunning(running);
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = count;
    }

    private boolean isValidAge(int age) {
        if (age <= 0) {
            System.out.println("Возраст не может быть меньше или равен нулю!");
            return false;
        }
        return true;
    }
}
