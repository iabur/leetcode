package graphs.maxAreaOfIsland;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 0, 1}
        };
        Solution solution = new Solution();
        System.out.println(solution.maxAreaOfIsland(grid));
    }

}
