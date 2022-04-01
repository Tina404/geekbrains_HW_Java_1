package Task1L3HW;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList(
                "Однажды ", "был ", "случай ", "в ",
                "далеком ", "Макао: ", "макака ", "коалу ",
                "в ", "какао ", "макала ", "коала ", "какао ",
                "лениво ", "лакала ", "макака ", "макала ", "коала ", "икала "
        );

        Set<String> unique = new HashSet<String>(str);

        System.out.println("Начальное условие: ");
        System.out.println(str.toString());
        System.out.println("Список уникальных слов: ");
        System.out.println(unique.toString());
        System.out.println("Повторяющиеся слова: ");
        for (String k : unique) {
            System.out.println(k + ": " + Collections.frequency(str, k));
        }
    }
}
