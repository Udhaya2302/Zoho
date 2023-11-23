public class Chess1 {
    public static void main(String[] args) {

        int grid[][] = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 0, 0}
        };

        int result = minSteps(grid);
        System.out.println("Minimum steps: " + result);
    }

    public static int minSteps(int grid[][]) {
        if (grid == null || grid.length == 0) {
            return -1;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    count = dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public static int dfs(int grid[][], int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        if (i < 0 || i >= rows || j < 0 ||j >= cols) {
            return 0;
        }
		else if( grid[i][j]==2)
		{
			System.out.println(count);
			
			return 0;
			
		}
		 

        count = 1;
        grid[i][j] = 1;

        count += dfs(grid, i + 2, j + 1);
        count += dfs(grid, i + 2, j - 1);
        count += dfs(grid, i + 1, j - 2);
        count += dfs(grid, i - 1, j - 2);
        count += dfs(grid, i - 2, j - 1);
        count += dfs(grid, i - 1, j + 2);
        count += dfs(grid, i + 1, j + 2);
        count += dfs(grid, i - 2, j + 1);

        grid[i][j] = 0;
        return count;
    }
}
