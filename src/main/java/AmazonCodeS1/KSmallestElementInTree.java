package AmazonCodeS1;

import IKWebTrees.TreeNode1;

public class KSmallestElementInTree {


    public static int kthsmallest(TreeNode1 A, int B) {

        int lh = noOfNodes(A.left);

        if(B==lh+1){
            return A.val;
        }
        else if(B<=lh){
            return kthsmallest(A.left,B);
        }
        else{
            return kthsmallest(A.right,B-(lh+1));
        }
    }

    public static int noOfNodes(TreeNode1 root){

        if(root==null)
            return 0;

        int lh = noOfNodes(root.left);
        int rh = noOfNodes(root.right);

        return lh+rh+1;
    }
}
