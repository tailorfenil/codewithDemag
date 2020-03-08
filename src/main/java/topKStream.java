import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.IntStream;

public class topKStream {

    /*
     * Complete the function below.
     */
    static int[] topK(int[] arr, int k) {

        Set<Integer> res = new HashSet<>();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (i1 < i2)
                    return -1;
                else if (i1 > i2)
                    return 1;
                else
                    return 0;
            }
        });

        for (Integer i : arr) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(i);
                res.add(i);
            }

            if (priorityQueue.size() > k)
                if (i > priorityQueue.peek()) {
                    priorityQueue.add(i);
                    res.add(i);
                    res.remove(priorityQueue.poll());
                }

            Integer[] result = new Integer[priorityQueue.size()];
            result = res.toArray(result);

            int[] resu = new int[result.length];
            for (int j = 0; j < result.length; j++) {
                resu[j] = result[j].intValue();
            }
            return  resu;
        }

        return null;

    }

//    static int[] topK(int[] arr, int k) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue();
//        if(arr.length <= k) {
//            return arr;
//        }
//        for(int i=0; i< arr.length; i++) {
//            if(!minHeap.contains(arr[i])) {
//                minHeap.add(arr[i]);
//            }
//            if(minHeap.size() > k){
//                minHeap.remove();
//            }
//        }
//        int[] result = new int[minHeap.size()];
//        int r = 0;
//        while(!minHeap.isEmpty()) {
//            result[r++] = minHeap.remove();
//        }
//        return result;
//    }
}
