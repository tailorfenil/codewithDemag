package IKWebTrees;

import javax.swing.tree.TreeNode;

public class InvertTrees {

    public TreeNode1 invertTree(TreeNode1 root) {

        if(root==null)
            return root;

        TreeNode1 temp= root.left;
        root.left= invertTree(root.right);
        root.right =invertTree(temp);

        return root;
    }
}
