package DFS1;

import java.util.ArrayList;
import java.util.List;

public class L73CombinationsOfCoins {
    public List<List<Integer>> combinations(int target, int[] coins) {
        // Write your solution here
        List<Integer> tem = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(tem, res, target, coins, 0);
        return res;

    }

    private void helper(List<Integer> tem, List<List<Integer>> res, int target, int[] coins, int level) {
        if (level == coins.length) {
            if (target == 0) {
                res.add(new ArrayList<>(tem));
            }
            return;
        }
        int n = target / coins[level];
        for (int i = 0; i <= n; i++) {
            tem.add(i);
            helper(tem, res, target - i * coins[level], coins, level + 1);
            tem.remove(tem.size() - 1);
        }
    }
}
