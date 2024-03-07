package BTAndBST;

import BTAndBST.TreeNode;

public class L50TweakedIdenticalBT {
    public boolean isTweakedIdentical(TreeNode one, TreeNode two) {
        // Write your solution here
        //core case  left and right  are all null     is ture
        if(one == null && two == null) return true;
        //if one of children is null , other is not null return false;
        if(one == null || two == null) return  false;
        if (one.key != two.key) return false;
        return isTweakedIdentical(one.left, two.left) && isTweakedIdentical(one.right, two.right)
                ||
                isTweakedIdentical(one.left, two.right) && isTweakedIdentical(one.right, two.left);
    }

}
