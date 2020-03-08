import java.util.Collections;
import java.util.PriorityQueue;

public class MergeKSortedArray {

//    static int[] mergeArrays(int[][] arr) {
//        int K = arr.length;
//        int N = arr[0].length;
//        // Get appropriate priority queue
//        PriorityQueue<AmazonCodeS1.Node> priorityQueue = getPriorityQueue(arr);
//        for (int i = 0; i < K; i++) {
//            priorityQueue.add(new AmazonCodeS1.Node(arr[i][0], i, 0));
//        }
//        int ans[] = new int[N * K];
//        int pointer = 0;
//        while (pointer < N * K) {
//            AmazonCodeS1.Node rem = priorityQueue.poll();
//            ans[pointer++] = rem.value;
//            // Add the next element from the same row from which element is
//            // removed, if available
//            if (rem.column + 1 < N) {
//                priorityQueue.add(new AmazonCodeS1.Node(arr[rem.row][rem.column + 1], rem.row,
//                                           rem.column + 1));
//            }
//        }
//        return ans;
//    }
//
//    static private PriorityQueue<AmazonCodeS1.Node> getPriorityQueue(int[][] arr) {
//        boolean isIncreasing = false, isDecreasing = false;
//        // We will check if the input is sorted in increasing manner or
//        // decreasing manner
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i][0] < arr[i][arr[i].length - 1]) {
//                isIncreasing = true;
//            }
//            if (arr[i][0] > arr[i][arr[i].length - 1]) {
//                isDecreasing = true;
//            }
//        }
//
//        if (isIncreasing) {
//            // Make a min priority queue
//            return new PriorityQueue<>();
//        }
//        if (isDecreasing) {
//            // Make a max priority queue
//            return new PriorityQueue<>(arr.length, Collections.reverseOrder());
//        }
//        // Some error in test case; Code should never reach here;
//        return null;
//    }
//
//    static class AmazonCodeS1.Node implements Comparable<AmazonCodeS1.Node> {
//        int value;
//        int row;
//        int column;
//
//        AmazonCodeS1.Node(int xx, int yy, int zz) {
//            value = xx;
//            row = yy;
//            column = zz;
//        }
//
//        @Override
//        public int compareTo(AmazonCodeS1.Node o) {
//            return Long.compare(this.value, o.value);
//        }
//    }

    static int[] mergeArrays(int[][] arr) {

         PriorityQueue<Node> priorityQueue = makePriorityQueue(arr);

         for(int i=0;i<arr.length;i++){
             priorityQueue.add(new Node(arr[i][0],i,0));
         }

         int[] result=new int[arr.length*arr[0].length];

         for(int i=0;i<result.length;i++){
             Node elementNode =priorityQueue.poll();
             result[i]=elementNode.value;
             if(elementNode.column<arr[elementNode.row].length-1) {
                 priorityQueue.add(new Node(arr[elementNode.row][++elementNode.column],elementNode.row,elementNode.column));
             }
         }

        return result;
    }

    static private PriorityQueue<Node> makePriorityQueue(int arr[][]){

        boolean decision=false;

        for(int i=0;i<arr.length;i++){
           decision= (arr[i][0] < arr[i][arr[i].length-1]) ? true : false;
        }

       if(decision)
           return new PriorityQueue<>();
       else
           return new PriorityQueue<>(arr.length,Collections.reverseOrder());

    }

    static class Node implements Comparable<Node>
    {

        int value;
        int row;
        int column;

        Node(int value,int row,int column){
            this.value=value;
            this.row=row;
            this.column=column;
        }


        @Override
        public int compareTo(Node o) {
            return this.value-o.value;
        }
    }
}