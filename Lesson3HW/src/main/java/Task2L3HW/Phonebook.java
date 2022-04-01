package Task2L3HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private HashMap<String, List<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (phonebook.containsKey(surname)) {
            List<String> numbers = phonebook.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("В телефонную книгу добавлен новый контакт: Фамилия: %s номер: %s", surname, number));
            } else {
                System.out.println("Номер уже записан");
            }
        } else {
            phonebook.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println("Номер успешно добавлен для фамилии " + surname);
        }
    }

    public List<String> get(String surname) {
        if (phonebook.containsKey(surname)) {
            return phonebook.get(surname);
        } else {
            System.out.println("В справочнике нет фамилии:" + surname);
            return new ArrayList<>();
        }
    }
}
