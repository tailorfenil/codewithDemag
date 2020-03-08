package IKGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class KnightReachOrNot {

//    public static int find_minimum_number_of_moves(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
//        // Write your code here.
//        return dfsHelper(rows,cols,start_row,start_col,end_row,end_col,0);
//
//    }
//
//    public  static int dfsHelper(int rows, int cols, int start_row, int start_col, int end_row, int end_col, int count) {
//
//        if(start_row<0 || start_row>rows || start_col<0 || start_col>cols ||
//           end_row<0 || end_row>rows || end_col<0 || end_col>cols){
//            return -1;
//        }
//
//        if(start_row==end_row && start_col==end_col)
//            return count;
//
//        if(dfsHelper(rows,cols,start_row+1,start_col-2,end_row,end_col,count+1)==-1)
//             return -1;
//        if(dfsHelper(rows,cols,start_row+1,start_col+2,end_row,end_col,count+1)==-1)
//            return -1;
//        if(dfsHelper(rows,cols,start_row+2,start_col+1,end_row,end_col,count+1)==-1)
//             return -1;
//        if(dfsHelper(rows,cols,start_row+2,start_col-1,end_row,end_col,count+1)==-1)
//             return -1;
//        if(dfsHelper(rows,cols,start_row-1,start_col-2,end_row,end_col,count+1)==-1)
//            return -1;
//        if(dfsHelper(rows,cols,start_row-1,start_col+2,end_row,end_col,count+1)==-1)
//           return -1;
//        if(dfsHelper(rows,cols,start_row-2,start_col-1,end_row,end_col,count+1)==-1)
//            return -1;
//        if(dfsHelper(rows,cols,start_row-2,start_col+1,end_row,end_col,count+1)==-1)
//            return -1;
//
//        return count;
//    }


    public static int find_minimum_number_of_moves(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
        // Write your code here.

        Boolean board[][] = new Boolean[rows][cols];
        Queue<Point> queue= new LinkedList<Point>();
        queue.add(new Point(start_row,start_col,0));
        board[start_row][start_col]=true;

        while(!queue.isEmpty()){

            Point currPoint = queue.remove();
            int currRowVal = currPoint.row;
            int currColVal = currPoint.col;
            int currDepthVal = currPoint.depth;

            if(currRowVal==end_row && currColVal==end_col)
                return currPoint.depth;

            if(validMove(rows,cols,currRowVal+1,currColVal-2,end_row,end_col) &&
               board[currRowVal+1][currColVal-2]==null){
                board[currRowVal+1][currColVal-2]=true;
                queue.add(new Point(currRowVal+1,currColVal-2,currDepthVal+1));
            }

            if(validMove(rows,cols,currRowVal+1,currColVal+2,end_row,end_col) &&
               board[currRowVal+1][currColVal+2]==null){
                board[currRowVal+1][currColVal+2]=true;
                queue.add(new Point(currRowVal+1,currColVal+2,currDepthVal+1));
            }

            if(validMove(rows,cols,currRowVal+2,currColVal+1,end_row,end_col) &&
               board[currRowVal+2][currColVal+1]==null){
                board[currRowVal+2][currColVal+1]=true;
                queue.add(new Point(currRowVal+2,currColVal+1,currDepthVal+1));
            }

            if(validMove(rows,cols,currRowVal+2,currColVal-1,end_row,end_col) &&
               board[currRowVal+2][currColVal-1]==null){
                board[currRowVal+2][currColVal-1]=true;
                queue.add(new Point(currRowVal+2,currColVal-1,currDepthVal+1));
            }

            if(validMove(rows,cols,currRowVal-1,currColVal-2,end_row,end_col) &&
               board[currRowVal-1][currColVal-2]==null){
                board[currRowVal-1][currColVal-2]=true;
                queue.add(new Point(currRowVal-1,currColVal-2,currDepthVal+1));
            }

            if(validMove(rows,cols,currRowVal-1,currColVal+2,end_row,end_col) &&
               board[currRowVal-1][currColVal+2]==null){
                board[currRowVal-1][currColVal+2]=true;
                queue.add(new Point(currRowVal-1,currColVal+2,currDepthVal+1));
            }

            if(validMove(rows,cols,currRowVal-2,currColVal-1,end_row,end_col) &&
               board[currRowVal-2][currColVal-1]==null){
                board[currRowVal-2][currColVal-1]=true;
                queue.add(new Point(currRowVal-2,currColVal-1,currDepthVal+1));
            }

            if(validMove(rows,cols,currRowVal-2,currColVal+1,end_row,end_col) &&
               board[currRowVal-2][currColVal+1]==null){
                board[currRowVal-2][currColVal+1]=true;
                queue.add(new Point(currRowVal-2,currColVal+1,currDepthVal+1));
            }
        }

        return -1;

    }

    // static int bfsHelper(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {

    //     // if(start_row<0 || start_row>rows || start_col<0 || start_col>cols ||
    //     //   end_row<0 || end_row>rows || end_col<0 || end_col>cols){
    //     //     return -1;
    //     // }

    // }

    public static boolean validMove(int rows, int cols, int start_row, int start_col, int end_row, int end_col){
        if(start_row<0 || start_row>rows-1 || start_col<0 || start_col>cols-1){
            return false;
        }
        return true;
    }

    public static class Point{

        int row;
        int col;
        int depth;

        Point(int row,int col,int depth){
            this.row=row;
            this.col=col;
            this.depth=depth;
        }

    }


    ///------BFS---------------

    /*
     * Complete the function below.
     */

//    static class Point{
//
//        int row;
//        int col;
//        int depth;
//
//        Point(int row,int col,int depth){
//            this.row=row;
//            this.col=col;
//            this.depth=depth;
//        }
//
//    }
//    static int find_minimum_number_of_moves(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
//        // Write your code here.
//
//        return bfsHelper(rows,cols,start_row,start_col,end_row,end_col);
//
//    }
//
//    static int bfsHelper(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
//
//        // if(start_row<0 || start_row>rows || start_col<0 || start_col>cols ||
//        //   end_row<0 || end_row>rows || end_col<0 || end_col>cols){
//        //     return -1;
//        // }
//        Boolean board[][] = new Boolean[rows][cols];
//        Queue<Point> queue= new LinkedList<Point>();
//        queue.add(new Point(start_row,start_col,0));
//        board[start_row][start_col]=true;
//
//        while(!queue.isEmpty()){
//
//            Point currPoint = queue.pop();
//            currRowVal = currPoint.row;
//            currColVal = currPoint.col;
//            currDepthVal = currPoint.depth;
//
//            if(currRowVal==end_row && currColVal==end_col)
//                return currPoint.depth;
//
//            if(validMove(rows,cols,currRowVal+1,currColVal-2,end_row,end_col) &&
//               board[currRowVal+1][currColVal-2]==null){
//                board[currRowVal+1][currColVal-2]=true;
//                queue.add(new Point(currRowVal+1,currColVal-2,currDepthVal+1));
//            }
//
//            if(validMove(rows,cols,currRowVal+1,currColVal+2,end_row,end_col) &&
//               board[currRowVal+1][currColVal+2]==null){
//                board[currRowVal+1][currColVal+2]=true;
//                queue.add(new Point(currRowVal+1,currColVal+2,currDepthVal+1));
//            }
//
//            if(validMove(rows,cols,currRowVal+2,currColVal+1,end_row,end_col) &&
//               board[currRowVal+2][currColVal+1]==null){
//                board[currRowVal+2][currColVal+1]=true;
//                queue.add(new Point(currRowVal+2,currColVal+1,currDepthVal+1));
//            }
//
//            if(validMove(rows,cols,currRowVal+2,currColVal-1,end_row,end_col) &&
//               board[currRowVal+2][currColVal-1]==null){
//                board[currRowVal+2][currColVal-1]=true;
//                queue.add(new Point(currRowVal+2,currColVal-1,currDepthVal+1));
//            }
//
//            if(validMove(rows,cols,currRowVal-1,currColVal-2,end_row,end_col) &&
//               board[currRowVal-1][currColVal-2]==null){
//                board[currRowVal-1][currColVal-2]=true;
//                queue.add(new Point(currRowVal-1,currColVal-2,currDepthVal+1));
//            }
//
//            if(validMove(rows,cols,currRowVal-1,currColVal+2,end_row,end_col) &&
//               board[currRowVal-1][currColVal+2]==null){
//                board[currRowVal-1][currColVal+2]=true;
//                queue.add(new Point(currRowVal-1,currColVal+2,currDepthVal+1));
//            }
//
//            if(validMove(rows,cols,currRowVal-2,currColVal-1,end_row,end_col) &&
//               board[currRowVal-2][currColVal-1]==null){
//                board[currRowVal-2][currColVal-1]=true;
//                queue.add(new Point(currRowVal-2,currColVal-1,currDepthVal+1));
//            }
//
//            if(validMove(rows,cols,currRowVal-2,currColVal+1,end_row,end_col) &&
//               board[currRowVal-2][currColVal+1]==null){
//                board[currRowVal-2][currColVal+1]=true;
//                queue.add(new Point(currRowVal-2,currColVal+1,currDepthVal+1));
//            }
//        }
//
//        return -1;
//    }
//
//    static boolean validMove(int rows, int cols, int start_row, int start_col, int end_row, int end_col){
//        if(start_row<0 || start_row>rows || start_col<0 || start_col>cols ||
//           end_row<0 || end_row>rows || end_col<0 || end_col>cols){
//            return false;
//        }



//--------------------------


//    static int find_minimum_number_of_moves(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
//        if (start_row == end_row && start_col == end_col) return 0;
//
//        LinkedList<Pair<Integer, Integer>> q = new LinkedList<>();
//        q.add(new Pair(end_row, end_col));
//
//        int[][] distances = new int[rows][cols];
//        distances[end_row][end_col] = 0;
//
//        while (!q.isEmpty()) {
//            Pair<Integer, Integer> next = q.removeFirst();
//            List<Pair<Integer, Integer>> moves = get_moves_from(next, rows, cols);
//            for (Pair<Integer, Integer> p : moves) {
//                if (distances[p.first][p.second] == 0) {
//                    distances[p.first][p.second] = distances[next.first][next.second] + 1;
//                    q.add(p);
//
//                    if (p.first == start_row && p.second == start_col) {
//                        return distances[start_row][start_col];
//                    }
//                }
//            }
//        }
//
//        return -1;
//    }
//
//    static List<Pair<Integer, Integer>> get_moves_from(Pair<Integer, Integer> position, final int rows, final int cols) {
//        ArrayList<Pair<Integer, Integer>> valid_moves = new ArrayList<>();
//
//        add_if_valid(position.first-2, position.second+1, rows, cols, valid_moves);
//        add_if_valid(position.first-2, position.second-1, rows, cols, valid_moves);
//        add_if_valid(position.first+2, position.second-1, rows, cols, valid_moves);
//        add_if_valid(position.first+2, position.second+1, rows, cols, valid_moves);
//        add_if_valid(position.first-1, position.second+2, rows, cols, valid_moves);
//        add_if_valid(position.first-1, position.second-2, rows, cols, valid_moves);
//        add_if_valid(position.first+1, position.second-2, rows, cols, valid_moves);
//        add_if_valid(position.first+1, position.second+2, rows, cols, valid_moves);
//
//        return valid_moves;
//    }
//
//    static void add_if_valid(int row, int col, final int rows, final int cols, ArrayList<Pair<Integer, Integer>> valid_moves) {
//        final Pair p1 = new Pair<Integer, Integer>(row, col);
//        if (isValid(p1, rows, cols)) valid_moves.add(p1);
//    }
//
//    static boolean isValid(Pair<Integer, Integer> position, final int rows, final int cols) {
//        return (position.first >= 0 && position.first < rows && position.second >= 0 && position.second < cols);
//    }
//
//    static class Pair<T,R> {
//        public T first;
//        public R second;
//
//        Pair(T f, R s) {
//            first = f;
//            second = s;
//        }
//    }

}
