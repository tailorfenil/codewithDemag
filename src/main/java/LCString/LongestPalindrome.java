package LCString;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        int max= Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;

        StringBuffer sb = new StringBuffer();

        ArrayList<String> res = new ArrayList<>();

        for(int k1=0;k1<s.length();k1++){
            sb.append(s.charAt(k1));
            //sb.append('$');
        }
        //sb.delete(sb.length()-1,sb.length());
        String s1= sb.toString();

        for(int i=0;i<s1.length();i++){
          //for(j=i-1,k=i+1;j<0 && k>s.length()-1;j--,k++){

             int j= i;
             int k= i;

            while(j>=0 && k<=s1.length()-1) {
                if (s1.charAt(j) != s1.charAt(k)) {
                    //max = Math.max(max, ((j + 1) - (k-1)+1));
                    min= Math.min(min,j);
                    max= Math.max(k,max);
                    break;
                }
                j--;
                k++;
            }
            res.add(s1.substring(j+1,k).replaceAll("$",""));

            j= i;
            k= i+1;
            while(j>=0 && k<=s1.length()-1) {
                if (s1.charAt(j) != s1.charAt(k)) {
                    //max = Math.max(max, ((j + 1) - (k-1)+1));
                    min= Math.min(min,j);
                    max= Math.max(k,max);
                    break;
                }
                j--;
                k++;
            }
            res.add(s1.substring(j+1,k).replaceAll("$",""));
          //}
        }
        System.out.println(res);
        return s1.substring(min,max);
//        return s.substring(j,k+1).replaceAll("$","");

    }
}
