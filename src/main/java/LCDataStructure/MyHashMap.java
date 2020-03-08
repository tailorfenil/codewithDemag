package LCDataStructure;

public class MyHashMap {

    Node[] arr;

    public MyHashMap() {

        arr= new Node[4177];

    }

    public void put(int key, int value) {

        if(arr[key%4177]!=null){

            Node temp = arr[key%4177];

            while(temp!=null){
                if(temp.key==key) {
                    temp.value=value;
                    return;
                }
                temp = temp.next;
            }

            Node newNode = new Node(key,value);
            temp=arr[key%4177];
            newNode.next=temp;
            arr[key%4177]=newNode;
        }
        else{
            arr[key%4177]= new Node(key,value);
        }

    }

    public int get(int key) {

        if(arr[key%4177]!=null){

            Node temp = arr[key%4177];

            while(temp!=null){
                if(temp.key==key) {
                    return temp.value;
                }
                temp=temp.next;
             }
            return -1;
        }

        else{
            return -1;
        }
    }


    public void remove(int key){

        if(arr[key%4177]!=null){

            Node temp = arr[key%4177];
            Node prev=null;

            if(temp.key==key){
                arr[key%4177]=arr[key%4177].next;
                return;
            }

            else{

                while(temp!=null){
                    if(temp.key==key) {
                        prev.next=temp.next;
                        return;
                    }
                    prev=temp;
                    temp=temp.next;
                }

            }


        }
    }



    public class Node{

        int key;
        int value;
        Node next;

        public Node(int key, int value){
            this.key=key;
            this.value=value;
        }
    }

}
