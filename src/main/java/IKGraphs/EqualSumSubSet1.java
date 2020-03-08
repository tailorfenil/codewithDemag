package IKGraphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualSumSubSet1 {


    static int findIndex(List<Set<Integer>> setList,int firstIndex,int value){

        for(int i=0;i<firstIndex;i++){

            if(setList.get(i).contains(value))
                return i;
        }

        return -1;

    }


    public static List<Boolean> equalSubSetSumPartition(List<Integer> s) {


        int sum=0;

        List<Boolean> returnValue = new ArrayList<>();

        for(int i=0;i<s.size();i++){
            sum+=s.get(i);
        }

        if(sum%2==1){
            return returnValue;
        }

        List<Set<Integer>> setList = new ArrayList<>();

        setList.add(new HashSet<Integer>());
        setList.get(0).add(s.get(0));

        for(int i=1;i<s.size();i++){
            setList.add(new HashSet<Integer>());
            setList.get(i).add(s.get(i));
            for(Integer k: setList.get(i-1)){
                setList.get(i).add(k);
                setList.get(i).add(k+s.get(i));
            }
        }

        for(int i=0;i<setList.size();i++){

            if(setList.get(i).contains(sum/2)){
                int firstIndex=i;

                for(int  j=0;j<=firstIndex;j++){
                    returnValue.add(false);
                }

                returnValue.set(firstIndex,true);

                int val = sum/2 - s.get(firstIndex);

                while(val!=0){

                    int ind = findIndex(setList,firstIndex,val);

                    if(ind==-1){
                        return new ArrayList<>();
                    }
                    returnValue.set(ind,true);
                    val = val-s.get(ind);

                }


                for(int  j=firstIndex+1;j<s.size();j++){
                    returnValue.add(false);
                }
            }

        }

        return returnValue;


  }


//    public static Parent helper(List<Integer> s, int sum,Parent parent){
//
//        if(parent.index==s.size()){
//            return null;
//        }
//
//        if(sum==0){
//            return parent;
//        }
//
//
//        helper(s,sum-s.get(parent.index),new Parent(parent.index+1,parent.index));
//
//        helper(s,sum, new Parent(parent.index+1,Integer.MAX_VALUE));
//
//        return null;
//
//    }
//
//
//    static class Parent{
//
//        int index;
//        int parentIndex;
//
//        Parent(int index,int parentIndex){
//            this.index=index;
//            this.parentIndex=parentIndex;
//        }
//
//    }
}

