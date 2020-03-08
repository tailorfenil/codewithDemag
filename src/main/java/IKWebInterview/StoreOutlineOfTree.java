package IKWebInterview;

  /*
Write a function that takes an input string and a character set and returns the minimum-length substring which contains every letter of the character set at least once, in any order
If you don't find a match, return an empty string
*/















/*
Given a binary tree, print the boundary nodes of the binary tree in anti-clockwise order starting from the root node.

Input :

                20
              /    \
             8      22
              \      \
              12     25
             /  \
            10  14

Output:
[20, 8, 4, 10, 14, 25, 22]


Pseudocode:

1)traverse to left branch add node values to result ; 20,8

2)def(TreeNode tn){

--> if(tn==null) return;
-->    def(tn.left);
--> if(tn.left==null & tn.right=null || tn.left==null) {add it to result  12,10,14,25}
-->   def(tn.right);

}
3)traverse to right branch and add node values reverse it and add it to result 25,22,[20-need to remove]

*/

/*
class Main {

    ArrayList<Integer> res= new ArrayList<>();

    ArrayList<Integer> rightList = new ArrayList<>();

    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);

        root.left = new TreeNode(8);
        root.left.right= new TreeNode(12);
        root.left.right.left= new TreeNode(10);
        root.left.right.right= new TreeNode(14);

        root.right = new TreeNode(22);
        root.right.right = new TreeNode(25);



        helper(root);

        for(int i: res){

            System.out.print(i+" ");
        }

        System.out.print("hi ");




    }

    /*
    Input :

                20
              /    \
             8      22
              \      \
              12     25
             /  \
            10  14

Output:
[20, 8, 4, 10, 14, 25, 22]
*/

/*

    public void helper(TreeNode root){

        part1(root);
        part2(root);
        part3(root);

    }



    public void part1(TreeNode root){

        if(root==null) return null;

        res.add(temp.val);

        part1(root.left);
    }

}

    public void part2(TreeNode root){

        if(root==null) return null;

        part2(root.left);
        if(root.left==null && root.right==null){
            res.add(root.val);
        }
        part2(root.right);

    }


    public void part3(TreeNode root){

        if(root==null) return null;

        rightList.add(temp.val);
        part3(root.right);

        rightList.remove(0);
        rightList.remove(rightList.size()-1);
        Collections.reverse(rightList);

        res.addAll(rightList);

    }




class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
}



*/

import IKWebTrees.TreeNode1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoreOutlineOfTree {

    List<Integer> res= new ArrayList<>();

    ArrayList<Integer> rightList = new ArrayList<>();


    public List<Integer> helper(TreeNode1 root){

        part1(root);
        part2(root);
        part3(root);

        rightList.remove(0);
        rightList.remove(rightList.size()-1);
        Collections.reverse(rightList);

        res.addAll(rightList);

        return res;

    }


    /*
    Input :

                20
              /    \
             8      22
              \      \
              12     25
             /  \
            10  14

Output:
[20, 8, 4, 10, 14, 25, 22]
     */


    public void part1(TreeNode1 root){

        if(root==null) return;

        res.add(root.val);

        part1(root.left);

        if(root.left==null && root.right!=null){res.add(root.right.val);}
    }


    public void part2(TreeNode1 root){

        if(root==null) return;

        part2(root.left);
        if(root.left==null && root.right==null){
            res.add(root.val);
        }
        part2(root.right);

    }


    public void part3(TreeNode1 root){

        if(root==null) return;

        rightList.add(root.val);
        part3(root.right);

    }


}
