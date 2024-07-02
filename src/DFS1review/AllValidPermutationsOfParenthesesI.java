package DFS1review;

import java.util.ArrayList;
import java.util.List;

/**
 * Given N pairs of parentheses “()”, return a list with all the valid permutations.
 *
 * Assumptions
 *
 * N > 0
 * Examples
 *
 * N = 1, all valid permutations are ["()"]
 * N = 3, all valid permutations are ["((()))", "(()())", "(())()", "()(())", "()()()"]
 *
 */

public class AllValidPermutationsOfParenthesesI {
    public List<String> validParentheses(int n) {
        // Write your solution here
        //corner case -----------------------------------
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        //core ------------------------------------------
        helper(n,0, 0, res, sb);

        return res;
    }

    private void helper(int n,int l,int r, List<String> res, StringBuilder sb) {
        if(l+ r == 2*n ){
            res.add(sb.toString());
            return;
        }
        if(l< n){
            sb.append("(");
            helper(n,l + 1,r,res,sb);
            sb.deleteCharAt(sb.length() -1);
        }
        if(r < n && r < l){
            sb.append(")");
            helper(n,l,r + 1 ,res,sb);
            sb.deleteCharAt(sb.length() -1);
        }

    }
}
