package LCRecursion;

public class UniquePathIIDP {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        if(obstacleGrid[0][0]==1){
            return 0;
        }

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

       return helper(obstacleGrid,dp);

//        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];



    }

    private int helper(int[][] obstacleGrid, int[][] dp) {

        dp[0][0]=1;

        for(int i=0;i<obstacleGrid.length;i++){

            if(i>0 && obstacleGrid[i][0]==0){
                dp[i][0]=1;
            }
            else if(obstacleGrid[i][0]!=0){
                break;
            }

        }

        for(int j=0;j<obstacleGrid[0].length;j++){

            if(j>0 && obstacleGrid[0][j]==0){
                dp[0][j]=1;
            }
            else if(obstacleGrid[0][j]!=0){
                break;
            }
        }


        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){

                if(obstacleGrid[i][j]==0){

                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }

            }
        }

        return dp[dp.length-1][dp[0].length-1];

    }
}
