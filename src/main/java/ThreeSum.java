import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    /*
     * Complete the function below.
     */
    // static String[] findZeroSum(int[] arr) {
    //     // Write your code here.
    //     Set<Integer> hs = new HashSet<Integer>();
    //     ArrayList<String> al= new ArrayList<String>();
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         int target= -arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             if(hs.contains(target-arr[j])){
    //                 StringBuilder sb = new StringBuilder();
    //                 sb.append(Integer.toString(arr[i]));
    //                 sb.append(Integer.toString(arr[j]));
    //                 sb.append(Integer.toString(target-arr[j]));
    //                 al.add(sb.toString());
    //             }
    //             else{
    //                 hs.add(arr[j]);
    //             }
    //         }
    //     }
    //     return al.toArray(new String[al.size()]);

    // }

//    Arrays.sort(nums);
//
//    ArrayList<List<Integer>> result = new ArrayList<>();
//
//    for (int i = 0; i < nums.length; i++) {
//        int j = i + 1;
//        int k = nums.length - 1;
//
//        if (i > 0 && nums[i] == nums[i - 1]) {
//            continue;
//        }
//
//        while (j < k) {
//            if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
//                k--;
//                continue;
//            }
//
//            if (nums[i] + nums[j] + nums[k] > 0) {
//                k--;
//            } else if (nums[i] + nums[j] + nums[k] < 0) {
//                j++;
//            } else {
//                ArrayList<Integer> l = new ArrayList<>();
//                l.add(nums[i]);
//                l.add(nums[j]);
//                l.add(nums[k]);
//                result.add(l);
//                j++;
//                k--;
//            }
//        }
//    }

//

    /*
     * Complete the function below.
     */
    // static String[] findZeroSum(int[] arr) {
    //     // Write your code here.
    //     Set<Integer> hs = new HashSet<Integer>();
    //     ArrayList<String> al= new ArrayList<String>();
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         int target= -arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             if(hs.contains(target-arr[j])){
    //                 StringBuilder sb = new StringBuilder();
    //                 sb.append(Integer.toString(arr[i]));
    //                 sb.append(Integer.toString(arr[j]));
    //                 sb.append(Integer.toString(target-arr[j]));
    //                 al.add(sb.toString());
    //             }
    //             else{
    //                 hs.add(arr[j]);
    //             }
    //         }
    //     }
    //     return al.toArray(new String[al.size()]);

    // }

    static String[] findZeroSum(int[] arr) {

        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            int j=i+1;
            int k=arr.length-1;

            if(i>0 && arr[i]==arr[i-1])
                continue;

            while(j<k){

                if(k<arr.length-1 && arr[k+1]==arr[k]){
                    k--;
                    continue;
                }

                if(arr[i]+arr[j]+arr[k]>0) k--;
                else if(arr[i]+arr[j]+arr[k]<0)j++;
                else{
                    al.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[j],arr[k])));
                    j++;k--;
                }
            }
        }
        String[] strings = new String[al.size()];
        int size=-1;
        for(ArrayList<Integer> arrayList:al){
            StringBuilder stringBuilder=new StringBuilder();
            for(int i:arrayList){
                stringBuilder.append(i+",");
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            strings[++size]=stringBuilder.toString();
        }

        return strings;

    }



}
