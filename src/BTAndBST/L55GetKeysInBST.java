package BTAndBST;

import BTAndBST.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L55GetKeysInBST {
    public List<Integer> getRange(TreeNode root, int min, int max) {
        // Write your solution here
        //core case
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        helper(root, min, max, res);
        return res;
    }

    private void helper(TreeNode root, int min, int max, List<Integer> res) {
        if (root == null) return;
        if (root.key > min) {
            helper(root.left, min, max, res);
        }
        if (root.key >= min && root.key <= max) {
            res.add(root.key);
        }
        if (root.key < max) {
            helper(root.right, min, max, res);
        }
    }
}
