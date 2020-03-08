package IKWebRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithDups {


    public List<List<Integer>> subsetsWithDup(int[] nums){

//        List<List<Integer>> res= new ArrayList<>();
//
//        if(nums==null || nums.length==0){
//            return null;
//        }
//
//        Arrays.sort(nums);
//        helper(nums,0,true,res,new ArrayList<>());
//
//        return res;
//
//    }
//
//    public void helper(int[] num,int i,boolean t,List<List<Integer>> result,List<Integer> curr){
//
//        if(i==num.length){
//            result.add(new ArrayList<>(curr));
//        }
//        else{
//            helper(num,i+1,false,result,curr);
//
//            if(t || num[i-1]!=num[i]){
//                curr.add(num[i]);
//                helper(num,i+1,true,result,curr);
//                curr.remove(curr.size()-1);
//            }
//        }

        List<List<Integer>> results = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return results;
        }

        Arrays.sort(nums);

        List<Integer> subset = new ArrayList<>();
        toFindAllSubsets(nums, results, subset, 0);

        return results;
    }

    private void toFindAllSubsets(int[] nums, List<List<Integer>> results, List<Integer> subset, int startIndex) {
        results.add(new ArrayList<>(subset));

        for (int i = startIndex; i < nums.length; i++) {
            if (i != startIndex && nums[i] == nums[i - 1]) {
                continue;
            }

            subset.add(nums[i]);
            toFindAllSubsets(nums, results, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
