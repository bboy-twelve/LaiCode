package DFS1;

import java.util.ArrayList;
import java.util.List;


public class L62AllSubsetsI {
    public List<String> subSets(String set) {
        // Write your solution here.
        //corner case--------------------------------------
        List<String> res= new ArrayList<>();
        if(set == null ||set.length() ==0 ) return  res;
        //core --------------------------------------------
        char[] array = set.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(0,res,sb,array);
        return res;
    }

    private void helper(int index, List<String> res,StringBuilder sb, char[] array) {
        if(index == array.length){
            res.add(sb.toString());
            return;
        }
        sb.append(array[index]);
        helper(index +1, res,sb,array);
        sb.deleteCharAt(sb.length()-1);
        helper(index +1, res,sb,array);
    }
}
