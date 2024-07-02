package DFS2review;

import java.awt.datatransfer.FlavorEvent;
import java.util.ArrayList;
import java.util.List;

/*
Given a set of characters represented by a String, return a list containing all subsets of the characters whose size is K.

Assumptions

There are no duplicate characters in the original set.

​Examples

Set = "abc", K = 2, all the subsets are [“ab”, “ac”, “bc”].

Set = "", K = 0, all the subsets are [""].

Set = "", K = 1, all the subsets are [].
 */
public class AllSubsetsofSizeK {
    public List<String> subSetsOfSizeK(String set, int k) {
        // Write your solution here
        //corn case --------------------------------------------------
        List<String> res = new ArrayList<>();
        char[] array = set.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(res, sb, array, 0, k);
        return res;
    }

    private void helper(List<String> res, StringBuilder sb, char[] array, int i, int k) {
        if(array.length == i){
            if(sb.length() == k){
                res.add(sb.toString());
            }
            return;
        }
        sb.append(array[i]);
        helper(res, sb, array, i +1, k);
        sb.deleteCharAt(sb.length() -1);
        helper(res, sb, array, i +1, k);
    }
}
