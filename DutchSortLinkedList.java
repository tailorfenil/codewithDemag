package IKLinkedList;

public class DutchSortLinkedList {

    LinkedListNode lessThanD = new LinkedListNode(0);
    LinkedListNode equalD = new LinkedListNode(0);
    LinkedListNode greaterD = new LinkedListNode(0);

    //Mistake Every TIme -- Need to create dummy nodes to handle where this three parition starts.
    //why dummy nodes -- how will you update each list end(let's say first one ) to start of another list(either two /three)?

    //All the below reference we'll use to update the perticular list
    LinkedListNode lessThan = lessThanD,equal =equalD,greater =greaterD;


    public LinkedListNode dutchSort(LinkedListNode start, int k) {

        while (start != null) {
            if (start.value < k) {

                lessThan.next = start;
                lessThan = lessThan.next;
                start = start.next;

            } else if (start.value == k) {

                equal.next = start;
                equal = equal.next;
                start = start.next;

            } else {

                greater.next = start;
                greater = greater.next;
                start = start.next;
            }

        }

        //very imp --- need to update for each list END
        lessThan.next = (equalD.next != null) ? equalD.next : greaterD.next; //Imp check if second list is empty..!
        equal.next = greaterD.next;
        greater.next=null; // don't forget otherwise it is an infnite list//
        return lessThanD.next;

    }

}
