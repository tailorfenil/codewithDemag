package IKWebTrees;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNodeInfo{

    public int height;
    public boolean isStable;

    public TreeNodeInfo(int height, boolean isStable){
        this.height=height;
        this.isStable=isStable;
    }
}

public class isBSTBalancedLeetCodeOptimal {


        public boolean isBalanced(TreeNode1 root) {

            return helper(root).isStable;

        }


        public TreeNodeInfo helper(TreeNode1 root){

            if(root == null)
                return new TreeNodeInfo(-1,true);

            TreeNodeInfo isLeftStable = helper(root.left);
            if(!isLeftStable.isStable){
                return new TreeNodeInfo(-1,false);
            }


            TreeNodeInfo isRightStable = helper(root.right);
            if(!isRightStable.isStable){
                return new TreeNodeInfo(-1,false);
            }


            if(Math.abs(isLeftStable.height-isRightStable.height)<2){
                return new TreeNodeInfo(Math.max(isLeftStable.height,isRightStable.height)+1,true);
            }

            return new TreeNodeInfo(-1,false);


        }

}
