package tree;

public class ReverseBinaryTree {


    class Solution {
        public tree.TreeNode invertTree(tree.TreeNode root) {
            if (root == null) {
                return null;
            }
            tree.TreeNode newTreeNode = new TreeNode(root.val);
            newTreeNode.left = invertTree(root.right);
            newTreeNode.right = invertTree(root.left);
            return newTreeNode;
        }
    }
}
