package graphs.numberOfIslands;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionBFS {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int numIsIands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIsIands++;
                    bfs(grid, i, j, rows, cols);
                }

            }
        }
        return numIsIands;
    }

    private void bfs(char[][] grid, int row, int col, int rows, int cols) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        grid[row][col] = '0';

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];

            for (int[] direction : directions) {
                int newRow = currentRow + direction[0];
                int newColumn = currentCol + direction[1];

                if (newRow >= 0 && newRow < rows && newColumn >= 0 && newColumn < cols && grid[newRow][newColumn] == '1') {
                    grid[newRow][newColumn] = '0';
                    queue.offer(new int[]{newRow, newColumn});
                }
            }
        }
    }

}