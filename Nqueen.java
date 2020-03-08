package IKWebRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Nqueen {

    static ArrayList<String[]> res= new ArrayList<>();
    public static String[][] find_all_arrangements(int n) {

        res.clear();

        helper(n,0,new ArrayList<Integer>());

        StringBuilder sb = new StringBuilder();

        return res.toArray(new String[0][0]);

    }

    static void helper(int n, int index,ArrayList<Integer> al){

        //BackTracking logic
        for(int i=0;i<index-1;i++){
            if(al.get(index-1)==al.get(i)){ //same column
                return;
            }

            int rowDiff = Math.abs(i-(index-1));
            int colDiff = Math.abs(al.get(i)-al.get(index-1));

            if(rowDiff==colDiff){ //same diagonal
                return;
            }
        }



        //Base cond -- that means we already placed all the queues(0...n-1) and index is now at n
        if(index==n){
            res.add(createStringArr(al));
        }

        //meat of the code
        for(int i=0;i<n;i++){ // column for row at index argument

            al.add(i);
            helper(n,index+1,al);
            al.remove(al.size()-1);

        }




    }

    private static String[] createStringArr(ArrayList<Integer> al) {


        int n=al.size();

        String[] res = new String[n];

        for(int i=0;i<al.size();i++){

            StringBuilder sb = new StringBuilder();
            int val = al.get(i);

            for(int j=0;j<n;j++){

                if(j==val){
                    sb.append("q");
                }
                else{
                    sb.append("-");
                }

            }
            res[i]=sb.toString();

        }
        return res;

    }


}


//public class Nqueen {

//    static String[][] arr;
//
////    static String[][][] res;
//
//
//    public static String[][] find_all_arrangements(int n) {
//
//        arr = new String[n][n];
//
////        res= new String[50][n][n];
//
//        helper(arr,0,0,n);
//
//        return arr;
//
//    }
//
//
//    public static void helper(String[][] arr,int i,int j, int n){
//
//        int IMinus1Column=0;
//        int BeforeIMinus1Column=0;
//
//        if(i>0) {
//            for (int col = 0; col < n; col++) {
//                if (arr[i - 1][col].equals("Q")) {
//                    IMinus1Column = col;
//                    break;
//                }
//            }
//        }
//
//        for(int row=0;row<=i-2;row++) {
//
//            for (int col = 0; col < n; col++) {
//
//                if (("Q").equals(arr[i - 1][col]) && ("Q").equals(arr[row][col]))
//                    return;
//
//                if (("Q").equals(arr[row][col])) {
//                    BeforeIMinus1Column = col;
//                }
//            }
//                int rowDiff= Math.abs(i-1-row);
//                int colDiff= Math.abs(BeforeIMinus1Column-IMinus1Column);
//
//                if(rowDiff==colDiff){
//                    return;
//                }
//
//            }
//
//
//        if(i==n){
//
//            for(int printRow=0;printRow<n;printRow++){
//                for(int printColumn=0;printColumn<n;printColumn++){
//                    if(arr[printRow][printColumn]==null) {
//                        arr[printRow][printColumn] = "-";
//                    }
//                    System.out.print(arr[printRow][printColumn]);
//                }
//                System.out.println();
//            }
//            System.out.println();
//
//            return;
//        }
//
//        for(int k=0;k<n;k++) {
//
//            arr[i][k]="Q";
//            helper(arr,i+1,k,n);
//            arr[i][k]="-";
//        }
//
//        return;
//
//    }
//
//}






