package tree.diameterOfBinaryTree;

public class main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));
        Solution solution = new Solution();
        System.out.println(solution.diameterOfBinaryTree(treeNode));
    }
}
