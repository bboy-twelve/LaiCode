package DFS2review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

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
public class AllSubsetsIIreview {
    public List<String> subSets(String set) {
        // Write your solution here.
        // corner case----------------------------------------------
        List<String> res = new ArrayList<>();
        if(set ==null) return res;
        // core ----------------------------------------------------
        char[] array = set.toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(array);
        helper(array, sb, 0, res);

        return res;
    }

    private void helper(char[] array, StringBuilder sb, int level, List<String> res) {
        if (level == array.length) {
            res.add(sb.toString());
            return;
        }
        sb.append(array[level]);
        helper(array, sb, level + 1, res);
        sb.deleteCharAt(sb.length() -1);
        while (level +1 < array.length && array[level] == array[level +1]){
            level++;
        }
        helper(array, sb, level + 1, res);
    }

}
