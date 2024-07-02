package DFS1review;
/**
 * Given a set of characters represented by a String, return a list containing all subsets of the characters.
 *
 * Assumptions
 *
 * There are no duplicate characters in the original set.
 * ​Examples
 *
 * Set = "abc", all the subsets are [“”, “a”, “ab”, “abc”, “ac”, “b”, “bc”, “c”]
 * Set = "", all the subsets are [""]
 * Set = null, all the subsets are []
 */


import java.util.ArrayList;
import java.util.List;
public class AllSubsetsI {
    public List<String> subSets(String set) {
        // Write your solution here.
        //corner case------------------------------------------------
        List<String> res = new ArrayList<>();
        if(set == null) return res;
        // core------------------------------------------------------
        StringBuilder sb = new StringBuilder();
        char[] array = set.toCharArray();
        helper(array, set, 0, sb, res);
        return res;
    }

    private void helper(char[] array, String set, int i, StringBuilder sb, List<String> res) {
        if( i == array.length) {
            res.add(sb.toString());
            return;
        }
        sb.append(array[i]);
        helper(array,set, i +1, sb,res);
        sb.deleteCharAt(sb.length() -1);
        helper(array,set, i +1, sb,res);
    }
}
