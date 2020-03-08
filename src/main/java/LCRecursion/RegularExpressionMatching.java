package LCRecursion;

public class RegularExpressionMatching {

    //DP

    public boolean isMatchDP(String s, String p) {

        boolean[][] mat = new boolean[s.length()+1][p.length()+1];

        mat[0][0]=true; // empty string + empty pattern

        for(int j=1;j<=p.length();j++){
            if(p.charAt(j-1)=='*') //here j-1 and not j because we are refering value from p and not from matrix
                mat[0][j]=mat[0][j-2]; //assuming here first value in pattern is not "*"
        }

        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='.'){
                    mat[i][j]=mat[i-1][j-1];
                }

                if(p.charAt(j-1)=='*'){

                    mat[i][j] = mat[i][j-2]; // 0 occurence

                    boolean value=false;

                    if(p.charAt(j-2)==s.charAt(i-1) || p.charAt(j-2)=='.'){ //meat of the logic
                        value = mat[i-1][j];
                    }

                    mat[i][j]= mat[i][j] || value;
                }
            }
        }

        return mat[mat.length-1][mat[0].length-1];
    }



    //Recursion

    //https://leetcode.com/problems/regular-expression-matching/discuss/496112/Pure-recursion-solution-(without-DP)-or-1ms-(Beats-100)-or-Java-or-Why

    public boolean isMatchRecursion(String text, String pattern) {
        return isMatch(text.toCharArray(), text.length()-1, pattern.toCharArray(), pattern.length()-1);
    }

    // matches pattern and text right to left starting pattern at index p and text at index t
    private boolean isMatch(char[] text, int t, char[] pattern, int p) {
        // case 1: we have finished traversing the entire pattern
        if (p==-1) return t==-1;

        // case 2: we have finished traversing the entire text
        if (t==-1) return emptyMatch(pattern, p);

        // case 3: pattern[p] is not '*'
        if (p==0 || pattern[p]!='*') {
            return charMatch(text[t], pattern[p]) && isMatch(text, t-1, pattern, p-1);
        }

        // case 4: p>0 && pattern[p]=='*'
        return charMatch(text[t], pattern[p-1]) && isMatch(text, t-1, pattern, p) ||
               isMatch(text, t, pattern, p-2);
    }

    private boolean charMatch(char t, char p) {
        return p=='.' || t==p;
    }

    private boolean emptyMatch(char[] pattern, int p) {
        if(p%2==0) return false;
        while(p>=0) {
            if (pattern[p]!='*') return false;
            p -=2;
        }
        return true;
    }


}
