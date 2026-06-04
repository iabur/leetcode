package tree.ConstructBinaryTreFromPreorderInorder;

import java.util.HashMap;
import java.util.Map;

class Solution {

    int preOrderIndex = 0;
    Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return build(preorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int left, int right) {
        if (right < left) {
            return null;
        }

        int root = preorder[preOrderIndex++];
        int inorderIndex = inorderMap.get(root);

        TreeNode node = new TreeNode(root);
        node.left = build(preorder, left, inorderIndex - 1);
        node.right = build(preorder, inorderIndex + 1, right);
        return node;
    }

}