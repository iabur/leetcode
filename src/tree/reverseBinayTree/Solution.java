package tree.reverseBinayTree;

public class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode newTreeNode = new TreeNode(root.val);
            newTreeNode.left = invertTree(root.right);
            newTreeNode.right = invertTree(root.left);
            return newTreeNode;
        }
}
