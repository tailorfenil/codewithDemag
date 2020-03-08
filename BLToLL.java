package IKWebRecursion;

import IKWebTrees.TreeNode1;

import java.util.ArrayList;
import java.util.List;

public class BLToLL {

    List<TreeNode1> resultList = new ArrayList<>();


    public TreeNode1 BTtoLL(TreeNode1 root){

        inorder(root);

        if(resultList.size()>0) {
            TreeNode1 prev = resultList.get(0);

            for (TreeNode1 treeNode1 : resultList) {
                   prev.right=treeNode1;
                   treeNode1.left=prev;
                   prev=treeNode1;
            }


            TreeNode1 start = resultList.get(0);
            TreeNode1 tail = resultList.get(resultList.size()-1);

            start.left=tail;
            tail.right=start;
            root=resultList.get(0);
        }


        return root;


    }



    public void inorder(TreeNode1 root){

        if(root==null)
            return;

        inorder(root.left);
        resultList.add(root);
        inorder(root.right);
    }
}
