package tree.invertBinaryTree;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution solution = new Solution();
        TreeNode invertedRoot = solution.invertTree(root);
        printTree(invertedRoot);
    }

    private static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println("Node: " + node.val);
        printTree(node.left);
        printTree(node.right);
    }
}
