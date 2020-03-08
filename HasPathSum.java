package IKWebTrees;

public class HasPathSum {


    public boolean hasPathSum(TreeNode1 root, int sum) {

        return helper(root,sum);

    }

    public boolean helper(TreeNode1 root,int sum){

        if(root==null)
            return false;

        // if(sum<0) //it can be minus value
        //     return false;

        sum-=root.val;
        boolean left = helper(root.left,sum);

        if(root.left==null && root.right==null && sum==0){
            return true;
        }
        boolean right = helper(root.right,sum);
        //sum+=root.val; we don't have to here 

        return (left || right);
    }
}
