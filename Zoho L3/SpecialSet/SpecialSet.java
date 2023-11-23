import java.util.Scanner;

public class SpecialSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
		
        long result = specialSet(n);
        System.out.println(result);
    }

    static long specialSet(int N) {
        long sum = 0;
        int limit = (N + 1) / 2;

        for (int m = 1; m <= limit; m++) {
            long term = (N + 1) / m - 1;
            term *= factorial(m);
            sum += term;
        }

        return sum;
    }

    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
