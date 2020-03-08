package IKWebTrees;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPathsOfTree {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> printAllPath(TreeNode1 treeNode1){

        helper(treeNode1,new ArrayList<>());
        return res;
    }


//    public void helper(TreeNode1 treeNode1,List<Integer> slate){
//
//        if(treeNode1==null){
//            res.add(new ArrayList(slate));
//            return;
//        }
//
//        slate.add(treeNode1.val);
//        helper(treeNode1.left,slate);
//        //slate.remove(slate.size()-1);
//
//        helper(treeNode1.right,slate);
//        slate.remove(slate.size()-1);
//
//        return;
//    }


    public void helper(TreeNode1 treeNode1,List<Integer> slate){

        if(treeNode1==null)
             return;

        slate.add(treeNode1.val);
        helper(treeNode1.left,slate);

        if(treeNode1.left==null && treeNode1.right==null) {
            res.add(new ArrayList<>(slate));
            return;
        }

        helper(treeNode1.right,slate);
        slate.remove(slate.size()-1);
    }
}
