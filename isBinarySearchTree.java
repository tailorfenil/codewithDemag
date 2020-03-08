package IKWebTrees;

public class isBinarySearchTree {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */


    public boolean isValidBST(TreeNode1 root) {
        return helper(root, null, null);
    }


    public boolean helper(TreeNode1 root, Integer lowerbound, Integer upperbound) {

        TreeNode1 node = root;

        if (root == null) {
            return true;
        }

        if (upperbound!=null && node.val >= upperbound) {
            return false;
        }
        if (lowerbound!=null && node.val <= lowerbound) {
            return false;
        }

//      return  helper(root.left,lowerbound,root.val) &&
        //helper(root.right,root.val,upperbound);

        if (!helper(root.left, lowerbound, root.val)) return false;

        if (!helper(root.right, root.val, upperbound)) return false;

        return true;


    }
}
