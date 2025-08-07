package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortCharByFreq {
    public static void main(String[] args) {
        String text = "tree";
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : text.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(charFreq.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char c = entry.getKey();
            int freq = entry.getValue();
            result.append(String.valueOf(c).repeat(freq));
        }
        System.out.println("Sorted by frequency: " + result);
    }
}
