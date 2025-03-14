package tree.sameTreeCheck;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean leftSameTree = isSameTree(p.left, q.left);
        boolean rightSameTree = isSameTree(p.right, q.right);

        return leftSameTree && rightSameTree;
    }
}
