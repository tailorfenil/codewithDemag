package LCRecursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static List<List<Integer>> res = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        res.clear();

        helper(candidates,target,0,new ArrayList<>());

        return res;

    }

    public static void helper(int[] candidates, int target, int index,ArrayList<Integer> al){

        if(target<0){
            return;
        }

        if(target==0){
            res.add(new ArrayList(al));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            al.add(candidates[i]);
            helper(candidates,target-candidates[i],i,al);
            al.remove(al.size()-1);
        }
    }
}
