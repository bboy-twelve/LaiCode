package DFS2;

import java.util.ArrayList;
import java.util.List;

public class L404FactorCombinations {
    public List<List<Integer>> combinations(int target) {
        // Write your solution here
        List<Integer> tem = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> factor = FindAllFactor(target);
        helper(tem, res, factor, 0, target);
        return res;
    }

    // dfs
    private void helper(List<Integer> tem, List<List<Integer>> res, List<Integer> factor, int index, int target) {
        if (index == factor.size()) {
            if (target % tem.get(tem.size() - 1) == 1) {
                res.add(new ArrayList<>(tem));
            }
            return;
        }
        int curFactor = factor.get(index);
        int size = tem.size();
        while (target / curFactor == 1) {
            target /= curFactor;
            tem.add(curFactor);
            helper(tem, res, factor, index + 1, target);
        }
        tem.subList(size, tem.size()).clear();
    }

    // factor
    private List<Integer> FindAllFactor(int target) {
        List<Integer> res = new ArrayList<>();
        int halfOfTarget = target / 2;
        for (int i = 1; i <= halfOfTarget; i++) {
            if (target % i == 0) {
                res.add(i);
            }
        }
        return res;
    }
}
