import java.util.List;

// * Definition for singly-linked list.
public class ListNode implements Comparable<ListNode> {

    public int val;

    public ListNode next;

    ListNode(int x) { val = x; next = null; }

    ListNode(int x,ListNode listNode) { val = x; next = listNode; }

    public ListNode getNext() {
        return next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public int compareTo(ListNode o) {
        return Long.compare(this.val,o.val);
    }
}