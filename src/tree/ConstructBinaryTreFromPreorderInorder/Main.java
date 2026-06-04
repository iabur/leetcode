package tree.ConstructBinaryTreFromPreorderInorder;

public class Main {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Solution solution = new Solution();
        TreeNode root = solution.buildTree(preorder, inorder);

        // Display the tree (level order)
        printTree(root);
    }

    private static void printTree(TreeNode node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.println("Root: " + node.val);
        printLevelOrder(node);
    }

    private static void printLevelOrder(TreeNode root) {
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }
}

