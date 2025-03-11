public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        int column = matrix[0].length - 1;

        int startRow = 0;

        int targetRow = 0;

        while (startRow <= row) {
            if (matrix[startRow][column] >= target) {
                targetRow = startRow;
                break;
            } else if (matrix[startRow][column] <= target) {
                startRow++;
            }
        }

        int startColumn = 0;
        int endColumn = column;

        // Perform binary search in the target row
        while (startColumn <= endColumn) {
            int mid = startColumn + (endColumn - startColumn) / 2;
            if (matrix[targetRow][mid] == target) {
                return true;
            } else if (matrix[targetRow][mid] < target) {
                startColumn = mid + 1;
            } else {
                endColumn = mid - 1;
            }
        }
        return false;
    }
}
