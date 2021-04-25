import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class YellowPages {
    private static final Map<Integer, String> yellowPages = new HashMap<>();

    public static void main(String[] args) {
        add(1234, "Кузнецов");
        add(123, "Кузнецов");
        add(133, "Кузнецов");
        add(134, "Кузнецов");
        add(135, "Васнецов");
        get("Кузнецов");
    }

    public static void add(int phoneNumber, String familyName) {
        yellowPages.put(phoneNumber, familyName);
    }
    public static void get(String familyName){
        if(yellowPages.containsValue(familyName)) {
            Set<Map.Entry<Integer, String>> set = yellowPages.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(familyName)) {
                    System.out.println(temp.getValue() + "  " + temp.getKey());
                }
            }
        } else {
            System.out.println("Такой фамилии нет в данной телефонной книге!");
        }
    }
}
