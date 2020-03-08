package IBInterview;

import IKWebTrees.TreeNode1;

import java.util.Stack;

public class TwoSumInTreeWithOlogNspace {


    /*Aditi's answer --she is genious
        public static int t2Sum(TreeNode1 A, int B) {
            Stack<TreeNode1> left = new Stack<>();
            Stack<TreeNode1> right = new Stack<>();

            int k = B;
            TreeNode1 root = A;
            while(true){
                while(root.val >= k){
                    root = root.left;
                }
                // leftmost node
                TreeNode1 temp = root;

                while(temp != null && temp.left != null){
                    left.push(temp);
                    temp = temp.left;
                    if(temp.left == null)
                        left.push(temp);
                }

                temp = root.right;
                while(temp != null && temp.right != null){
                    right.push(temp);
                    temp = temp.right; //add
                    if(temp.right == null)
                        right.push(temp);
                }

                while(left.size() != 0 || right.size() != 0){
                    TreeNode1 smaller = left.peek();
                    TreeNode1 larger = right.peek();
                    int sum = smaller.val + larger.val;
                    if(sum == k) {
                        System.out.println("Possible");
                        return 1;
                    }
                    if(sum < k ){
                        left.pop();
                        while(smaller.right != null){
                                left.push(smaller.right);
                                smaller =smaller.right;
                        }
                    }
                    if(sum > k ){
                        right.pop();
                            while(larger.left!= null) {
                                right.push(larger.left);
                                 while(larger.left.right != null) {
                                     right.push(larger.left.right);
                                     larger = larger.left;
                                 }
                            }

                    }
                }
                return 0;
            }
        }
        */

    public static int[] t2Sum(TreeNode1 root, int B) {
        Stack<TreeNode1> smaller = new Stack<>();
        Stack<TreeNode1> larger = new Stack<>();

        TreeNode1 curr1 = root;
        Integer val1 = null;
        boolean goingOnSmallerSide = true;

        TreeNode1 curr2 = root;
        Integer val2= null;
        boolean goingOnLargerSide = true;

      while(true) {

          while(goingOnSmallerSide) {
              while (curr1 != null) {
                  smaller.push(curr1);
                  curr1 = curr1.left;
              }

              if(smaller.isEmpty()){
                  goingOnSmallerSide = false;
              }
              else{
                   curr1 = smaller.pop();
                   val1 = curr1.val;
                   curr1 = curr1.right;
                   goingOnSmallerSide= false;
              }
          }


          while(goingOnLargerSide) {
              while (curr2 != null) {
                  larger.push(curr2);
                  curr2 = curr2.right;
              }

              if(larger.isEmpty()){
                  goingOnLargerSide=false;
              }
              else{
                  curr2 = larger.pop();
                  val2 =curr2.val;
                  curr2=curr2.left;
                  goingOnLargerSide=false;
              }
          }

          if(val1.intValue()==val2.intValue()){
              return new int[]{-1};
          }

          if(val1+val2 == B){
              return new int[]{val1,val2};
          }

          else if(val1+val2>B){
              goingOnLargerSide=true;
          }
          else{
              goingOnSmallerSide=true;
          }


      }

    }

    //Answer -2
    //public static int[] t2Sum(TreeNode1 root, int B) {
    // Stack<TreeNode> min = new Stack<TreeNode>();
    //        Stack<TreeNode> max = new Stack<TreeNode>();
    //
    //        minStack(A,min);
    //        maxStack(A,max);
    //
    //      while(min.peek()!=max.peek()){
    //
    //        if(min.peek().val+max.peek().val==B){
    //            return 1;
    //        }
    //        if(min.peek().val+max.peek().val>B){
    //            TreeNode popedNode=max.pop();
    //            maxStack(popedNode.left,max);
    //        }
    //        else{
    //            TreeNode popedNode=min.pop();
    //            minStack(popedNode.right,min);
    //        }
    //      }
    //      return 0;
    //    }
    //
    //    public void minStack(TreeNode A,Stack<TreeNode> min){
    //        while(A!=null){
    //            min.push(A);
    //            A=A.left;
    //        }
    //    }
    //
    //    public void maxStack(TreeNode A,Stack<TreeNode> max){
    //        while(A!=null){
    //            max.push(A);
    //            A=A.right;
    //        }
        //}



}
