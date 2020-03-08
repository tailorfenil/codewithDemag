package LCString;

import java.util.ArrayList;

public class KMPFindIndices {


    public static int[] KMP(String t, String p) {

        ArrayList<Integer> al= findIndexOfMatching(t.toCharArray(), p.toCharArray());

        int[] returnres= new int[al.size()];

        for(int i=0;i<al.size();i++){
            returnres[i]=al.get(i);
        }

        return returnres;
    }


    static int[] preCompute(char[] p){

        int index=0;
        int[] lps= new int[p.length];
        for(int i=1;i<p.length;){
            if(p[i]==p[index]){
                lps[i]=index+1;
                index++;
                i++;
            }
            else{
                if(index==0){
                    lps[i]=0;
                    i++;
                }
                else{
                    //lps[i]=lps[i-1];  wrong, here we need to set index;
                    index= lps[index-1];//correct instead of above statement
                    //i++; here we should not increment count
                }
            }
        }
        return lps;

    }

    static ArrayList<Integer> findIndexOfMatching(char[] t,char[] p){

        int i=0,j=0;  //i for text ,j for pattern

        int[] lps= preCompute(p);

        ArrayList<Integer> res= new ArrayList<>();


        while(i<t.length){

            if(t[i]==p[j]){
                i++;
                j++;
            }
            else{
                if(j>0){
                    j=lps[j-1];
                }
                else{
                    //   j=0; j here is zero only
                    i++;
                }
            }
            if(j==p.length){
                res.add(i-j);
                //j=0;
                j=lps[j-1]; // so important text-cccc pattern -cc if we do this we have result as 0,2 but we need result as 0,1,2 that's why we need to fo j=lps[j-1]
            }

        }

        if(res.size()==0){
            res.add(-1);
        }

        return res;


    }
}
