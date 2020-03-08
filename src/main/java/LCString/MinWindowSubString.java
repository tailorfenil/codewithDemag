package LCString;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {

//    public static String minWindow(String s, String t) {
//
//        int right=0,left=0,count=0,left_point_answer=0,right_point_answer=0,minright=Integer.MAX_VALUE,minleft=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
//
//        HashMap<Character,Integer> hm = new HashMap<>();
//
//        HashMap<Character,Integer> hmPattern = new HashMap<>();
//
//        for(int i=0;i<t.length();i++){
//            hmPattern.put(t.charAt(i),hmPattern.getOrDefault(t.charAt(i),0)+1);
//        }
//
//        for(right=0;right<s.length();){
//
//            if(count!=t.length()){
//                if(t.contains(String.valueOf(s.charAt(right)))){
//
//                    if(!hm.containsKey(s.charAt(right))){
//                        hm.put(s.charAt(right),1);
//                    }
//                    else{
//                        hm.put(s.charAt(right),hm.get(s.charAt(right))+1);
//                    }
//                    if(hm.get(s.charAt(right)).intValue()==hmPattern.get(s.charAt(right)).intValue()){
//                        count++;
//                    }
//                }
//                right++;
//            }
//
//            else {
//                right_point_answer=right;
//                if(t.contains(String.valueOf(s.charAt(left)))){
//                    if(hm.containsKey(s.charAt(left))){
//                        hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
//                    }
//                    if(hm.get(s.charAt(left)).intValue() < hmPattern.get(s.charAt(left)).intValue()){
//                        count--;
//                    }
//                }
//                left++;
//                left_point_answer=left;
//                if(right_point_answer-left_point_answer<min){ //oh yes, we need to maintain minimum here to return min length substring
//                    minright=right_point_answer;
//                    minleft=left_point_answer;
//                    min=right_point_answer-left_point_answer;
//                }
//
//            }
//
//        }
//
//        while(count==hmPattern.size()){ //after entire string has traversed what ever useless left in left we need to remove
//            right_point_answer=right;
//            if(hm.containsKey(s.charAt(left))) {
//                hm.put(s.charAt(left), hm.get(s.charAt(left)) - 1);
//
//                if (hm.get(s.charAt(left)).intValue() < hmPattern.get(s.charAt(left)).intValue()) {
//                    count--;
//                }
//            }
//            left++;
//            left_point_answer=left;
//            if(right_point_answer-left_point_answer<min){
//                minright=right_point_answer;
//                minleft=left_point_answer;
//                min=right_point_answer-left_point_answer;
//            }
//        }
//
//            if(left_point_answer==0){ //corner case where left didn't move
//                return "";
//            }
//            return s.substring(minleft-1,minright);
//
//    }


    public static String minWindow(String s, String t) {


        if(s.length()==0 || t.length()==0){
            return "";
        }

        Map<Character,Integer> hmPattern = new HashMap<>();

        for(int i=0;i<t.length();i++){
            int value=hmPattern.getOrDefault(t.charAt(i),0)+1;
            hmPattern.put(t.charAt(i),value);
        }
        int left=0,right=0,count=0;

        StringBuilder sb = new StringBuilder();

        int[] ans= new int[]{-1,0,0}; //really important to return as we can not rely on l and r as they keep updating. Once we have solution save //it

        HashMap<Character,Integer> hmText = new HashMap<>();


        while(right<s.length()){

            if(hmPattern.containsKey(s.charAt(right))){

                hmText.put(s.charAt(right),hmText.getOrDefault(s.charAt(right),0)+1);

                if(hmText.get(s.charAt(right))==hmPattern.get(s.charAt(right))){
                    count++;
                }
            }

            while(left<=right && count==hmPattern.size()){

                //if(ans==Integer.MAX_VALUE || ans>right-left+1){
                if(ans[0]==-1 || right-left+1<ans[0]){}
                ans[0]=right-left+1;
                ans[1]=left;
                ans[2]=right;
                //sb.append(t.substring(left, right));

                if(hmPattern.containsKey(s.charAt(left))){

                    hmText.put(s.charAt(left),hmText.getOrDefault(s.charAt(left),0)-1);

                    if(hmText.get(s.charAt(left))<hmPattern.get(s.charAt(left))){
                        count--;
                    }
                }
                left++;
            }

            right++;
        }
        return ans[0]==-1 ? "" : s.substring(ans[1],ans[2]+1);
    }

    public static String minWindowWithSuperbLogic(String s, String t){

        if(s.length() == 0 || t.length() == 0) return "";
        int left = 0, right = 0;
        String res = "";
        int[] arrS = new int[256];
        int[] arrT = new int[256];
        for(int i=0; i<t.length(); i++){
            arrT[t.charAt(i)]++;
        }
        int found = 0;
        while(right < s.length()){
            if(arrT[s.charAt(right)] > 0) {
                if(arrS[s.charAt(right)]++ < arrT[s.charAt(right)]) {
                    found++;
                }
            }
            right++;

            while(found == t.length()){
                if(res.length() == 0 || res.length() > right-left) {
                    res = s.substring(left, right);
                }
                if(arrT[s.charAt(left)] > 0) {
                    if(arrS[s.charAt(left)]-- <= arrT[s.charAt(left)]) {
                        found--;
                    }
                }
                left++;
            }
        }

        return res;
    }
}
