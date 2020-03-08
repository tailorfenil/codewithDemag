package IBRecursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PermutationWithDuplicate {

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> permute(List<Integer> A) {

        helper(A,new ArrayList<Integer>(),0);
       return result;
    }


    public  static void helper(List<Integer> A,ArrayList<Integer> res,int i){

        if(res.size()==A.size()){
            result.add(new ArrayList(res));
        }
        HashSet<Integer> hm = new HashSet<Integer>();
        for(int index=i;index<A.size();index++){
            if(!hm.contains(A.get(index))) {
                swap(A, i, index);
                res.add(A.get(i));
                helper(A, res, i + 1);
                swap(A, i, index);
                res.remove(res.size()-1);
                hm.add(A.get(index));
            }

        }


    }

    public static void swap(List<Integer> A,int i, int j){
        //System.out.println(i+" "+j+" "+A.get(i)+" "+A.get(j));
        int temp= A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);

    }




}
