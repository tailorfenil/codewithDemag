package IKWebTrees.leetcode;

import IKWebTrees.TreeNode1;

public class HeightOfBinaryTree {


    public static int height(TreeNode1 node){

//        if(treeNode1==null) return 0;
//
//        int lh = height(treeNode1.left);
//        int rh = height(treeNode1.right);
//
//        return 1+ Math.max(lh,rh);

        if (node == null)
            return -1;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = height(node.left);
            int rDepth = height(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return(lDepth + 1);
            else return(rDepth + 1);
        }
    }


}
