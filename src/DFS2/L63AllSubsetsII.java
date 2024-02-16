package DFS2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L63AllSubsetsII {
    public List<String> subSets(String set) {
        // Write your solution here.
        //corner case --------------------------------------
        List<String> res = new ArrayList<>();
        if (set == null) return res;
        //core  --------------------------------------------
        char[] array = set.toCharArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        helper(sb, array, res, 0);
        return res;
    }

    private void helper(StringBuilder sb, char[] array, List<String> res, int index) {
        if (index == array.length) {
            res.add(sb.toString());
            return;
        }
        sb.append(array[index]);
        helper(sb, array, res, index + 1);
        sb.deleteCharAt(sb.length() - 1);
        while (index + 1 <= array.length - 1 && array[index] == array[index + 1]) {
            index++;
        }
        helper(sb, array, res, index + 1);
    }
}
