package tree.LowestCommonAncestorOfBST;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    // Build tree from level-order array, find nodes with given values, call Solution and print result.
    public static void main(String[] args) {
        Integer[] vals = {6,2,8,0,4,7,9,null,null,3,5};
        int pVal = 2;
        int qVal = 8;

        TreeNode root = buildTree(vals);
        TreeNode pNode = findNode(root, pVal);
        TreeNode qNode = findNode(root, qVal);

        if (pNode == null || qNode == null) {
            System.out.println("One of the nodes was not found in the tree.");
            return;
        }

        Solution sol = new Solution();
        TreeNode lca = sol.lowestCommonAncestor(root, pNode, qNode);
        System.out.println(lca != null ? lca.val : null);
    }

    private static TreeNode buildTree(Integer[] vals) {
        if (vals == null || vals.length == 0) return null;
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < vals.length && !q.isEmpty()) {
            TreeNode node = q.poll();
            if (node == null) continue;

            // left
            if (i < vals.length) {
                Integer v = vals[i++];
                if (v != null) {
                    node.left = new TreeNode(v);
                    q.add(node.left);
                } else {
                    q.add(null);
                }
            }

            // right
            if (i < vals.length) {
                Integer v = vals[i++];
                if (v != null) {
                    node.right = new TreeNode(v);
                    q.add(node.right);
                } else {
                    q.add(null);
                }
            }
        }
        return root;
    }

    private static TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        TreeNode left = findNode(root.left, val);
        if (left != null) return left;
        return findNode(root.right, val);
    }
}
