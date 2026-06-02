package tree.validateBinarySearchTree;

public class TreeNode {
    Long val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(Long val) {
        this.val = val;
    }

    TreeNode(Long val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
