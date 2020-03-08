package IKDynamicP;

public class CoinPlay {

    public static int game(int[] v){

//        int length=bags.length;
//
//        int[][] score= new int[length+1][length+1];
//
//        for(int n=1;n<length;n++){
//            for(int l=0;l<length-n-1;l++){
//                 int r =l+n-1;
//                 if(n==1){
//                     score[l][r]=bags[l];
//                 }
//
//                 else if(n==2){
//                     score[l][r]=Math.max(bags[l],bags[r]);
//                 }
//
//                 else{
//                     score[l][r]= Math.max(bags[l]+ Math.min(score[l+2][r],score[l+1][r-1]),
//                                           bags[r]+Math.min(score[l+1][r-1],score[l][r-2]));
//                 }
//
//            }
//        }
//
//        return score[0][length-1];

        if (v.length == 1) {
            return v[0];
        }
        int[][] dp = new int[v.length][v.length];
        for (int i = 0; i < v.length-1; i++) {
            dp[i][i] = v[i];
            dp[i][i+1] = Math.max(v[i], v[i+1]);
        }
        dp[v.length-1][v.length-1] = v[v.length-1];
        for (int gap = 2; gap < v.length; gap++) {
            for (int i = 0; i + gap < v.length; i++) {
                int optionA = v[i] + Math.min(dp[i+1][i+gap-1], dp[i+2][i+gap]);
                int optionB = v[i+gap] + Math.min(dp[i+1][i+gap-1], dp[i][i+gap-2]);
                dp[i][i+gap] = Math.max(optionA, optionB);
            }
        }
        return dp[0][v.length-1];


    }
}
