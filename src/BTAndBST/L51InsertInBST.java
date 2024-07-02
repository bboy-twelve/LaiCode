package BTAndBST;

public class L51InsertInBST {
    public TreeNode insert(TreeNode root, int key) {
        // Write your solution here
        TreeNode dummy = root;
        insertTreeNode(root, key);
        return dummy;
    }

    private TreeNode insertTreeNode(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        int tem = 0;
        if (root.key < key) {
            if (key < root.right.key) {
                tem = root.right.key;
                root.right.key = key;
                key = tem;
            }
            insertTreeNode(root.right.right, key);
        }
        if (root.key > key) {
            if (key > root.left.key) {
                tem = root.left.key;
                root.left.key = key;
                key = tem;
            }
            insertTreeNode(root.left.left, key);
        }
        if (root.key == key) return root;

        return root;
    }
}
