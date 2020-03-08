package IKWebInterview;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {

//    List<String> result = new ArrayList<>();
//    public List<String> restoreIpAddresses(String s) {
//        dfs(s, 0, 0, "");
//        return result;
//    }
//
//    public void dfs(String s, int pos, int num, String cur) {
//        if((4-num)*3 < s.length()-pos || (4-num) > s.length()-pos) {
//            return;
//        }
//        if (num == 3) {
//            if (isValid(s.substring(pos))) {
//                result.add(cur+s.substring(pos));
//            }
//            return;
//        }
//        for (int i = 1; i <=3; i++) {
//            if (s.length() - pos >= i) {
//                if (isValid(s.substring(pos, pos+i))) {
//                    dfs(s, pos+i, num+1, cur+s.substring(pos, pos+i)+".");
//                }
//            }
//        }
//    }
//
//    public boolean isValid(String s) {
//        if (s.length() > 1 && s.charAt(0) == '0') {
//            return false;
//        }
//        int value = Integer.valueOf(s);
//        if (value > 255 || value < 0) {
//            return false;
//        }
//        return true;
//    }

   // ----Part-2

//    List<String> res= new ArrayList<>();
//    public List<String> restoreIpAddresses(String s){
//
//        helper(s,0,0,new String[4]);
//
//        return res;
//
//
//    }
//
//    public void helper(String s,int segment, int i,String arr[]){
//
//
//        if(segment==4 &&  i==s.length()){
//            //System.out.println(arr[0]+"."+arr[1]+"."+arr[2]+"."+arr[3]);
//            res.add(arr[0]+"."+arr[1]+"."+arr[2]+"."+arr[3]);
//        }
//        else if(segment==4 || i==s.length()) {
//            return;
//        }
//        else{
//            for(int j=1;j<=3;j++){
//                if(i+j<=s.length()) {
//                    String strValue = s.substring(i, i + j);
//                    int intValue = Integer.parseInt(strValue);
//
//                    if (intValue > 255 || ((j) > 1 && strValue.charAt(0) == '0')) {
//                        break;
//                    }
//
//                    arr[segment] = strValue;
//                    helper(s, segment + 1, i + j, arr);
//                    arr[segment] = "-1";
//                }
//            }
//        }
//
//
//    }


    List<String> result = new ArrayList<String>();
    public List<String> restoreIpAddresses(String s) {
        helper(s,0,0,new String[4]);
        return result;

    }


    public void helper(String s,int index,int segment,String[] curr){

        if(segment==4 && index==s.length()){
            result.add(curr[0]+"."+curr[1]+"."+curr[2]+"."+curr[3]);
            return;
        }
        else if(segment==4 || index>=s.length()){
            return;
        }

//        for(int i=0;i<3;i++) {
//            if (i + index+1 <= s.length()) {
//                curr[segment] = s.substring(index, index + i + 1);
//                if (Integer.parseInt(curr[segment]) > 255 || i>=1 && curr[segment].charAt(0) == '0') {
//                    curr[segment] = "";
//                    return;
//                }
//                helper(s, index + i + 1, segment + 1, curr);
//                curr[segment] = "";
//            }
//        }

        for(int i=index;i<index+3;i++){

            if(i<s.length()){

                curr[segment]= s.substring(index,i+1);

                if(Integer.parseInt(curr[segment])>255 || (i>index && curr[segment].charAt(0)=='0')){
                    return;
                }
            }
            helper(s,i+1,segment+1,curr);

        }
    }

}
