public class cha {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        int maxLength = 0;

        for (end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            int charIndex = s.indexOf(currentChar, start);

            if (charIndex >= start && charIndex < end) {
                start = charIndex + 1;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2)); // Output: 1

        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3)); // Output: 3
    }
}
