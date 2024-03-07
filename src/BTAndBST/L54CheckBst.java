package BTAndBST;

import BTAndBST.TreeNode;

public class L54CheckBst {
    public boolean isBST(TreeNode root) {
        return isBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isBSTUtil(TreeNode node, long min, long max) {
        // An empty tree is a BST
        if (node == null) return true;

        // False if this node violates min/max constraint
        if (node.key <= min || node.key >= max) return false;

        // Otherwise, check subtrees recursively,
        // tightening the min or max constraint
        return (isBSTUtil(node.left, min, node.key) &&
                isBSTUtil(node.right, node.key, max));
    }
}
