package IKWebRecursion;

public class EditDistance {

    public int minDistance(String word1, String word2) {

        return helper(word1,word2,0,0);



    }

    public int helper(String word1,String word2, int word1Index,int word2Index){

        if(word1Index>=word1.length()){
            return word2.length()-word2Index;
        }
        else if(word2Index>=word2.length()){
            return word1.length()-word1Index;
        }

        else if(word1.charAt(word1Index)==word2.charAt(word2Index)){
            return helper(word1,word2,word1Index+1,word2Index+1);
        }

        else{
            return 1+Math.min(helper(word1,word2,word1Index+1,word2Index+1),
                    Math.min(helper(word1,word2,word1Index,word2Index+1),
                             helper(word1,word2,word1Index+1,word2Index)));
        }


    }

}
