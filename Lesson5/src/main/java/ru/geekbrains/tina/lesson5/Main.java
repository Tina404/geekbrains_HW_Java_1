package ru.geekbrains.tina.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] workArray = new Employee[5];
        workArray[0] = new Employee("Никонов В.А.", "Хирург", "nikonov@mail.ru", "89554565526", 80000, 35);
        workArray[1] = new Employee("Попов Г.Г.", "Могильщик", "yamogila@mail.ru", "8955546626", 22000, 66);
        workArray[2] = new Employee("Либерман Р.Г.", "Зоолог", "zoolib@mail.ru", "89554345526", 85000, 49);
        workArray[3] = new Employee("Морган К.К.", "Капитан судна", "capcom@mail.ru", "8956559556", 150000, 58);
        workArray[4] = new Employee("Васечкин Г.А.", "Санитар", "Vasya@mail.ru", "895785565526", 25000, 27);
        System.out.println("Список работников: ");
        for (int i = 0; i < workArray.length; i++) {
            workArray[i].printInfo();
        }
        System.out.println("Работники старше 40 лет: ");
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i].age > 40) {
                workArray[i].printInfo();
            }
        }
    }
}
