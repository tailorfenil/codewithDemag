package IKWebRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueenAttackKings {


    /* Mistake by just calculating the x ,y and slope difference

     public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<queens.length;i++){
            if(check(queens[i],king)){
                res.add(new ArrayList(Arrays.asList(queens[i])));
            }
        }

        return res;

    }

    public boolean check(int[] queen, int[] king){

        if(queen[0]==king[0])
             return true;

        else if(queen[1]==king[1])
             return true;

        else if(Math.abs(queen[1]-king[1])==Math.abs(queen[0]-king[0]))
            return true;

        else
            return false;


    }
     */

    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        int[] row = new int[]{0,0,1,1,-1,-1,1,-1};
        int[] col = new int[]{1,-1,1,-1,1,-1,0,0};

        int[][] board = new int[8][8];

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<queens.length;i++){
            board[queens[i][0]][queens[i][1]]=1;
        }

        for(int i=0;i<row.length;i++){

            int king_row=king[0]+row[i];
            int king_col=king[1]+col[i];

            while(king_row>=0 && king_row<board.length && king_col>=0 && king_col<board[0].length){

                if(board[king_row][king_col]==1){
                    res.add(new ArrayList(Arrays.asList(king_row,king_col)));
                    break;
                }

                king_row+=row[i];
                king_col+=col[i];
            }
        }
        return res;
    }


}
