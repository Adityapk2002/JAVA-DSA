package String;

// You are given a sentence S consisting of words separated by spaces.
// Your task is to find the largest word in the sentence that satisfies the following conditions:
// The word must have an even length.
// The word must start with a vowel (a, e, i, o, u, case-insensitive).
// If multiple words have the same maximum even length, return the first one.
// If no such word exists, return "00".
// 📥 Input
// A single string S (the sentence).
// 📤 Output
// A single string representing the largest word that satisfies the conditions, or "00" if none exists.
// 🔎 Example 1
// Input:
// I am enjoying online education
// Output:
// enjoying

public class Question {
    public static String largestWord(String S) {
        String[] words = S.split(" ");
        int maxLen = 0;
        String maxWord = "00";
        String vowels = "aeiouAEIOU";

        for (String word : words) {
            if (word.length() % 2 == 0 && vowels.indexOf(word.charAt(0)) != -1) {
                if (word.length() > maxLen) {
                    maxLen = word.length();
                    maxWord = word;
                }
            }
        }
        return maxWord;
    }

    public static void main(String[] args) {
        String S = "I am enjoying online education";
        String ans = largestWord(S);
        System.out.println(ans);
    }
}
