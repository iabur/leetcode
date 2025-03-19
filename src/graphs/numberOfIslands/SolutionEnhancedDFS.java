package graphs.numberOfIslands;

public class SolutionEnhancedDFS {
    /*
*           {'1', '1', '0', '0', '1'},
            {'1', '1', '0', '0', '1'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
* */

    private static final int[][] directions = {
            {1, 0}, {-1, 0},
            {0, 1}, {0, -1}
    };

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int numIslands = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j, row, column);
                }
            }
        }
        return numIslands;
    }

    private static void dfs(char[][] grid, int i, int j, int row, int column) {

        if (i < 0 || i >= row || j < 0 || j >= column || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        for (int[] direction : directions) {
            dfs(grid, i + direction[0], j + direction[1], row, column);
        }
    }
}
