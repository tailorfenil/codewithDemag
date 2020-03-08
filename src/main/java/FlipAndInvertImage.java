public class FlipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A) {


//        for(int i=0;i<A.length;i++){
//            for(int j=0;j<A[i].length;j++){
//                if(A[i][j]==1)
//                    A[i][j]=0;
//                else
//                    A[i][j]=1;
//            }
//        }

        int mid = A.length %2 ==0 ? A.length/2 : (A.length/2)+1;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<mid;j++){
                int temp = 1 - A[i][j];
                A[i][j]= 1- A[i][(A[i].length-1)-j];
                A[i][(A[i].length-1)-j]=temp;
            }
            for(int j:A[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        return A;
    }
}
