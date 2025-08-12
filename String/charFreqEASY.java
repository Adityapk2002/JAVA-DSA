package String;

import java.util.HashMap;
import java.util.Map;

public class charFreqEASY {
    public static Map<Character, Integer> caluFreq(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        return charFreq;
    }

    public static void main(String[] args) {
        String s = "aditya";
        Map<Character, Integer> freq = caluFreq(s);
        System.out.println(freq);
    }
}
