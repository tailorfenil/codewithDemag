package bberg;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCitySchedule {

    public static int twoCitySchedCost(int[][] costs) {
        if (costs == null || costs.length == 0) {
            return 0;
        }

        Arrays.sort(costs, (a,b)->(a[0]-a[1])-(b[0]-b[1]));

        int cntA=0;
        int cntB=0;

        int cntAnyOne= costs.length/2;
        int sum=0;
//        while(cntA<=cntAnyOne && cntB<=cntAnyOne){
//
//            if(costs[i][0]<=costs[i][1]){
//                sum+=costs[i][0];
//                cntA++;
//            }
//            else{
//                sum+=costs[i][1];
//                cntB++;
//            }
//            i++;
//        }
//
//        while(i<costs.length) {
//
//            if (cntA <= cntAnyOne) {
//                sum += costs[i][0];
//                cntA++;
//            } else {
//                sum += costs[i][1];
//                cntB++;
//            }
//            i++;
//
//        }
//
//        return sum;

        for(int i=0;i<costs.length;i++){
            if(i<cntAnyOne){
                sum+=costs[i][0];
            }
            else{
                sum+=costs[i][1];
            }
        }

        return sum;

        /*--------
        Comparator<int[]> comparator = (a, b) -> a[0]- b[0] + b[1] - a[1];
        Arrays.sort(costs, comparator);

        int result = 0;
        int n = costs.length;

        for(int i = 0; i< n/2; i++){
            result += costs[i][0] + costs[n-i-1][1];
        }
        return result;
        */

//        int total = costs.length;
//        int A = total/2;
//        int sum = 0;
//        Arrays.sort(costs, (a,b)->((a[0]-a[1])-(b[0]-b[1])));
//        for(int[] c:costs) {
//            if(--A>=0) sum+=c[0];
//            else sum+=c[1];
//        }
//        return sum;

    }
}
