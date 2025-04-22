package graphs.maxAreaOfIsland;

public class Solution {

    private static final int[][] directions = {
            {0, 1}, {0, -1},
            {1, 0}, {-1, 0}
    };
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i, j, rows, columns));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int row, int column, int rows, int columns) {
        if (row < 0 || row >= rows || column < 0 || column >= columns || grid[row][column] == 0) {
            return 0;
        }
        grid[row][column] = 0;
        int count = 1;
        for (int[] direction : directions) {
           count += dfs(grid, row+direction[0], column + direction[1], rows, columns);
        }
        return count;
    }
}
