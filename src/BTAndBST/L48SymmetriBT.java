package BTAndBST;

public class L48SymmetriBT {
    public boolean isSymmetric(TreeNode root) {
        // Write your solution here
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode one, TreeNode two) {
        if (one == null && two == null) return true;
        if (one == null || two == null) return false;
        if(one.key != two.key) return false;
        return isSymmetric(one.left,two.right) && isSymmetric(one.right,two.left);
    }
}
