import java.util.Scanner;

public class GoodSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String s = sc.nextLine();
        
        // Output
        int operations = 0;
        StringBuilder result = new StringBuilder(s);

        for (int i = 0; i <= n - k; i++) {
            int onesCount = 0;
            
            for (int j = i; j < i + k; j++) {
                if (s.charAt(j) == '1') {
                    onesCount++;
                }
            }
            
            if (onesCount > m) {
                // Replace a '1' with '0'
                int replaceIndex = i + k - 1;
                result.setCharAt(replaceIndex, '0');
                operations++;
            }
        }

        System.out.println(operations);
        System.out.println(result.toString());

        sc.close();
    }
}
