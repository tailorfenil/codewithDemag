package IKDynamicP;

public class ColorHouses256 {

    public static int costNHouses(int[][] cost){


        for(int i=1;i<cost.length;i++){

            cost[i][0] += Math.min(cost[i-1][1],cost[i-1][2]);
            cost[i][1] += Math.min(cost[i-1][0],cost[i-1][2]);
            cost[i][2] += Math.min(cost[i-1][0],cost[i-1][1]);
        }

        return Math.min(cost[cost.length-1][0],Math.min(cost[cost.length-1][1],cost[cost.length-1][2]));

    }
}
