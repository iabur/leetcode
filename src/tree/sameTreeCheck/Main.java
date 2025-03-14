package tree.sameTreeCheck;

public class Main {
    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(3);
        q.right = new TreeNode(3);

        Solution solution = new Solution();
        System.out.println("Are trees same? " + solution.isSameTree(p, q));
    }

}
