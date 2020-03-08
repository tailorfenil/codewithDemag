package IBRecursion;

import java.util.ArrayList;

public class combinationSumWithManyTimesAllow {


    static ArrayList<ArrayList<Integer>> res= new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> combinationSum(int[] A, int B) {
        helper(A,B,0,0,new ArrayList<Integer>());

        //return convertItToArray(res,A.length);

        return res;

    }

    public static void helper(int[] A, int target,int index,int sum, ArrayList<Integer> al){

        if(sum>target){
            return;
        }
        if(sum==target){
            res.add(new ArrayList(al));
            return;
        }

        for(int i=index;i<A.length;i++){
            sum+=A[i];
            al.add(A[i]);
            helper(A,target,i,sum,al);
            al.remove(al.size()-1);
            sum-=A[i];
        }

    }

}
