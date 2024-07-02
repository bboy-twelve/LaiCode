package DFS2review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a set of characters represented by a String, return a list containing all subsets of the characters. Notice that each subset returned will be sorted to remove the sequence.

Assumptions

There could be duplicate characters in the original set.
​Examples

Set = "abc", all the subsets are ["", "a", "ab", "abc", "ac", "b", "bc", "c"]
Set = "abb", all the subsets are ["", "a", "ab", "abb", "b", "bb"]
Set = "abab", all the subsets are ["", "a", "aa","aab", "aabb", "ab","abb","b", "bb"]
Set = "", all the subsets are [""]
Set = null, all the subsets are []
 */
public class AllSubset {
    public List<String> subSets(String set) {
        // Write your solution here.
        List<String> res = new ArrayList<>();
        char[] array = set.toCharArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        helper(sb,array,res, 0);
        return res;
    }

    private void helper(StringBuilder sb, char[] array, List<String> res, int level) {
        if(level == array.length){
            res.add(sb.toString());
            return;
        }
        sb.append(array[level]);
        helper(sb, array, res, level +1);
        sb.deleteCharAt(sb.length() -1);
        while(array[level] == array[level+1] && level+ 1 < array.length){
            level ++;
        }
        helper(sb, array, res, level +1);

    }
}
