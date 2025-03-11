package tree;

public class main {
    public static void main(String[] args) {
// call maximum depth with dummy data
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        MaximumDepth solution = new MaximumDepth();
        int depth = solution.maxDepth(root);
        System.out.println("Maximum Depth: " + depth);
    }
}
