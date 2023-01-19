import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor" +
            " incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
            " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate" +
            " velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident," +
            " sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < lorem.length(); i++) {
            char ch = Character.toLowerCase(lorem.charAt(i));
            if (Character.isLetter(ch)) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }

        minMap(map);
        maxMap(map);

    }

    public static void minMap(Map<Character, Integer> map) {
        int minValue = Integer.MAX_VALUE;
        char minKey = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value < minValue) {
                minValue = value;
                minKey = entry.getKey();
            }
        }
        System.out.println("Min: " + minKey + " - " + minValue);
    }

    public static void maxMap(Map<Character, Integer> map) {
        int maxValue = -1;
        char maxKey = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                maxKey = entry.getKey();
            }
        }
        System.out.println("Max: " + maxKey + " - " + maxValue);
    }

}
