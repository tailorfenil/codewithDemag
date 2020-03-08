package IKDynamicP;

public class NumberofWaysToClimb {

    // Complete the countWaysToClimb function below.
    public static long countWaysToClimb(int[] steps, int n) {

        int ans[] = new int[n+1];
        ans[0]=1; // why ?? because we are going bottom up and same as recursion when we reach ground level 0 we know
        // there was a way . Consider steps=[2,3]; so cWC(steps,2), cWC(steps,3) will have 2-2,3-2 and we are having 1 //return valuel
        for(int i=1;i<=n;i++){
            for(int st:steps){
                if(i-st>=0){
                    ans[i]+=ans[i-st];
                }
            }
        }
        return ans[n];



    }
}
