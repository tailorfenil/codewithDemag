package IKWebTrees;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBSTs {

    public static TreeNode1 mergeTwoBSTs(TreeNode1 root1, TreeNode1 root2) {

        InOrderTranversal inOrderTranversal = new InOrderTranversal();

        int[] bst1 = inOrderTranversal.inorderTranversal(root1);

        int[] bst2 = inOrderTranversal.inorderTranversal(root2);

        List<Integer> mergeList = MergeList(bst1, bst2);

        TreeNode1 res= constructTree(mergeList,0,mergeList.size()-1);

        return res;
    }


    public static List<Integer> MergeList(int[] bst1, int[] bst2) {

        int i = 0;
        int j=0;
        List<Integer> mergedList = new ArrayList<>();
        while (i < bst1.length && j < bst2.length) {

            if (bst1[i] <= bst2[j]) {
                mergedList.add(bst1[i]);
                i++;
            } else {
                mergedList.add(bst2[j]);
                j++;
            }

        }
        while(i < bst1.length) {
            mergedList.add(bst1[i]);
            i++;
        }
        while(j < bst2.length) {
            mergedList.add(bst2[j]);
            j++;
        }


        return mergedList;


    }

    public static TreeNode1 constructTree(List<Integer> mergedList, int start, int end) {

        if (start > end)
            return null;

        if (start == end)
            return new TreeNode1(mergedList.get(start));


        int mid = (start + end) / 2;

        TreeNode1 treeNode1 = new TreeNode1(mergedList.get(mid));

        treeNode1.left = constructTree(mergedList, start, mid - 1);

        treeNode1.right = constructTree(mergedList, mid + 1, end);

        return treeNode1;

    }
}
