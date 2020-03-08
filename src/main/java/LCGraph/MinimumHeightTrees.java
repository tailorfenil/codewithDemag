package LCGraph;

import java.util.*;

public class MinimumHeightTrees {

    public List<Integer> findMinHeightTrees(int n, int[][] edges){

        HashMap<Integer,List<Integer>> hmAdj = new HashMap<>();  //For Adjacency List
        HashMap<Integer,Integer> hmCount = new HashMap<>();  //For Counting how many neighbour
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){  //Adding empty list for each node
            hmAdj.put(i, new ArrayList<Integer>());
        }

        for(int i=0;i<edges.length;i++){  //populating adj hm for each node
//            for(int j=0;j<edges[i].length;j++){
                hmAdj.get(edges[i][0]).add(edges[i][1]);
                hmAdj.get(edges[i][1]).add(edges[i][0]);
//            }
        }

        for(int i=0;i<hmAdj.size();i++){ ////populating count of neightbour hm for each node
            hmCount.put(i,hmAdj.get(i).size());
        }

        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i=0;i<hmAdj.size();i++){  // Adding nodes whose in degree is only 1 ,means it's a leaf
            if(hmAdj.get(i).size()==1){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){

            int size= queue.size();

            for(int i=0;i<size;i++){  //every node has size 1 here

                int peekValue = queue.peek();
                queue.poll();

                if(n<=2){  //Base condition but here we need peek value first, that's why it's not at the top
                    res.add(peekValue);
                    continue;
                }

                for(int neighbour:hmAdj.get(peekValue)){  // at every iteration we are reducing indgree of every neighouring node by 1 , and after redicing if it's one then adding to queue
                    hmCount.put(neighbour,hmCount.get(neighbour)-1);

                    if(hmCount.get(neighbour)==1) {
                        queue.add(neighbour);
                    }
                }

            }

            n=n-size; // In the second last iteration value will be 1 or 2

        }

        if (res.size() == 0) {
           res.add(0);
           return  res;
        }

        return res;

    }
}
