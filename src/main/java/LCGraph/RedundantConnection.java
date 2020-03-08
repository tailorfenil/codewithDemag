package LCGraph;

/*

DisJoint Sets (Good to watch). (Pet vala bhaiii)
https://www.youtube.com/watch?time_continue=1&v=wU6udHRIkcc&feature=emb_logo

https://www.youtube.com/watch?v=ID00PMy0-vE (Tushar)

*/

public class RedundantConnection {


    public int[] findRedundantConnection(int[][] edges) {

        int[] parent = new int[edges.length+1];

        for(int[] edge:edges){
              if(union(edge,parent)){ // remember here we are taking union of not two edges but edge and parent
                  return new int[]{edge[0],edge[1]};
              }

        }
        return new int[]{-1,-1}; // If we don't have any cycle

    }

    public boolean union(int[] edge, int[] parent){

        int parentSourcePointOfEdge = find(edge[0],parent);
        int parentDestinationPointOfEdge = find(edge[1],parent);

        if(parentSourcePointOfEdge==parentDestinationPointOfEdge){
            return true;
        }
        else{
            parent[parentDestinationPointOfEdge]=parentSourcePointOfEdge; //Here we should take the decision of whom to make parent based on rank, I am not doing it here
            return false;
        }
    }

    public int find(int edgePoint,int[] parent){

        while(parent[edgePoint]!=0){  // we can still minimize by doing compression--pointing directly to top root
            edgePoint=parent[edgePoint];
        }
        return edgePoint;
    }

}
