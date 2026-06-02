package tree.KthSmallestElementInABST;

public class Main {
    public static void main(String[] args) {
        // Test case: [3,1,4,null,2]
        // Tree structure:
        //     3
        //    / \
        //   1   4
        //    \
        //     2

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        Solution solution = new Solution();
        int k = 1; // Find 1st smallest element
        int result = solution.kthSmallest(root, k);

        System.out.println("Kth smallest element (k=" + k + "): " + result);
    }
}
