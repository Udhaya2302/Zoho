public class FrogCroak {
    public static int minNumberOfFrogs(String croakOfFrogs) {
        int c = 0, r = 0, o = 0, a = 0, k = 0;
        int currentFrogs = 0;

        for (char ch : croakOfFrogs.toCharArray()) {
            if (ch == 'c') {
                c++;
                currentFrogs = Math.max(currentFrogs, c - k);
            } else if (ch == 'r') {
                r++;
            } else if (ch == 'o') {
                o++;
            } else if (ch == 'a') {
                a++;
            } else if (ch == 'k') {
                k++;
                currentFrogs = Math.max(currentFrogs, k);
            } else {
                return -1; // Invalid character
            }

            if (c < r || r < o || o < a || a < k) {
                return -1; // Counts are not in order
            }
        }

        if (c == r && r == o && o == a && a == k) {
            return currentFrogs;
        } else {
            return -1; // Counts are not equal
        }
    }

    public static void main(String[] args) {
        // Example 1
        String croakOfFrogs1 = "croakcroak";
        System.out.println(minNumberOfFrogs(croakOfFrogs1)); // Output: 1

        // Example 2
        String croakOfFrogs2 = "crcoakroak";
        System.out.println(minNumberOfFrogs(croakOfFrogs2)); // Output: 2

        // Example 3
        String croakOfFrogs3 = "croakcrook";
        System.out.println(minNumberOfFrogs(croakOfFrogs3)); // Output: -1
    }
}