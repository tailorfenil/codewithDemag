package IKGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestDistanceFromGuard {

    public static List<List<Integer>> find_shortest_distance_from_a_guard(List<List<Character>> grid) {

        List<List<Integer>> resLength = new ArrayList<>();

        Queue<Node> queue = new LinkedList<Node>();

        int[] dr =new int[]{0,0,1,-1};
        int dc[]=new int[]{1,-1,0,0};

        boolean[][] visited = new boolean[grid.size()][grid.get(0).size()];

        for(int i=0;i<grid.size();i++){
              resLength.add(new ArrayList<>());
            for(int j=0;j<grid.get(0).size();j++){
                resLength.get(i).add(j,-1);
                if(grid.get(i).get(j)=='G'){
                    queue.offer(new Node(i,j,0)); //adding all the sorces for multi source bfs . Remeber who reach first will have min length.
                                                 //And how we are determining who reached first? based on visited array. PERIOD.
                }
            }
        }

        while(!queue.isEmpty()){

            Node pollNode = queue.poll();

            if(!visited[pollNode.row][pollNode.col]){

                visited[pollNode.row][pollNode.col]=true;

                resLength.get(pollNode.row).set(pollNode.col,pollNode.length);


                for(int i=0;i<dc.length;i++){

                    int dpR= pollNode.row+dr[i];
                    int dpC = pollNode.col+dc[i];

                    if(dpR<0 || dpR>=grid.size() || dpC<0 || dpC>=grid.get(0).size() || grid.get(dpR).get(dpC)!='O'){// we should not take grid.get(dpR).get(dpC)=='W' as we need to move on for 'G' also
                        continue;
                    }
                    else {
                        queue.offer(new Node(dpR, dpC, pollNode.length+1));
                    }
                }

            }

//            for(List<Integer> list:resLength){
//                for(int i:list){
//                    System.out.print(i+" ");
//                }
//                System.out.println();
//            }
//
//            System.out.println();
//            System.out.println();


        }
        return resLength;
    }




    static class Node{

        int row;
        int col;
        int length;

        Node(int row,int col,int length){
            this.row=row;
            this.col=col;
            this.length=length;
        }
    }
}
