package LCLinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {


//    int capacity;
//    Map<Integer,Node> hm;
//    Node head,tail;
//
//
//    public LRUCache(int capacity) {
//        this.capacity=capacity;
//        this.hm = new HashMap<>();
//    }
//
//    public int get(int key) {
//
//        if(hm.containsKey(key)){
//            int value= removeNode(key);
//            addNode(key,new Node(key,value));
//            return hm.get(key).value;
//        }
//        else{
//            return -1;
//        }
//
//    }
//
//    public void put(int key, int value) {
//
//        if(hm.size()==capacity){
//            removeNode(head.key);
//        }
//        else if(hm.containsKey(key)){
//            removeNode(key);
//        }
//        addNode(key,new Node(key,value));
//    }
//
//
//    public int removeNode(Integer key){
//        Node val = hm.get(key);
//
//        if(val==head && val==tail){
//            head=tail=null;
//        }
//        else if(val==head){ //only if we reached cache size
//            head=head.next;
//            head.prev=null;
//        }
//        else if(val==tail){ // it is possible if we are hitting the same request again and again //remove from end ;add to end
//            tail=tail.prev;
//            tail.next=null;
//        }
//        else{
//            val.prev.next=val.next;
//            val.next.prev=val.prev;
//        }
//        hm.remove(key); //don't forget it
//        return val.value;
//
//    }
//
//    public void addNode(int key, Node node){
//
//        if(head==null){
//            head=tail=node;
//            hm.put(key,node);
//            return;
//        }
//        hm.put(key,node); //remeber to add that
//
//         tail.next=node;
//         node.prev=tail;
//
//         tail=node;
//         return;
//    }
//
//
//}
//
//class Node{
//
//    int key;
//    int value;
//    Node prev;
//    Node next;
//
//    Node(int key, int value){
//        this.key=key;
//        this.value=value;
//    }
// }


    Map<Integer,Node> hm;
    int capacity;
    Node head,tail;

    public LRUCache(int capacity){
        this.hm= new HashMap<Integer,Node>();
        this.capacity=capacity;
    }

    public int get(int key) {

        if(hm.containsKey(key)){
            int val= removeNode(key); //we need value to add it in next step
            addNode(key,val);
            return val;
        }
        else{
            return -1;
        }

    }

    public void put(int key, int value) {
        //capacity reached
        if(hm.containsKey(key)){  //  very imp case, don't forget it where we need to add same key is being added with dofferent value ["LRUCache","get","put","get","put","put","get","get"] [[2],[2],[2,6],[1],[1,5],[1,2],[1],[2]]
            removeNode(key);
        }
        else if(hm.size()==capacity){
                removeNode(head.key);
        }
        addNode(key,value);
    }

    public void addNode(int key,int value){
        Node newNode= new Node(key,value);
        if(head==null){
            head=tail= newNode;
            hm.put(key, newNode);
            return;
        }
        tail.next= newNode;
        newNode.prev=tail;
        tail=newNode;

        hm.put(key, newNode);
    }

    public int removeNode(int key){

        Node removedNode = hm.get(key);

        if(removedNode==head && removedNode==tail){
            head=tail=null;
        }

        else if(removedNode==head){
            head = removedNode.next;
            head.prev=null;
        }

        else if(removedNode==tail){
            tail=tail.prev;
            tail.next=null;
        }
        else{
            removedNode.prev.next=removedNode.next;
            removedNode.next.prev=removedNode.prev;
        }
        hm.remove(key);
        return removedNode.value;
    }


}

class Node{

    int key;
    int value;
    Node prev;
    Node next;

    Node(int key,int value){
        this.key=key;
        this.value=value;
    }

}
