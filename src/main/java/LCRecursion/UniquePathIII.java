package LCRecursion;

import java.util.ArrayList;

public class UniquePathIII {

    static ArrayList<ArrayList<Integer[]>> res = new ArrayList<>();

    public int uniquePathsIII(int[][] grid) {

        int cnt=0;
        int startRow=0,startCol=0;
        res.clear();

        boolean[][] visited=new boolean[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    cnt++;
                }
                else if(grid[i][j]==1){
                    startRow=i;
                    startCol=j;
                }
            }
        }


        helper(grid,visited,cnt,new Node(startRow,startCol,0,null));

        return res.size();

    }


    public void helper(int[][] grid, boolean[][] visited,int cnt,Node node){

        if(node.row<0 || node.row>=grid.length || node.col<0 || node.col>=grid[0].length){
            return;
        }

        if(grid[node.row][node.col]==-1){
            return;
        }

        if(!visited[node.row][node.col] && node.count==cnt+1 && grid[node.row][node.col]==2){
            //int requiredCount = node.count;
            ArrayList<Integer[]> al = new ArrayList<>();
            while(node.parent!=null){
               // System.out.println("["+node.row+","+node.col+"]"+ " cnt= "+node.count);
                al.add(new Integer[]{node.row,node.col});
                node=node.parent;
                //requiredCount--;
            }
            res.add(al);
            return;
        }

        if(!visited[node.row][node.col]){

            visited[node.row][node.col]=true;

//            System.out.println("["+node.row+","+node.col+"]" +" count = "+ node.count);
//            System.out.println();
//            System.out.println();


             helper(grid,visited,cnt,new Node(node.row+1,node.col,node.count+1,node));
             //visited[node.row][node.col]=false;

             helper(grid,visited,cnt,new Node(node.row,node.col+1,node.count+1,node));
             //visited[node.row][node.col]=false;

             helper(grid,visited,cnt,new Node(node.row-1,node.col,node.count+1,node));
             //visited[node.row][node.col]=false;

             helper(grid,visited,cnt,new Node(node.row,node.col-1,node.count+1,node));
             visited[node.row][node.col]=false;

        }

        return;

    }

    class Node{

        int row;
        int col;
        int count;
        Node parent;

        Node(int row,int col,int count,Node parent){
            this.row=row;
            this.col=col;
            this.count=count;
            this.parent=parent;
        }

    }









}
