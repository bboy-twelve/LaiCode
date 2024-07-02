package DFS2review;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer number, return all possible combinations of the factors that can multiply to the target number.

Example

Give A = 24

since 24 = 2 x 2 x 2 x 3

              = 2 x 2 x 6

              = 2 x 3 x 4

              = 2 x 12

              = 3 x 8

              = 4 x 6

your solution should return

{ { 2, 2, 2, 3 }, { 2, 2, 6 }, { 2, 3, 4 }, { 2, 12 }, { 3, 8 }, { 4, 6 } }

note: duplicate combination is not allowed
 */
public class FactorCombinations {
    public List<List<Integer>> combinations(int target) {
        // Write your solution here
        List<List<Integer>> res = new ArrayList<>();
        if (target < 2) return res;
        List<Integer> factors = factor(target);
        List<Integer> cur = new ArrayList<>();
        helper(target, factors, res, cur, 0);
        return res;
    }

    private void helper(int target, List<Integer> l, List<List<Integer>> res, List<Integer> cur, int index) {
        if (index == l.size()) {
            if (target == 1) {
                res.add(new ArrayList<>(cur));
            }
            return;
        }
        helper(target, l, res, cur, index + 1);
        int factor = l.get(index);
        int size = cur.size();
        while (target % factor == 0) {
            target /= factor;
            cur.add(factor);
            helper(target, l, res, cur, index + 1);
        }
        cur.subList(size, cur.size()).clear();
    }

    private List<Integer> factor(int target) {
        List<Integer> l = new ArrayList<>();
        for (int i = target / 2; i > 1; i--) {
            if (target % i == 0) {
                l.add(i);
            }
        }
        return l;
    }
}
