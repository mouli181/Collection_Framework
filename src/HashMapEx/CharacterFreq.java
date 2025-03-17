package HashMapEx;

import java.util.HashMap;
import java.util.Map;

public class CharacterFreq {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> c = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                c.put(ch, c.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : c.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

