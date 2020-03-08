public class PreOrderTranversal {


    public void print(TreeNode t1){

        if(t1==null)
            return;

        print(t1.left);
        System.out.print(t1.val+" ");
        print(t1.right);

    }
}
