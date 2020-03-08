package IKWebTrees;


import java.util.ArrayList;
import java.util.List;

public class SumRootToLeaf {

    List<List<TreeNode1>> resList = new ArrayList<>();
    public int sumRootToLeaf(TreeNode1 root) {

        int sum=0;

        helper(root,new ArrayList<>());

        for(List<TreeNode1> res: resList){
            sum+=convertBinaryToInt(res);
        }
        return sum;
    }

    public void helper(TreeNode1 root,ArrayList<TreeNode1> arrayList){


        if(root==null)
            return;

        arrayList.add(root);
        helper(root.left,arrayList);

        if(root.left==null && root.right==null){
            resList.add(new ArrayList(arrayList));
        }
        helper(root.right,arrayList);
        arrayList.remove(arrayList.size()-1);
    }

    public int convertBinaryToInt(List<TreeNode1> res){

        int binaryToInt=0;
        for(int i=res.size()-1;i>=0;i--){
            binaryToInt+= (res.get(i).val)*(Math.pow(2,res.size()-1-i));
        }
        return binaryToInt;
    }
}
