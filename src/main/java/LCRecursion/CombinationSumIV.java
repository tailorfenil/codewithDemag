package LCRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIV {

//    static List<List<Integer>> res = new ArrayList<>();
//
//    public static int combinationSum4(int[] nums, int target) {
//
//        helper(nums,target,0,new ArrayList<>());
//
//        return res.size();
//
//    }
//
//    public static void helper(int[] candidates, int target, int index,ArrayList<Integer> al){
//
//        if(target<0){
//            return;
//        }
//
//        if(target==0){
//            res.add(new ArrayList(al));
//            return;
//        }
//
//        for(int i=index;i<candidates.length;i++){
//            al.add(candidates[i]);
//            helper(candidates,target-candidates[i],index,al);
//            al.remove(al.size()-1);
//        }
//    }

    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp= new int[target+1];
        Arrays.fill(dp, -1);
        return getCombination(nums, target, 0);
    }

    private int getCombination(int[] nums, int target, int sum){
        if(dp[sum]!=-1)return dp[sum];
        if(sum==target)return 1;
        int count = 0;
        for(int num : nums){
            if(sum+num<=target)
                count+=getCombination(nums, target, sum+num);
        }
        dp[sum] = count;
        return dp[sum];
    }
}
