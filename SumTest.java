package IKWebRecursion;

import java.util.stream.IntStream;

public class SumTest {


    /*
     * Complete the function below.
     */
    public static boolean check_if_sum_possible(long[] arr, long k) {

        //int sum = Math.min(0,k)<0 ? Integer.MIN_VALUE : 0;

        return helper(arr,0,0,k,false);

    }

    public static boolean helper(long[] arr,long sum,int i, long k,boolean included){

        if(sum==0 && included){
            return true;
        }

        if(sum<k){
            return false;
        }

        if(i==arr.length && included){
            return false;
        }

        boolean b1= helper(arr,sum,i+1,k,included);

        sum-=arr[i];
        boolean b2= helper(arr,sum,i+1,k,true);
        sum+=arr[i];

        return (b2||b1);

    }



}
