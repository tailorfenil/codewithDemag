package IKDynamicP;

public class LevenSheithDistance {

    public static int levenshteinDistance(String strWord1, String strWord2) {

        int m= strWord1.length();
        int n= strWord2.length();

        int res[][]= new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){

                if(i==0){
                    res[0][j]=j;
                }

                else if(j==0){
                    res[i][0]=i;
                }

                else if(strWord1.charAt(i-1)==strWord2.charAt(j-1)){
                    res[i][j]=res[i-1][j-1];
                }
                else {
                    res[i][j] = Math.min(res[i - 1][j - 1], Math.min(res[i][j - 1], res[i - 1][j]))+1;
                }
            }
        }
        return res[m][n];

    }

}
