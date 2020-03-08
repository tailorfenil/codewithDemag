package IBSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class NMaxPairCombination {

    public static ArrayList<Integer> solve(List<Integer> A, List<Integer> B) {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        Collections.sort(A);
        Collections.sort(B);
        for(int i=A.size()-1;i>=0;i--)
        {
            for(int j=B.size()-1;j>=0;j--)
            {
                if(pq.size()<A.size())
                {
                    pq.add(A.get(i)+B.get(j));
                }
                else
                {
                    if(A.get(i)+B.get(j)<=pq.peek())// it is less
                    {
                        break;
                    }
                    else
                    {
                        pq.poll();
                        pq.add(A.get(i)+B.get(j));
                    }
                }
            }
        }
        ArrayList<Integer> result= new ArrayList<Integer>();
        while(pq.size()>0)
            result.add(0,pq.poll());
        return result;
    }
}
