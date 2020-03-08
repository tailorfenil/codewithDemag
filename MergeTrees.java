import java.util.Stack;

public class MergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1==null) return t2;


        Stack<TreeNode[]> stack = new Stack<TreeNode[]>();

        stack.push(new TreeNode[]{t1,t2});

        while(!(stack.isEmpty())){

            TreeNode [] treeNodes = stack.pop();

            if(treeNodes[1]==null) continue;

            treeNodes[0].val+= treeNodes[1].val;

            if(treeNodes[0].left==null){
                treeNodes[0].left = treeNodes[1].left;
            }
            else{
                stack.push(new TreeNode[]{treeNodes[0].left,treeNodes[1].left});
            }

            if(treeNodes[0].right==null){
                treeNodes[0].right = treeNodes[1].right;
            }
            else{
                stack.push(new TreeNode[]{treeNodes[0].right,treeNodes[1].right});
            }

        }

        return t1;


    }
}
