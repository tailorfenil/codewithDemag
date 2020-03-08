package IKWebTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class InOrderTranversal {


    public void print(TreeNode1 t1){

        if(t1==null)
            return;

        print(t1.left);
        System.out.print(t1.val+" ");
        print(t1.right);

    }

    public int[] inorderTranversal(TreeNode1 t1){

        List<Integer> arrayList= new ArrayList<>();
        Stack<TreeNode1> stack = new Stack<>();

        TreeNode1 curr=t1;

        while(curr!=null || (!stack.isEmpty())){

            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }

            curr=stack.pop();
            arrayList.add(curr.val);
            curr=curr.right;

        }

        int[] result = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }

        return result;
    }

}
