package HWLesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Емкость тарелки: " + food);
    }
    boolean decreaseFood(int n) {
        int balance = food - n;
        if (balance < 0) return false;
        else {
            food -= n;
            return true;
        }
    }

    public void addingFood(int food) {
        this.food += food;
    }
}
