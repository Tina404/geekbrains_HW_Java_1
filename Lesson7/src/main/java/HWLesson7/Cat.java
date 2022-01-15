package HWLesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void infoSatiety() {
        String isValidSatiety = satiety ? "сыт" : "голоден";
        System.out.println(name + ": " + isValidSatiety);
    }

    void eat(Plate plate) {
        if (!satiety && plate.decreaseFood(appetite))
            satiety = true;
    }
}
