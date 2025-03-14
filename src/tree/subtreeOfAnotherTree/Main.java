package tree.subtreeOfAnotherTree;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode subTree = new TreeNode(0);

        Solution solution = new Solution();
        System.out.println(solution.isSubtree(root, subTree));
    }
}
