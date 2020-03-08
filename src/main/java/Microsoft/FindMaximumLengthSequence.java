package Microsoft;

import java.util.Arrays;
import java.util.HashMap;

public class FindMaximumLengthSequence {

    public int find_max_length_sort(int[] arr){

        Arrays.sort(arr);

        int length=0;
        for(int i=0;i<arr.length-1;){

            int k=i;
            int count=1;

            while(k<arr.length-1 && arr[k+1]==arr[k]+1){
                count++;
                k++;
            }
            i=k;
            i++;

            length=Math.max(length,count);

        }

        return length;
    }


    public int find_max_length_optimize(int[] arr){


        HashMap<Integer,Integer> hm =new HashMap<>();

        boolean[] visited = new boolean[arr.length];

        int count=0,max_length=0;

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){

            if(!visited[i]){

                count=1;
                visited[i]=true;
                int forward=arr[i]+1;

                while(hm.containsKey(forward)){
                    visited[hm.get(forward)]=true;
                    count++;
                    forward =forward+1;
                }

                int backward= arr[i]-1;
                while(hm.containsKey(backward)){
                    visited[hm.get(backward)]=true;
                    count++;
                    backward =backward-1;
                }


            }

            max_length =Math.max(max_length,count);

        }

        return max_length;

    }
}
