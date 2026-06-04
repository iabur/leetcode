package tree.BinaryTreeMaximumPathSum;

public class Main {
    public static void main(String[] args) {
        // Create tree from [1,2,3]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        Solution solution = new Solution();
        int result = solution.maxPathSum(root);

        System.out.println("Maximum Path Sum: " + result);
    }
}
