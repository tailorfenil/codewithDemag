package LCGraph;

//https://leetcode.com/problems/rotting-oranges/solution/

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    HashSet<Integer> hashSet = new HashSet<>();

    Queue<Node> queue = new LinkedList<>();

    int ans=0;

    int countof1And2s=0;

    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, -1, 0, 1};

    public int orangesRotting(int[][] grid) {


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    //hashSet.add(i*grid[i].length+j);
                    queue.add(new Node(i*grid[0].length+j,0));
                    countof1And2s++;  // why because at last hashSet size should be equals to no Of 1s and 2s then only we can return ans saying all the oranges are rotten now.
                }
                else if(grid[i][j]==1){
                    countof1And2s++; // why because at last hashSet size should be equals to no Of 1s and 2s then only we can return ans saying all the oranges are rotten now.
                }
            }
        }

        while(!queue.isEmpty()){

            Node pollVal = queue.poll();

           if(!hashSet.contains(pollVal.index)){ // It is not worth to check here ...

                hashSet.add(pollVal.index);

                int indexR = pollVal.index/grid[0].length;
                int indexC = pollVal.index%grid[0].length;

                for(int k=0;k<4;k++) {

                    int nR =indexR+dr[k];
                    int nC =indexC+dc[k];

                    if(nR>=0 && nR<grid.length && nC>=0 && nC<grid[0].length && grid[nR][nC]==1){ // last check is important // if grid[nR][nC]==1 then only we are going inside.. for value 2 and 0 we are not going
                        grid[nR][nC]=2; //doesn't matter , but we need to if they ask to print
                        queue.add(new Node(nR*grid[0].length+nC,pollVal.depth+1));
                        ans= pollVal.depth+1;
                    }

                }


         }
        }

//        if(hashSet.size()==grid.length*grid[0].length){  //RED Flag -- not all values are 2 or 1 , so can't take the size
//            return ans;
//        }

        if(hashSet.size()==countof1And2s){
            return ans;
        }
        else{
            return -1;
        }






    }


    class Node{

        int index;
        int depth;

        public Node(int index,int depth){

            this.index = index;
            this.depth=depth;
        }

    }


}
