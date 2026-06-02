package tree.binaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> rootVal = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode rootNode = queue.poll();
                rootVal.add(rootNode.val);
                if (rootNode.left != null) {
                    queue.offer(rootNode.left);
                }
                if (rootNode.right != null) {
                    queue.offer(rootNode.right);
                }

            }
            result.add(rootVal);
        }
        return result;
    }
}