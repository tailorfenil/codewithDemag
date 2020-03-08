package IKWebRecursion;

import IKWebTrees.TreeNode1;

public class DiameterOfBinaryTree {

    public static int diameterOfBinaryTree(TreeNode1 root){

        if(root==null){
            return 0;
        }

        int lh = height(root.left);

        int rh = height(root.right);

        int ld = diameterOfBinaryTree(root.left);

        int rd = diameterOfBinaryTree(root.right);

        // It will count number of nodes in the longest path
           //return Math.max(lh+rh+1,Math.max(ld,rd));

        //LC requires this ret value
        //it will count total edges in the longest path
           return Math.max(lh+rh,Math.max(ld,rd));
    }


    public static int height(TreeNode1 node){

        if(node==null)
              return 0;

        return 1+Math.max(height(node.left),height(node.right));
    }



}
