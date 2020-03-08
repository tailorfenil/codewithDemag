package LCRecursion;

import java.util.HashMap;
import java.util.HashSet;

public class JumpGameIII {

    public boolean canReach(int[] arr, int start) {

        return helper(arr,start,new HashSet<Integer>());

    }


    public boolean helper(int[] arr, int start, HashSet<Integer> hashSet){

        if(start>=arr.length || start<0 || hashSet.contains(start)){  //Todo:: Very Imp -- As we are taking DFS here, we are exhausting all possibilities. So if we got answer
             // while pruning any branch we will return True in that case and as there is an OR operation we don't need to go and collect the value for that start value in hashset/hashMap
            // If we are getting false after doing DFS on that subTree we can safely return false if we have seen that again
            return false;
        }

        if(arr[start]==0){
            return true;
        }

        hashSet.add(start);

        boolean minus = helper(arr,start-arr[start],hashSet);
        boolean plus = helper(arr,start+arr[start],hashSet);
        return minus||plus;

    }




}
