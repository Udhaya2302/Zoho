import java.util.LinkedList;
import java.util.Queue;

class chess {
    public static void main(String[] args) {
        int grid[][] = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 0, 0}
        };

        int minSteps = minSteps(grid, 1, 3);
        System.out.println(minSteps);
    }

    public static int minSteps(int grid[][], int startX, int startY) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});

        boolean[][] visited = new boolean[rows][cols];
        visited[startX][startY] = true;

        int[] dx = {2, 2, 1, -1, -2, -2, 1, -1};
        int[] dy = {1, -1, -2, -2, 1, -1, 2, 2};

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int steps = current[2];

            if (grid[x][y] == 2) {
                return steps;
            }

            for (int i = 0; i < 8; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && !visited[nextX][nextY] && grid[nextX][nextY] != 1) {
                    queue.add(new int[]{nextX, nextY, steps + 1});
                    visited[nextX][nextY] = true;
                }
            }
        }

        return -1; // No path to the destination
    }
}
