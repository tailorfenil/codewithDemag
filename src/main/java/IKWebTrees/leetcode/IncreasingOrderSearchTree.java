package IKWebTrees.leetcode;

import IKWebTrees.TreeNode1;

public class IncreasingOrderSearchTree {

    //                       5
    //                     3   6
    //                   2    1  4

    TreeNode1 Head=null,Tail=null;
    public TreeNode1 increasingBST(TreeNode1 root) {

        if(root==null)
            return null;

        helper(root);

        return Head;

    }

    public void helper(TreeNode1 root){

        if(root==null)
            return;

        helper(root.left);

        if(Head==null){
            Head=root;
            Tail=root;
        }
        else {
            Tail.right = root;
            Tail.left = null;
            Tail = root;
        }

        helper(root.right);
    }
}
