package LCGraph;

import java.util.*;

public class NetworkDelayTime {

//-------------Simple DFS-------- Visitied Node , I am not visiting twice, which is wrong
    /*
                    1      [[1,2,1],[2,3,2],[1,3,2]] // here if I use DFS from node 1 and if I reach to node 3 , the cost will be 3 , but there is other route from 1 to 3 which cost 2
                 1|   |2
                  2---3
                    2


     */

//    int max= Integer.MIN_VALUE;
//
//
//    class NetworkDelayTimeNode{
//        int src;
//        int dest;
//        int val;
//    }
//
//    HashMap<Integer, List<NetworkDelayTimeNode>> hm = new HashMap<>();
//
//    public void initialize(int[] edge){
//
//        NetworkDelayTimeNode networkDelayTimeNode = new NetworkDelayTimeNode();
//        networkDelayTimeNode.src=edge[0];
//        networkDelayTimeNode.dest=edge[1];
//        networkDelayTimeNode.val=edge[2];
//
//        if(!hm.containsKey(networkDelayTimeNode.src)) {
//            hm.put(networkDelayTimeNode.src, new ArrayList<NetworkDelayTimeNode>());
//            hm.get(networkDelayTimeNode.src).add(networkDelayTimeNode);
//        }
//        else{
//            hm.get(networkDelayTimeNode.src).add(networkDelayTimeNode);
//        }
//    }
//
//    public int networkDelayTime(int[][] times, int N, int K) {
//
//        boolean[] visited = new boolean[N+1];
//        visited[0]=true;
//
//        for(int[] edge:times){
//            initialize(edge);
//        }
//
//        helper(K,hm,visited,0);
//
//        for(boolean source:visited){  // We don't have connected component.
//            if(!source){
//                return -1;
//            }
//        }
//
//        return max;
//
//    }
//
//    public void helper(int source,HashMap<Integer,List<NetworkDelayTimeNode>> hm, boolean[] visited,int sum){
//
//        visited[source]=true;
//        max= Math.max(max,sum);
//
//        for(NetworkDelayTimeNode networkDelayTimeNode:hm.getOrDefault(source,new ArrayList<>())){
//            if(!visited[networkDelayTimeNode.dest]){
//                helper(networkDelayTimeNode.dest,hm,visited,sum+networkDelayTimeNode.val);
//            }
//        }
//    }

    Map<Integer,Integer> disthm;

    public int networkDelayTime(int[][] times, int N, int K) {

        HashMap<Integer,List<int[]>> hmGraph = new HashMap<>();
        int ans=0; // final answer

        for(int[] edge:times){
            if(!hmGraph.containsKey(edge[0])){
                hmGraph.put(edge[0],new ArrayList<>());
            }
            hmGraph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }

        for(int node:hmGraph.keySet()){   //Todo:: Very important as we can ignore cycle of DFS once we sorted  consider 1->[2,1],[3,2] ;  2->[3,0.5] // here sorted on weight for every node; we can ignore DFS for 3 based on 1->3;
            // Collections.sort(hmGraph.get(node),(a,b)->a[1]-b[1]);
            Collections.sort(hmGraph.get(node),Comparator.comparingInt((o) -> o[1]));

        }



        disthm= new HashMap<>();
        for(int i=1;i<=N;i++){
            disthm.put(i,Integer.MAX_VALUE);
        }

        dfs(hmGraph,K,0);

        for(int i:disthm.values()){  // can get values of hm from this

            if(i==Integer.MAX_VALUE) return -1;

            ans=Math.max(ans,i);

        }
        return ans;

    }


    public void dfs(HashMap<Integer,List<int[]>> hmGraph,int source,int time){

        if(time>=disthm.get(source)) return; //If the distance is same we can ignore DFS

        disthm.put(source,time);

        if(hmGraph.containsKey(source)){
            for(int[] graphValue : hmGraph.get(source)){
//            if(time>disthm.get(graphValue[0])) return; // not right approach, It should be handled before entering into this if-->for
//            disthm.put(disthm.get(graphValue[0]);   // not right approach, It should be handled before entering into this if-->for

            dfs(hmGraph,graphValue[0],time+graphValue[1]);
            }
        }


    }

}
