package AmazonCodeS1;

import java.util.HashMap;


//Todo:Need to test
//138. Copy List with Random Pointer
public class CopyLinkedListWithRandomPointer {

    static HashMap<Node,Node> resultMap= new HashMap<>();

    public static Node copyRandomList(Node head) {

      Node current= head;
      Node setNextAndRandom = head;

      while(current!=null){
          resultMap.put(current,new Node(current.val,null,null));
          current=current.next;
      }

      while(setNextAndRandom!=null){

          resultMap.get(setNextAndRandom).next= resultMap.get(setNextAndRandom.next);
          resultMap.get(setNextAndRandom).random = resultMap.get(setNextAndRandom.random);
          setNextAndRandom=setNextAndRandom.next;
      }

      return resultMap.get(head);

    }
}


/*
---Optimal

public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node node = head;
        while (node != null) {
            Node newNode = new Node();
            newNode.val = node.val;
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }
        node = head;
        while (node != null && node.next != null) {
            if (node.random != null) {
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
        Node cloneHead = head.next;
        Node cloneNode = cloneHead;
        node = head;
        while (node != null && node.next != null) {
            node.next = node.next.next;
            node = node.next;
            if (cloneNode.next != null) {
                cloneNode.next = cloneNode.next.next;
                cloneNode = cloneNode.next;
            }
        }
        return cloneHead;
    }




----


 */



