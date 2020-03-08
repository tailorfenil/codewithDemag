package IKWebTrees;

public class FindSingleValueTrees {

    static int count = 0;
    static public int findSingleValueTrees(TreeNode1 root){

        findValue(root);
        return count;
    }
    static public boolean findValue(TreeNode1 root){

        if (root == null){
            return false;
        }

        boolean isLeft = findValue(root.left);
        boolean isRight = findValue(root.right);

        if (root.left == null && root.right == null){
            count = count+1;
            return true;
        }

        if (isLeft && isRight && root.left.val == root.val && root.right.val == root.val){
            count = count+1;
            return true;
        } else if (isLeft && root.left.val == root.val && root.right == null){
            count = count+1;
            return true;
        } else if (isRight && root.right.val == root.val && root.left == null){
            count = count+1;
            return true;
        }

        return false;

    }





}
