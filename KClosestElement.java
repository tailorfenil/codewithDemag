package IKWebSorting;

import java.util.Collections;
import java.util.List;

//LeetCode 658
public class KClosestElement {

    //It would be true if the array was not given as sorted and answer can be of any possible solution
//    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//
//        int i= quickSelectHelper(arr,0,arr.length-1,k-1,x);
//
//        // return Arrays.asList(Arrays.copyOfRange(0,i));
//        List<Integer> retList = new ArrayList<Integer>();
//        for(int j=0;j<=i;j++){
//            retList.add(arr[j]);
//        }
//        return retList;
//
//    }
//
//    public static Integer quickSelectHelper(int arr[],int low,int high,int k,int x) {
//
//        if(low>=high){
//            return low;
//        }
//
//        int i= partition(arr,low,high,x);
//
//        if(i==k){
//            return i;
//        }
//        else if(k<i){
//            return quickSelectHelper(arr,low,i-1,k,x);
//        }
//        else{
//            return quickSelectHelper(arr,i+1,high,k,x);
//        }
//    }
//
//    public static int partition(int[] arr,int low,int high,int x){
//
//        int pivot=arr[low];
//        int orange = low;
//
//        for(int green=low+1;green<arr.length;green++){
//            if((Math.abs(arr[green]-x)-Math.abs(pivot-x))<0){
//                orange++;
//                swap(arr,orange,green);
//            }
//        }
//        swap(arr,orange,low);
//        return orange;
//    }
//
//    public static void swap(int[] arr,int orange,int low){
//        int temp= arr[orange];
//        arr[orange]=arr[low];
//        arr[low]=temp;
//    }

    //arr is sorted
    public static List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        int n = arr.size();
        if (x <= arr.get(0)) {
            return arr.subList(0, k);
        } else if (arr.get(n - 1) <= x) {
            return arr.subList(n - k, n);
        } else {
            int index = Collections.binarySearch(arr, x);
            if (index < 0)
                index = -index - 1;
            int low = Math.max(0, index - k - 1), high = Math.min(arr.size() - 1, index + k - 1);

            while (high - low > k - 1) {
                if (low < 0 || (x - arr.get(low)) <= (arr.get(high) - x))
                    high--;
                else if (high > arr.size() - 1 || (x - arr.get(low)) > (arr.get(high) - x))
                    low++;
                else
                    System.out.println("unhandled case: " + low + " " + high);
            }
            return arr.subList(low, high + 1);
        }
    }


}
