package DFS1;

import java.util.ArrayList;
import java.util.List;

public class L64AllPermutationsI {
    public List<String> permutations(String input) {
        // Write your solution here
        List<String> res = new ArrayList<>();
        if (input.equals("")) {
            res.add("");
            return res;
        }
        char[] str = input.toCharArray();
        DFS(str, res, 0);
        return res;
    }

    private void DFS(char[] str, List res, int index) {
        if (index == str.length) {
            res.add(String.valueOf(str));
            return;
        }

        for (int i = 0; i < str.length - index; i++) {
            swap(str, index, index + i);
            DFS(str, res, index + 1);
            swap(str, index, index + i);
        }
    }

    private void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
