package BTAndBST;

public class L60HeightofBT {
    public int findHeight(TreeNode root) {
        // Write your solution here
        if(root == null){
            return 0 ;
        }
        int leftOfHeight =  findHeight(root.left);
        int rightOfHeight = findHeight(root.right);
        return  Math.max(leftOfHeight,rightOfHeight) +1;
    }


}
