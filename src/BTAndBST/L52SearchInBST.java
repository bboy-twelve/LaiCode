package BTAndBST;

import BTAndBST.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class L52SearchInBST {
    public TreeNode search(TreeNode root, int key) {
        // Write your solution here
        if(root == null) return null;
        if(root.key < key){
            return search(root.right,key);
        } else if (root.key > key) {
            return search(root.left,key);
        }else{
            return root;
        }
    }
    private TreeNode search2(TreeNode root, int key){
        TreeNode cur = root;

        List<Integer> res = new ArrayList<>();
        while(cur!= null && cur.key != key){
            cur = cur.key < key ?  cur.right : cur.left;
        }
        return cur;
    }


}
