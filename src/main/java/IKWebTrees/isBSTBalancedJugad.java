package IKWebTrees;

public class isBSTBalancedJugad {

    boolean result=true;
    public boolean isBalanced(TreeNode1 root) {
        helper(root);
        return  result;
    }

    public int helper(TreeNode1 root){

        if(root==null) return 0;

        int leftheight = helper(root.left);
        if(!result) return -1;
        int rightheight = helper(root.right);
        if(!result) return -1;

        if(Math.abs(leftheight-rightheight)>1){
            result=false;
        }
        return 1+Math.max(leftheight,rightheight);

    }

}
