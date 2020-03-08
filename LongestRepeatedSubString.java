package IkWebStrings;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatedSubString {


//    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz\1";
//
//    public static class Node {
//        int begin;
//        int end;
//        int depth; // distance in characters from root to this node
//        Node parent;
//        Map<Byte, Node> children;
//        Node suffixLink;
//
//        Node(int begin, int end, int depth, Node parent) {
//            this.begin = begin;
//            this.end = end;
//            this.parent = parent;
//            this.depth = depth;
//            children = new HashMap();
//        }
//    }
//
//    public static Node buildSuffixTree(CharSequence s) {
//        int n = s.length();
//        byte[] a = new byte[n];
//        Map<Character, Byte> map = new HashMap<>();
//        for (int i = 0; i < ALPHABET.length(); i++) {
//            map.put(ALPHABET.charAt(i), (byte) i);
//        }
//        // Converting CharSequence s to byte array a, using index of that char in universal string ALPHABET
//        for (int i = 0; i < n; i++) a[i] = map.get(s.charAt(i));
//        Node root = new Node(0, 0, 0, null);
//        Node node = root;
//        for (int i = 0, tail = 0; i < n; i++, tail++) {
//            Node last = null;
//            while (tail >= 0) {
//                Node ch = node.children.get(a[i - tail]);
//                while (ch != null && tail >= ch.end - ch.begin) {
//                    tail -= ch.end - ch.begin;
//                    node = ch;
//                    ch = ch.children.get(a[i - tail]);
//                }
//                if (ch == null) {
//                    node.children.put(a[i], new Node(i, n, node.depth + node.end - node.begin, node));
//                    if (last != null) last.suffixLink = node;
//                    last = null;
//                } else {
//                    byte t = a[ch.begin + tail];
//                    if (t == a[i]) {
//                        if (last != null) last.suffixLink = node;
//                        break;
//                    } else {
//                        Node splitNode = new Node(ch.begin, ch.begin + tail,
//                                                  node.depth + node.end - node.begin, node);
//                        splitNode.children.put(a[i], new Node(i, n, ch.depth + tail, splitNode));
//                        splitNode.children.put(t, ch);
//                        ch.begin += tail;
//                        ch.depth += tail;
//                        ch.parent = splitNode;
//                        node.children.put(a[i - tail], splitNode);
//                        if (last != null) last.suffixLink = splitNode;
//                        last = splitNode;
//                    }
//                }
//                if (node == root) {
//                    --tail;
//                } else {
//                    node = node.suffixLink;
//                }
//            }
//        }
//        return root;
//    }
//
//    static int lrsLength;
//    static int lrsSuffixIndex;
//    static String s;
//
//    static void findLRS(Node node) {
//        boolean isLeaf = true;
//        for (Byte b : node.children.keySet()) {
//            isLeaf = false;
//            findLRS(node.children.get(b));
//        }
//        // As name suggests, isLeaf will be true at this point, if it has no child
//
//        // If node is a leaf, then suffix string formed by path from root to it's parent node is a
//        // repeated substring
//        // and a candidate for longest repeated substring
//        if (isLeaf) {
//            int currLength = node.depth;
//            // currLength here denotes path length of node.parent. i.e. node.parent.pathLength == node.depth
//            if (currLength > lrsLength) {
//                lrsLength = currLength;
//                lrsSuffixIndex = s.length() - (node.depth + node.end - node.begin);
//                // For a leaf node, suffixIndex(i.e. index of suffix that ends here) is nothing but (
//                // (length of given
//                // string s) - path length of current node)
//            }
//        }
//    }
//
//    public static String getLongestRepeatedSubstring(String inputStr) {
//        // Adding a special character('\1' here) in the end of string to make it explicit suffix tree.
//        // In explicit suffix tree, all the suffixes ends at a leaf
//        s = inputStr + "\1";
//        Node tree = buildSuffixTree(s);
//        lrsLength = 0;
//        lrsSuffixIndex = -1;
//        // findLRS will find the LRS and will populate the results in lrsLength and lrsSuffixIndex
//        findLRS(tree);
//        String lrs = "";
//        if (lrsLength > 0) {
//            lrs = s.substring(lrsSuffixIndex, lrsSuffixIndex + lrsLength);
//        }
//        return lrs;
//    }

    public static String getLongestRepeatedSubstring(String inputStr) {
        int n = inputStr.length();
        int[][] lcp = new int[n+1][n+1];
        int res_length=0;
        int index=0;
        StringBuffer sb= new StringBuffer();
        // lcp[i][j] = k means length of longest common prefix between suffix starting at i and suffix
        // starting at j is k

        for (int i = 1; i <= n; i++) {
           for(int j=i+1;j<=n; j++){
               if(inputStr.charAt(i-1)==inputStr.charAt(j-1)){
                   lcp[i][j]=lcp[i-1][j-1]+1;
                   if(lcp[i][j]>res_length){
                       res_length=lcp[i][j];
                       index=i;
                   }
               }
               else{
                   lcp[i][j]=0;
               }

            }

        }

        //return inputStr.substring(index-res_length+1,res_length+1); IMP. don't do this mistake. as our matrix is [n]*[n] , we need to take value for n-1;
        for(int i=index-res_length+1;i<=res_length;i++){
            sb.append(inputStr.charAt(i-1));  // here our index,red_length is based on matrix but when we need to get value we are getting it from string
        }
        return sb.toString();
    }
}
