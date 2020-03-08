

public class mergeTwoLists {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode temp= new ListNode(0);
        ListNode res=temp;

        while(A!=null && B!=null){

            if(A.val<=B.val){
                // System.out.println(A.val+" ");
                temp.next=A;
                temp=temp.next;
                A=A.next;
            }
            else{
                // System.out.println(B.val+" ");
                temp.next=B;
                temp=temp.next;
                B=B.next;
            }

        }
        if(A!=null){
            temp.next=A;

        }
        else if(B!=null){
            temp.next=B;
        }
        return res.next;

    }
}
