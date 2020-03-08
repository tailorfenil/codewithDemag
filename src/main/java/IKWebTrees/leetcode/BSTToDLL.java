package IKWebTrees.leetcode;


import IKWebTrees.DoublyLinkedList;

public class BSTToDLL {


    static DoublyLinkedList head=null;
    static DoublyLinkedList tail=null;

    public static DoublyLinkedList convertBSTTODLL(DoublyLinkedList root){

        if(root==null){
            return null;
        }

        convertBSTTODLL(root.left);

        if(head==null && tail==null){
            head=root;
            tail=root;
        }
        else{
            root.left=tail;
            tail.right=root;
            tail=root;
        }

        convertBSTTODLL(root.right);

        return root;

    }

}
