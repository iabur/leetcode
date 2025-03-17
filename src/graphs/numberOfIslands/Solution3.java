package graphs.numberOfIslands;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    private static final int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}};


    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int numIslands = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    bfs(grid, i, j);
                }
            }
        }
        return numIslands;
    }

    private void bfs(char[][] grid, int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        grid[row][col] = '0';

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int[] dir : directions) {
                int newRow = curr[0] + dir[0];
                int newCol = curr[1] + dir[1];

                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && grid[newRow][newCol] == '1') {
                    queue.offer(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0';
                }
            }
        }
    }
}