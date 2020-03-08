package LCRecursion;

import java.util.ArrayList;
import java.util.List;

public class WordBreakIII {

    ArrayList<String> result = new ArrayList<>();

    public List<String> wordBreak(String s, List<String> wordDict) {

        helper(s,0,"",wordDict);

        return result;

    }


    public void helper(String s, int index,String partial,List<String> wordDict){

        if(index==s.length()){
            result.add(partial.toString());
        }

        for(int i=index;i<s.length();i++){

            String s1 =s.substring(index,i+1);

            if(wordDict.contains(s1)) {

                if (index == 0) {

                    helper(s, i + 1, s1,wordDict);
                } else {
                    helper(s, i + 1, partial + " " + s1,wordDict);
                }
            }

        }



    }




}
