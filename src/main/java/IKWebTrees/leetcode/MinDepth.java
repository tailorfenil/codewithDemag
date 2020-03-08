package IKWebTrees.leetcode;

import IKWebTrees.TreeNode1;

public class MinDepth {

    static int minDepth = Integer.MAX_VALUE;

    public static int minDepth(TreeNode1 A) {

    // if(A==null)
    //   return 0;

    // return 1+Math.min(minDepth(A.left),minDepth(A.right));

    // if(A==null)
    //   return 0;

    // int lh =minDepth(A.left);

    // if(A.left==null && A.right==null){
    //     min=Math.min(min,min_val);
    // }

    // int rh =minDepth(A.right);

    // min_val = 1+Math.max(lh,rh);
    // return min_val;

    //   return helper(A,0,Integer.MAX_VALUE);


    //Rare case when A it self is null
//      if(A==null){
//        return 0;
//    }
//
//      if(A.left==null && A.right==null){
//        return 1;
//    }
//
//      if(A.left==null){
//        return minDepth(A.right);
//    }
//
//      if(A.right==null){
//        return minDepth(A.left);
//    }
//
//      return 1+Math.min(minDepth(A.left),minDepth(A.right));

        return 1+helper(A,0);


}

    public static int helper(TreeNode1 tn, int level){

        if(tn==null)
            return 0;

        helper(tn.left,level+1);

        if(tn.left==null && tn.right==null){
            minDepth= Math.min(minDepth,level);
            return minDepth;
        }

        helper(tn.right,level+1);

        return minDepth;

    }

// public int helper(TreeNode A,int depth, int min){

//     if(A==null)
//         return 0;

//     helper(A.left,depth+1,min);

//     if(A.left==null && A.right==null){
//         min=Math.min(min,depth);
//     }

//     helper(A.right,depth+1,min);

//     return min;


// }
}
