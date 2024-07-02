package DFS1review;

import java.util.ArrayList;
import java.util.List;

/*
Given a string with no duplicate characters, return a list with all permutations of the characters.

Assume that input string is not null.

Examples

Set = “abc”, all permutations are [“abc”, “acb”, “bac”, “bca”, “cab”, “cba”]

Set = "", all permutations are [""]
 */
public class AllPermutationsI {
    public List<String> permutations(String input) {
        // Write your solution here
        // corner case
        List<String> res = new ArrayList<>();
        if (input.equals("")) {
            res.add("");
            return res;
        }
        //core ----------------------------------------
        char[] array = input.toCharArray();
        helper(res, 0, array);
        return res;
    }

    private void helper(List<String> res, int index, char[] array) {
        if (index == array.length) {
            res.add(String.valueOf(array));
            return;
        }
        for (int i = index; i < array.length; i++) {
            swap(i, index, array);
            helper(res, index + 1, array);
            swap( i, index, array);

        }
    }

    private void swap(int i, int j, char[] array) {
        char a = array[i];
        array[i] = array[j];
        array[j] = a;
    }
}
