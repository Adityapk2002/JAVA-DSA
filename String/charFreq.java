package String;

import java.util.HashMap;
import java.util.Map;

public class charFreq {
    public static void main(String[] args) {
        String text = "Hello";
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            System.out.println(" " + entry.getKey() + " " + entry.getValue());
        }
    }
}
