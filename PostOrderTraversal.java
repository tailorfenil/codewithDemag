package IKWebTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class PostOrderTraversal {

    public int[] postOrderTraversal(TreeNode1 treeNode1) {

        List<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode1> stack = new Stack<>();

        TreeNode1 curr = treeNode1;

        while (curr != null || (!stack.isEmpty())) {

            while (curr != null) {
                arrayList.add(curr.val);
                stack.push(curr);
                curr = curr.right;
            }

            curr = stack.pop();
            curr = curr.left;

        }
        Collections.reverse(arrayList);
        int[] result = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }

        return result;

    }


}

