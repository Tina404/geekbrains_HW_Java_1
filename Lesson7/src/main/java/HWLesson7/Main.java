package HWLesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Ворчун", 50),
                new Cat("Шалопай", 50),
                new Cat("Шнурок", 25),
                new Cat("Лапша", 75),
                new Cat("Паприка", 100),
                new Cat("Йети", 500),
                new Cat("Конфуций", 300)};
        Plate plate = new Plate(1000);
        plate.addingFood(50);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.infoSatiety();
        }
        plate.info();
    }
}
