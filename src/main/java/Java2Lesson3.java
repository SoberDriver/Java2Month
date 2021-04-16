import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Java2Lesson3 {
    public static void main(String[] args) {

        String[] str = {
                "Crab", "Crab", "Crab", "Crab", "Moose", "Dog", "Crab", "Cat", "Dog", "Snake",
                "Rabbit", "Hare", "Snake", "Snake", "Moose", "Dog", "Giraffe", "Bat"
        };

        ArrayList<String> arrayList = new ArrayList<>();
        Set<String> set = new HashSet<>();

        Collections.addAll(set, str);
        Collections.addAll(arrayList, str);

        for (String elem : set) {
            System.out.println(elem + " упомянут " + Collections.frequency(arrayList, elem) + " раз.");
        }
        // не совсем понял задание, поэтому два варианта: 1) все слова без повторений:
        System.out.println("Уникальные слова: " + set);
        // 2) только слова у которых нет дубликатов
        set.removeIf(dubl -> Collections.frequency(arrayList, dubl) > 1);
        System.out.println("Уникальные слова без дубликатов: " + set);



    }
}
