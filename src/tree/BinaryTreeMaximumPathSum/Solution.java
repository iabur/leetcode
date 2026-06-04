package tree.BinaryTreeMaximumPathSum;

class Solution {
    int maxSize = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSize;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftGain = Math.max(0, dfs(root.left));
        int rightGain = Math.max(0, dfs(root.right));
        maxSize = Math.max(maxSize,(root.val + leftGain + rightGain));
        return root.val + Math.max(leftGain, rightGain);
    }
}