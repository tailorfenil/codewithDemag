import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestWithPriorityQueue {

    public int[][] kClosest(int[][] points, int K) {

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o2[0]*o2[0]+o2[1]*o2[1])-(o1[0]*o1[0]+o2[1]*o2[1]);
            }
        });


        for(int i=0;i<points.length;i++){

            priorityQueue.add(points[i]);

            if(priorityQueue.size()>K){
                priorityQueue.poll();
            }
        }

        List<int[]> returnList= new LinkedList<>();

        while(priorityQueue.size()>0){

            returnList.add(priorityQueue.poll());
        }

        return returnList.toArray(new int[points.length][2]);



    }
}
