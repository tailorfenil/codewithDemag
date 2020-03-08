package IKWebRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePalindromicDecomposition {



    static List<String> res= new ArrayList<>();
    static StringBuffer  sb = new StringBuffer(); //No String Buffer please
    //took example aaa
    public static String[] generate_palindromic_decompositions(String s){

        //Mistake , if we are removing substring like |a,*1 etc multiple character , use stringbuffer
        helper(s,0, "");
        return res.toArray(new String[res.size()]);

    }


     static boolean isPalindrome(String s, int start,int end){

        for(int i=start,j=end;i<=(end-start)/2;i++,j--){

            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;

    }


     static void helper(String s, int index,String sb){
                        //StringBuffer sb,){   // No StringBuffer , use String instead


        if(index==s.length()){
            res.add(sb);
            return;
        }

        for(int i=index;i<s.length();i++){

            if(isPalindrome(s,index,i)){

                if(index==0){  //why index and not i
                    helper(s,i+1,s.substring(index, i+1));
                }
                else{
                    helper(s,i+1,sb+"|"+s.substring(index, i+1));
                }

            }

        }



    }
}
