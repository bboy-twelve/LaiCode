package DFS1;

import java.util.ArrayList;
import java.util.List;

public class L66AllValidPermutationsOfParenthesesI {
    public List<String> validParentheses(int n) {
        // Write your solution here
        //corner case --------------------------------
        //core---------------------------------------
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int left=0,right =0;
        helper(sb,0,0,n,res);
        return  res;
    }

    private void helper(StringBuilder sb, int left,int right,int n, List<String> res) {
        if(left == n && right == n && sb.length() == 2*n){
            res.add(sb.toString());
            return;
        }
        if(left <= n){
            sb.append("(");
            helper(sb,left +1,right,n,res);
            sb.deleteCharAt(sb.length() -1);
            helper(sb,left +1,right,n,res);
        }
        if(right <= n && right <+left){
            sb.append(")");
            helper(sb,left ,right +1,n,res);
            sb.deleteCharAt(sb.length() -1);
            helper(sb,left ,right +1,n,res);
        }
    }
}
