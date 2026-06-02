package tree.validateBinarySearchTree;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validateBST(TreeNode root, long minValue, long maxValue) {
        if (root == null) {
            return true;
        }

        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }
        return validateBST(root.left, minValue, root.val) && validateBST(root.right, root.val, maxValue);
    }

}