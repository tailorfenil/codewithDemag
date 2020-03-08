package IBInterview;

import java.util.ArrayList;
import java.util.List;

public class MiceAndHoles {


    /*
    There are N Mice and N holes are placed in a straight line.
    Each hole can accomodate only 1 mouse.
    A mouse can stay at his position, move one step right from x to x + 1, or move one step left from x to x − 1. Any of these moves consumes 1 minute.
    Assign mice to holes so that the time when the last mouse gets inside a hole is minimized.
     */

    static ArrayList<ArrayList<Integer>> res= new ArrayList<>();
    static int min=Integer.MAX_VALUE;
    static int sum=0;
    public static int mice(List<Integer> A, List<Integer> B) {
        permutation(B,0,new ArrayList<Integer>());

        for(int i=0;i<res.size();i++){
           for(int j=0;j<res.get(i).size()-1;j++){

                sum+=Math.abs(A.get(j)-res.get(i).get(j));

            }
            if(sum<min) {
                min = sum;
            }
        }
        return min;

    }


    public static void permutation(List<Integer> B,int index,ArrayList<Integer> al){

        if(al.size()==B.size()){
            res.add(new ArrayList(al));
            return;
        }

        for(int i=index;i<B.size();i++){
            swap(i,index,B);
            al.add(B.get(index));
            permutation(B,index+1,al);
            swap(i,index,B);
            al.remove(al.size()-1);
        }

    }

    public static void swap(int i, int j, List<Integer> al){

        int temp= al.get(i);
        al.set(i,al.get(j));
        al.set(j,temp);

    }
}
