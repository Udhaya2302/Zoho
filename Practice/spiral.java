public class SpiralMatrixRecursive {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] matrix = new int[rows][cols];

        fillAndPrintSpiralMatrix(matrix, 1, 0, 0, rows - 1, cols - 1);

    }

    private static void fillAndPrintSpiralMatrix(int[][] matrix, int start, int top, int left, int bottom, int right) {
        // Base case: if top is greater than bottom or left is greater than right
        if (top > bottom || left > right) {
            return;
        }

        // Fill and print the top row
        for (int i = left; i <= right; i++) {
            matrix[top][i] = start;
            System.out.print(start++ + " ");
        }
        top++;

        // Fill and print the right column
        for (int i = top; i <= bottom; i++) {
            matrix[i][right] = start;
            System.out.print(start++ + " ");
        }
        right--;

        // Fill and print the bottom row
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = start;
                System.out.print(start++ + " ");
            }
            bottom--;
        }

        // Fill and print the left column
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = start;
                System.out.print(start++ + " ");
            }
            left++;
        }

        // Recursive call for the inner matrix
        fillAndPrintSpiralMatrix(matrix, start, top, left, bottom, right);
    }
}
