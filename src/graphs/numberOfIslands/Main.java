package graphs.numberOfIslands;

public class Main {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '1'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        Solution3 solution = new Solution3();
        System.out.println(solution.numIslands(grid));

    }
}
