public class Tribonacci {
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 1;

        return tribonacciHelper(n, memo);
    }

    private static int tribonacciHelper(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = tribonacciHelper(n - 1, memo) + tribonacciHelper(n - 2, memo) + tribonacciHelper(n - 3, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        // Example 1
        int n1 = 4;
        System.out.println(tribonacci(n1)); // Output: 4

        // Example 2
        int n2 = 25;
        System.out.println(tribonacci(n2)); // Output: 1389537
    }
}
