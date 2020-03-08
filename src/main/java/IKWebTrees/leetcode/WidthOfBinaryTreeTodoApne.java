package IKWebTrees.leetcode;

import IKWebTrees.TreeNode1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class WidthOfBinaryTreeTodoApne {

    //DFS Starts

    int ans;
    Map<Integer, Integer> left;
    public int widthOfBinaryTree(TreeNode1 root) {
        ans = 0;
        left = new HashMap();
        dfs(root, 0, 0);
        return ans;
    }
    public void dfs(TreeNode1 root, int depth, int pos) {
        if (root == null) return;
        left.computeIfAbsent(depth, x-> pos);
        ans = Math.max(ans, pos - left.get(depth) + 1);
        dfs(root.left, depth + 1, 2 * pos);
        dfs(root.right, depth + 1, 2 * pos + 1);
    }

    //DFS Ends



    //BFS Starts
//    public int widthOfBinaryTree(TreeNode1 root) {
//        Queue<AnnotatedNode> queue = new LinkedList();
//        queue.add(new AnnotatedNode(root, 0, 0));
//        int curDepth = 0, left = 0, ans = 0;
//        while (!queue.isEmpty()) {
//            AnnotatedNode a = queue.poll();
//            if (a.node != null) {
//                queue.add(new AnnotatedNode(a.node.left, a.depth + 1, a.pos * 2));
//                queue.add(new AnnotatedNode(a.node.right, a.depth + 1, a.pos * 2 + 1));
//                if (curDepth != a.depth) {
//                    curDepth = a.depth;
//                    left = a.pos;
//                }
//                ans = Math.max(ans, a.pos - left + 1);
//            }
//        }
//        return ans;
//    }
//
//}
//
//    class AnnotatedNode {
//        TreeNode1 node;
//        int depth, pos;
//        AnnotatedNode(TreeNode1 n, int d, int p) {
//            node = n;
//            depth = d;
//            pos = p;
//        }
    //BFS Ends
}
