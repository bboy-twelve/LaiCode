package BTAndBST;

public class L46CheckBTIsBalanced {
    public boolean isBalanced(TreeNode root) {
        // Write your solution here
        return checkBT(root) == -1 ? false : true;

    }

    private int checkBT(TreeNode root) {
        if (root == null) return 0;
        int leftOfHeight = checkBT(root.left);
        if (leftOfHeight == -1) return -1;
        int rightOfHeight = checkBT(root.right);
        if (rightOfHeight == -1) return -1;
        if(Math.abs(leftOfHeight - rightOfHeight) > 1){
            return  -1;
        }
        return Math.max(leftOfHeight, rightOfHeight) +1;
    }


}
