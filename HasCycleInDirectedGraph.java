package LCGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HasCycleInDirectedGraph {

    static HashMap<Integer, List<Integer>> hm = new HashMap<>();

    static int time=0;

    public static boolean hasCycle(int N, int M, List<List<Integer>> edges) {

        createGraph(N,edges);

        int[] arrT = new int[N];
        Arrays.fill(arrT, -1);
        int[] depT = new int[N];
        Arrays.fill(depT,-1);
        boolean[] visited = new boolean[N];

        for(int i=0;i<N;i++){
            if(!visited[i]){
                if(helper(hm,arrT,depT,visited,i))
                    return true;
            }
        }

        return false;
    }


    public static boolean helper(HashMap<Integer,List<Integer>> hm, int[] arrT,int[] depT,boolean[] visited, int index){

        visited[index]=true;
        arrT[index]=time++;

        for(int i:hm.get(index)){

            if(!visited[i]){
                if(helper(hm,arrT,depT,visited,i)){
                    return true;
                }
            }
            else{
                if(depT[i]==-1){
                    return true;
                }
            }
        }
        depT[index]=time++;
        return false;
    }


    public static void createGraph(int n, List<List<Integer>> edges){

        for(int i=0;i<n;i++){
            hm.put(i,new ArrayList<>());
        }

        for(List<Integer> list:edges){
            hm.get(list.get(0)).add(list.get(1));
        }
    }
}
