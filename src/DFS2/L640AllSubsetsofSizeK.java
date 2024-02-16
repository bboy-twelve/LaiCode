package DFS2;

import java.util.ArrayList;
import java.util.List;

public class L640AllSubsetsofSizeK {
    public List<String> subSetsOfSizeK(String set, int k) {
        // Write your solution here
        // corner case ------------------------------------
        // core--------------------------------------------
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] array = set.toCharArray();
        helper(k,res,sb,array,0);
        return res;
    }

    private void helper(int k, List<String> res, StringBuilder sb, char[] array, int index) {
        if(sb.length() == k){
            res.add(sb.toString());
            return;
        }
        if(index == array.length) return;
        sb.append(array[index]);
        helper(k,res,sb,array,index +1);
        sb.deleteCharAt(sb.length() -1);
        helper(k,res,sb,array,index +1);


    }
}
