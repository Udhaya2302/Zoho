import java.util.HashMap;
import java.util.Map;

public class PatternMatching {

    public static boolean matchesPattern(String str, String pattern) {
        if (str == null || pattern == null) {
            return false;
        }

        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];

            if (charToWord.containsKey(currentChar)) {
                // Check if the mapping is consistent
                if (!charToWord.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                charToWord.put(currentChar, currentWord);
            }

            if (wordToChar.containsKey(currentWord)) {
                // Check if the mapping is consistent
                if (wordToChar.get(currentWord) != currentChar) {
                    return false;
                }
            } else {
                wordToChar.put(currentWord, currentChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String string1 = "codesleepcode";
        String pattern1 = "XYX";
        System.out.println(matchesPattern(string1, pattern1));  // Output: true

        String string2 = "codecodecode";
        String pattern2 = "XXX";
        System.out.println(matchesPattern(string2, pattern2));  // Output: true
    }
}
