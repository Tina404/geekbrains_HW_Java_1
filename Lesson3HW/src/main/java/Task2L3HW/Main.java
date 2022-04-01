package Task2L3HW;

public class Main {
    public static void main(String[] args) {
        System.out.println("Телефонная книга: ");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Афонин", "123456");
        phonebook.add("Баранов", "000000");
        phonebook.add("Баранов", "654456");
        phonebook.add("Иванов", "005000");
        phonebook.add("Иванов", "568974");
        phonebook.add("Шпякин", "000090");
        phonebook.add("Шибин", "6666666");

        System.out.println("Получить номера Ивановых");
        System.out.println(phonebook.get("Иванов"));

        System.out.println("Получить несуществующий номер");
        System.out.println(phonebook.get("Королев"));

        System.out.println("Записать номер повторно (Шпякин)");
        phonebook.add("Шпякин", "000090");

    }
}
