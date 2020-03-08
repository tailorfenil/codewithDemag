import java.util.PriorityQueue;

public class MergeKSortedList {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pQueue = new PriorityQueue<>();

        ListNode start=new ListNode(-1);
        ListNode res=start;

        for(int i=0;i<lists.length;i++){
//            pq.add(lists[i].get(0)); wrong it should be address and not value, we need to increment address every time, if we took value we can't do that
            pQueue.add(lists[i]);
        }

        while(pQueue.size()!=0){
            ListNode listNode= pQueue.poll();
            start.next=listNode;
            start=listNode;
            if(listNode.next!=null){
                listNode=listNode.next;
                pQueue.add(listNode);
            }
        }

        return res.next;
    }
}
