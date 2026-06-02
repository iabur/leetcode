package tree.binaryTreeLevelOrderTraversal;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create tree from dataset [3,9,20,null,null,15,7]
        Integer[] data = {3, 9, 20, null, null, 15, 7};
        TreeNode root = buildTree(data);

        // Call the solution
        Solution solution = new Solution();
        List<List<Integer>> result = solution.levelOrder(root);

        // Print the result
        System.out.println("Level Order Traversal: " + result);
    }

    // Helper method to build tree from array (level-order with nulls)
    private static TreeNode buildTree(Integer[] data) {
        if (data == null || data.length == 0 || data[0] == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(data[0]);
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < data.length) {
            TreeNode node = queue.poll();

            // Add left child
            if (i < data.length) {
                if (data[i] != null) {
                    node.left = new TreeNode(data[i]);
                    queue.add(node.left);
                }
                i++;
            }

            // Add right child
            if (i < data.length) {
                if (data[i] != null) {
                    node.right = new TreeNode(data[i]);
                    queue.add(node.right);
                }
                i++;
            }
        }

        return root;
    }
}
