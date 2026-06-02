package tree.validateBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        // Build tree from array [2,1,3]
        // TreeNode and Solution are expected to be in the same package (LeetCode style)
        TreeNode root = new TreeNode(2l);
        root.left = new TreeNode(4l);
        root.right = new TreeNode(3l);

        // Call the solution
        boolean isValid = new Solution().isValidBST(root);
        System.out.println(isValid);
    }
}
