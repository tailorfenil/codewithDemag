package LCRecursion;

import java.util.ArrayList;
import java.util.Collections;

public class UniquePathIIRecursion {

    ArrayList<ArrayList<Integer[]>> res= new ArrayList<>();

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        helper(obstacleGrid,new Node(0,0,null));

        return res.size();

    }


    public void helper(int[][] grid, Node node){


        if(node.row<0 || node.row>=grid.length || node.col<0 || node.col>=grid[0].length){
            return;
        }

        if(grid[node.row][node.col]==1){
            return;
        }

        if(node.row==grid.length-1 && node.col==grid[0].length-1){


            ArrayList<Integer[]> al =new ArrayList<>();

            while(node.parent!=null) {
                System.out.println("["+node.row+","+node.col+"]");
                System.out.println();
                al.add(new Integer[]{node.row,node.col});
                node=node.parent;
            }
            System.out.println("done");
            Collections.reverse(al);
            res.add(al);

            return; ///imp not to forget othwise it'll throw stack overflow
        }


        helper(grid,new Node(node.row+1,node.col,node));
        helper(grid,new Node(node.row,node.col+1,node));


    }


    class Node{

        int row;
        int col;
        Node parent;

        Node(int row,int col,Node parent){
            this.row=row;
            this.col=col;
            this.parent=parent;
        }

    }
}
