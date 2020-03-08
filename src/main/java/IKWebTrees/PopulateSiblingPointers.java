package IKWebTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PopulateSiblingPointers {

    public static TreeNodeWithNextPtr populateSiblingPointers(TreeNodeWithNextPtr root){


        ArrayList<TreeNodeWithNextPtr> al = new ArrayList<>();

        TreeNodeWithNextPtr nodeCurrent = null;

        Queue<TreeNodeWithNextPtr> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            al.clear();
            int size = queue.size();
            for(int i=0;i<size;i++){

                nodeCurrent = queue.poll();
                al.add(nodeCurrent);

                if(nodeCurrent.left_ptr!=null){
                    queue.offer(nodeCurrent.left_ptr);
                }
                if(nodeCurrent.right_ptr!=null){
                    queue.offer(nodeCurrent.right_ptr);
                }
            }
            for(int i=0;i<al.size()-1;i++){
                al.get(i).next_right = al.get(i+1);
            }
        }

        return root;

    }
}
