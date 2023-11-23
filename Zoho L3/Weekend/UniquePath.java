public class UniquePath{
    public static int findSubstringInWraproundString(String s) {
        int[] maxLengths = new int[26];
        int currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
			
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 || s.charAt(i - 1) - s.charAt(i) == 25)) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            int index = s.charAt(i) - 'a';
            maxLengths[index] = Math.max(maxLengths[index], currentLength);
        }

        int result = 0;
        for (int maxLength : maxLengths) {
            result += maxLength;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findSubstringInWraproundString("abcdbcd"));  
        System.out.println(findSubstringInWraproundString("cac"));  
        System.out.println(findSubstringInWraproundString("zab"));  
    }
}
