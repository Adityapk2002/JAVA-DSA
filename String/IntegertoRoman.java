package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegertoRoman {
    public static String intToRoman(int num) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num >= entry.getKey()) {
                num -= entry.getKey();
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 1994;
        String ans = intToRoman(num);
        System.out.println(ans);
    }
}

// Another solution
// class Solution {
// public String intToRoman(int num) {
// int[] values = {
// 1000, 900, 500, 400,
// 100, 90, 50, 40,
// 10, 9, 5, 4, 1
// };
// String[] symbols = {
// "M", "CM", "D", "CD",
// "C", "XC", "L", "XL",
// "X", "IX", "V", "IV", "I"
// };

// StringBuilder sb = new StringBuilder();

// for (int i = 0; i < values.length && num > 0; i++) {
// while (num >= values[i]) {
// num -= values[i];
// sb.append(symbols[i]);
// }
// }

// return sb.toString();
// }
// }