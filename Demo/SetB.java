import java.util.Scanner;

public class GoodDigitStrings {

    public static int countGoodNumbers(long n) {
        final int MOD = 1_000_000_007;

        // Helper function for recursion
        // Parameters: length of the string (i), whether the last digit is even (E), and whether the last digit is prime (P)
        // Returns the count of good numbers for the given parameters.
        // The result is modulo MOD.
        long helper(int i, boolean E, boolean P) {
            // Base case: if we've reached the end of the string, return 1 if both E and P conditions are satisfied, otherwise 0.
            if (i == n) {
                return (E && P) ? 1 : 0;
            }

            long count = 0;
            // If the current position is even (i is even), the next position can be even as well.
            if (i % 2 == 0) {
                count = (count + helper(i + 1, E, P)) % MOD;
            } else {
                // If the current position is odd (i is odd), the next position can be prime as well.
                count = (count + helper(i + 1, E, P)) % MOD;
            }

            // If the current position is even (i is even), the next position can be prime.
            if (E) {
                count = (count + helper(i + 1, false, P)) % MOD;
            } else {
                // If the current position is odd (i is odd), the next position can be even.
                count = (count + helper(i + 1, E, true)) % MOD;
            }

            return count;
        }

        // Start the recursion with the initial parameters: length 1, last digit is even, and last digit is prime.
        return (int) helper(1, true, true);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        long n = scanner.nextLong();
        scanner.close();

        int result = countGoodNumbers(n);
        System.out.println("Total number of good digit strings of length " + n + " modulo 10^9 + 7 is: " + result);
    }
}
