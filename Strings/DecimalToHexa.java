public class DecimalToHexa {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (num != 0) {
            int remainder = num % 16;
            char hexDigit = (char) (remainder < 10 ? '0' + remainder : 'a' + remainder - 10);
            result.insert(0, hexDigit);
            num /= 16;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int num = 255;

        System.out.println("Input: num = " + num);
        System.out.println("Output: " + toHex(num));
    }
}
