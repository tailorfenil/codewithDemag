package LCGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

//Adding all arrivals to priority queue, do dfs on each arrival and it will be in sorited order because of priority queue. After recursion ends , add departure in result

public class ReiterateItnerary {

    HashMap<String, PriorityQueue<String>> hm = new HashMap<>();
    List<String> res= new ArrayList<>();
    public List<String> findItinerary(List<List<String>> tickets) {

        for(int i=0;i<tickets.size();i++){
            if(!hm.containsKey(tickets.get(i).get(0))) // Consider having two tickets with same depature here , don't do mistake of creating pq for all departure as it can be duplicated
                hm.put(tickets.get(i).get(0),new PriorityQueue<String>());
        }

        for(int i=0;i<tickets.size();i++){
            String dep =tickets.get(i).get(0);
            String arr =tickets.get(i).get(1);
            hm.get(dep).add(arr);
        }
        dfs("JFK");
        return res;

    }

    public void dfs(String dep){

        PriorityQueue<String> pq= hm.get(dep); //All Arrivals for depature in sorted order

//        if(pq!=null && pq.isEmpty()){  Wrong way to handle base condition, As here is not where we are returning from recursion
//            res.add(0,dep);
//            return;
//        }

        while(pq!=null && !pq.isEmpty()){ // need to include pq!=null to avoid NPE for SJC , custom check
            String pollArrival = pq.poll();
            dfs(pollArrival);
        } //returning from recursion

//        if(pq.size()==0 && pq.isEmpty()){  // was facing SJC being not included here , as pq even if initailize for SJC, it was considering as null--worth to note here. Secondly, we might not need this condition
//                                           //  as we already checked about that  above while
            res.add(0,dep);
            return;
//        }
    }
}
