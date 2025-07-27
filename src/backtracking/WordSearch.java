package backtracking;

public class WordSearch {
    public static final int[][] directions = {
            {1, 0}, {-1, 0},
            {0, 1}, {0, -1}
    };

    public boolean exist(char[][] board, String word) {
        int height = board.length;
        int width = board[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (dfs(board, word, i, j, height, width, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int height, int width, int index) {
        if (i < 0 || i >= height || j < 0 || j >= width || word.charAt(index) != board[i][j]) {
            return false;
        }

        if (index == word.length() - 1) {
            return true;
        }


        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = false;
        for (int[] direction : directions) {
            found = found || dfs(board, word, direction[0] + i, direction[1] + j, height, width, index + 1);
        }
        board[i][j] = temp;
        return found;
    }
}