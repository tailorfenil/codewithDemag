package IKLinkedList;

public class SwapNodes {

    public static LinkedListNode swap_nodes(LinkedListNode head, int k){

        if(head==null) return null;

        LinkedListNode curr = head;

        LinkedListNode fastPtr = head,kthfromEnd=head,prevkthFromBegin=null,prevkthFast=null;
        int count=1;

        while(fastPtr!=null && count<k){
            prevkthFromBegin =fastPtr;
            fastPtr=fastPtr.next;
            count++;
        }
        LinkedListNode kthFromBegin=fastPtr;

        while(fastPtr.next!=null){
            fastPtr=fastPtr.next;
            prevkthFast=kthfromEnd;
            kthfromEnd=kthfromEnd.next;
        }

        if(prevkthFromBegin!=null) {
            prevkthFromBegin.next = kthfromEnd;
        }
        if(prevkthFast!=null) {
            prevkthFast.next = kthFromBegin;
        }

        LinkedListNode temp = kthFromBegin.next;
        kthFromBegin.next=kthfromEnd.next;
        kthfromEnd.next=temp;

        if(prevkthFromBegin==null) {
            return kthfromEnd;
        }
        else if(prevkthFast==null){
            return kthFromBegin;
        }
        else{
            return curr;
        }

    }
}
