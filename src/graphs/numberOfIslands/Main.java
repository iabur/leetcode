package graphs.numberOfIslands;

public class Main {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '1'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        SolutionBFS solution = new SolutionBFS();
        System.out.println(solution.numIslands(grid));

    }
}
