package LCRecursion;


import java.util.HashMap;

public class MinRefuelStops {

    HashMap<Pair,Integer> hm = new HashMap<>();

//    int include=Integer.MAX_VALUE, exclude = Integer.MAX_VALUE;

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        long[] d = new long[stations.length + 1];
        d[0] = startFuel;

        for (int i = 0; i < stations.length; i++) {
            int stopDistance = stations[i][0];
            int fuel = stations[i][1];

            for (int j = i + 1; j > 0 && d[j - 1] >= stopDistance; j--) {
                d[j] = Math.max(d[j], d[j - 1] + fuel);
            }
        }

        for (int i = 0; i < d.length; i++) {
            if (d[i] >= target) {
                return i;
            }
        }

        return -1;
    }


    public int minRefuelStopsRecursion(int target, int startFuel, int[][] stations) {

        int res = helper(target, 0, startFuel, stations);

        if (res != stations.length + 1) {
            return res;
        } else {
            return -1;
        }

    }

    public int helper(int target, int index, int currFuel, int[][] stations) {

        int include,exclude;

        if (currFuel >= target) {
            return 0;
        }

        if (index == stations.length) {
            return stations.length + 1;
        }

        if (currFuel < stations[index][0]) {
            return stations.length + 1;
        }

        if(!hm.containsKey(new Pair(index+1,currFuel+stations[index][1]))) {
            include = 1 + helper(target, index + 1, currFuel + stations[index][1], stations);
            hm.put(new Pair(index+1,currFuel+stations[index][1]),include);
        }
        else{
            include = hm.get(new Pair(index+1,currFuel+stations[index][1]));
        }

        if(!hm.containsKey(new Pair(index+1,currFuel))) {
            exclude = helper(target, index + 1, currFuel, stations);
            hm.put(new Pair(index+1,currFuel),exclude);
        }
        else{
            exclude=hm.get(new Pair(index+1,currFuel));
        }

        return Math.min(include, exclude);


    }

    class Pair{
        int a;
        int b;
        Pair(int p,int q){
            a=p;
            b=q;
        }
        public boolean equals(Object o) {
            if (o instanceof MinRefuelStops.Pair) {
                MinRefuelStops.Pair p = (MinRefuelStops.Pair)o;
                return p.a == a && p.b == b;
            }
            return false;
        }
        public int hashCode() {
            return new Integer(a).hashCode() * 31 + new Integer(b).hashCode();
        }
    }
}