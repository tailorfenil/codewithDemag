package IKWebTrees;

import java.util.*;

public class ZigZagPrintBinaryTree {

    public List<List<Integer>> zigzagLevelOrder(TreeNode1 root) {

        Queue<TreeNode1> queue = new LinkedList<TreeNode1>();

        List<List<Integer>> list = new ArrayList<>();

        int i=0;
        queue.add(root);
        boolean flag=false;

        while(!(queue.isEmpty())){

            int lengthBefore =queue.size();

            List<Integer> al = new ArrayList<Integer>();

            for(i=0;i<lengthBefore;i++){

                TreeNode1 node = ((LinkedList<TreeNode1>) queue).pop();
                al.add(node.val);

                if(node.left!=null)
                    queue.add(node.left);

                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            if((list.size()%2) ==0){
                list.add(al);
            }
            else{
                Collections.reverse(al);
                list.add(al);
            }
        }

        return list;
    }
}
