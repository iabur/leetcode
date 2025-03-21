package tree.subtreeOfAnotherTree;

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (isSameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }

        if ((r1 == null || r2 == null) || r1.val != r2.val) {
            return false;
        }

        return isSameTree(r1.left, r2.left) && isSameTree(r1.right, r2.right);
    }
}
