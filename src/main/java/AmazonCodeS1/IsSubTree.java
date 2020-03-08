package AmazonCodeS1;

import IKWebTrees.TreeNode1;

//We can also do with preorder printing and look if the substring is there or not. Two cases we need to add # before every value and left&right null should be sepreated(for which why I don't know);
//572. Subtree of Another Tree
public class IsSubTree {

    public boolean isSubtree(TreeNode1 s, TreeNode1 t) {

        return traverse(s,t);

    }

    public boolean valueCheck(TreeNode1 s, TreeNode1 t){

        if(s==null && t==null)
            return true;

        if(s==null|| t==null)
        return false;

        return (s.val==t.val) && valueCheck(s.left,t.left) && valueCheck(s.right,t.right);

    }

    public boolean traverse(TreeNode1 s,TreeNode1 t){

        return (s!=null) && (valueCheck(s,t) || traverse(s.left,t) || traverse(s.right,t));

    }
}
