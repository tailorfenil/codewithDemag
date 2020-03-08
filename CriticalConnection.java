package LCGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CriticalConnection {

    public static int time = -1;

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        HashMap<Integer, List<Integer>> hm = createHm(n, connections);

        int[] arrTime = new int[n];
        int[] depatureTime = new int[n];

        boolean[] visitedNode = new boolean[n];

        int[] parentNode = new int[n];

        parentNode[0] = -1;

        getCriticalConnection(0, visitedNode, parentNode, arrTime, depatureTime, hm);

        return res;
    }


    public HashMap<Integer, List<Integer>> createHm(int n, List<List<Integer>> connections) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(i, new ArrayList<>());
        }

        for (List<Integer> list : connections) {
            hm.get(list.get(0)).add(list.get(1));
            hm.get(list.get(1)).add(list.get(0));
        }

        return hm;
    }

    public int getCriticalConnection(int n, boolean[] visitedNode, int[] parent, int[] arrivalTime, int[] departureTime, HashMap<Integer, List<Integer>> hm) {

        visitedNode[n] = true;

        arrivalTime[n] = ++time;

        int dbe = arrivalTime[n];

        for (int neighbour : hm.get(n)) {

            if (!visitedNode[neighbour]) {
                parent[neighbour] = n;
                dbe = Math.min(getCriticalConnection(neighbour, visitedNode, parent, arrivalTime, departureTime, hm), dbe);
            } else {
                if (parent[n] != neighbour) {
                    dbe = Math.min(dbe, arrivalTime[neighbour]);
                }
            }
        }
            departureTime[n] = ++time;

            if (dbe == arrivalTime[n] && n!=0) {
                List<Integer> criticalConnection = new ArrayList<>();
                int parentValue = n;
                //criticalConnection.add(n);
//                while (parentValue != -1) {
                    criticalConnection.add(parentValue);
                    criticalConnection.add(parent[parentValue]);
//                }
                res.add(criticalConnection);
            }
        return dbe;
    }
}

