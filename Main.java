import IKGraphs.CountBasins;
import IKGraphs.ShortestDistanceFromGuard;
import IKWebInterview.RestoreIPAddress;
import IKWebTrees.*;
import LCRecursion.*;
import Microsoft.MaxInsertWithout3ConsecutiveAs;
import Microsoft.MaximumPossibleValue;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


//        Solution1 solution1 = new Solution1();
//        solution1.removeDuplicates(new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3)));
//        solution1.removeDuplicates(new ArrayList<>(Arrays.asList(1,1,2)));

        //********** mergeTwoLists *********
//        ListNode l1 = new ListNode(5,new ListNode(11,new ListNode(15)));
//        ListNode l2  = new ListNode(6,new ListNode(10,new ListNode(16)));
//        mergeTwoLists mergeTwoLists1= new mergeTwoLists();
//        System.out.println(mergeTwoLists1.mergeTwoLists(l1,l2));

//        QConstructionByHeight qConstructionByHeight = new QConstructionByHeight();
//        int[][] val =QConstructionByHeight.reconstructQueue(new int[][]{
//                {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}});
//        for(int [] i: val) {
//            System.out.println(i[0]+","+i[1]);
//
//        }

//        List<Integer> al = new ArrayList<Integer>();
//        al.add(0);
//        al.add(4,2);  //NPE if the position is not there

        //ConvertBSTToGreaterTree convertBSTToGreaterTree = new ConvertBSTToGreaterTree();
        //Todo : Bakki convertBSTToGreaterTree.convertBST(new TreeNode(5).left(new TreeNode(2))).right(new TreeNode(13));


//        Remove_OuterMost_Parentheses rop = new Remove_OuterMost_Parentheses();
//        System.out.println(rop.removeOuterParentheses("(()())(())"));

//        FlipAndInvertImage flipAndInvertImage = new FlipAndInvertImage();
//        for(int[] i : flipAndInvertImage.flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0} })){
//            for(int j:i){
//               //System.out.print(j+" ");
//            }
//           // System.out.println();
//        }


//        MergeTrees mergeTrees = new MergeTrees();
//        PreOrderTranversal preOrderTranversal = new PreOrderTranversal();
//
//        TreeNode treeNode1 = new TreeNode(5);
//
//        treeNode1.left = new TreeNode(3);
//        treeNode1.right = new TreeNode(6);
//
//        treeNode1.left.left = new TreeNode(2);
//
//        treeNode1.right.left = new TreeNode(1);
//        treeNode1.right.right = new TreeNode(4);
//       //--------------------------------------------
//        TreeNode treeNode2 = new TreeNode(1);
//
//        treeNode2.left = new TreeNode(2);
//        treeNode2.right = new TreeNode(3);
//
//        treeNode2.left.left = new TreeNode(4);
//        treeNode2.left.right = new TreeNode(5);

//        preOrderTranversal.print(treeNode1);
//        System.out.println();
//        preOrderTranversal.print(treeNode2);
//        System.out.println();
//        preOrderTranversal.print(mergeTrees.mergeTrees(treeNode1,treeNode2));


//        peakIndexInMountainArray peakIndexInMountainArray = new peakIndexInMountainArray();
//        peakIndexInMountainArray.peakIndexInMountainArray(new int[]{4,5,4,2,3});


        //    ExecptionMethodCallWithinMethod execptionMethodCallWithinMethod = new ExecptionMethodCallWithinMethod();
        //  execptionMethodCallWithinMethod.method1(2);

//        int a=2;
//        int res = Optional.ofNullable(a)
//                .filter(x->x==2)
//                .orElseGet(()->3);
//        System.out.println(res);

//          NumUniqueEmails numUniqueEmails = new NumUniqueEmails();
//        System.out.println(numUniqueEmails.numUniqueEmails(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"}));
//        System.out.println(numUniqueEmails.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"}));
//
//        HeightChecker heightChecker = new HeightChecker();
//        heightChecker.heightChecker(new int[]{1,1,4,2,1,3});

//        CountCharacter countCharacter= new CountCharacter();
//        System.out.println(countCharacter.countCharacters(new String[]{"cat","bt","hat","tree"},"atach"));

        //Need to do
//          MergeSort mergeSort = new MergeSort();
//        for(int i: mergeSort.mergeSort(new int[]{5, 1, 6, 2, 3, 4},6)){
//            System.out.print(  i+" ");
//        }

//        MergeSortOmkar mergeSortOmkar = new MergeSortOmkar();
//        for(String i: mergeSortOmkar.mergeSort(new ArrayList<>(Arrays.asList("5","1","6","2","3","4")))){
//           System.out.print(  i+" ");
//        }

//        QuickSort quickSort= new QuickSort();
//        for(int i: quickSort.quickSort(new int[]{5,1,6,2,3,4},0,5)){
//            System.out.print(  i+" ");
//        }

//
//        QuickSelect quickSelect= new QuickSelect();
//        System.out.println(quickSelect.quickSelect(new int[]{5,1,6,2,4,3},2)); //2nd largest
//        System.out.println(quickSelect.quickSelect(new int[]{5,1,6,2,4,3},4)); //4th largest

        //KClosestPointsWithQuickSelect kClosestPoints = new KClosestPointsWithQuickSelect();
        //int[][] res=kClosestPoints.kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2);
        //int[][] res=kClosestPoints.kClosest(new int[][]{{0,1},{1,0},{3,0}},2);
//        int[][] res=kClosestPoints.kClosest(new int[][]{{0,1},{1,0}},2);

//        for(int[] i:res ){
//            System.out.println(i[0] +" "+i[1]);
//        }


//        KClosestWithPriorityQueue kClosestWithPriorityQueue= new KClosestWithPriorityQueue();
//        int[][] res=kClosestWithPriorityQueue.kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2);
//
//        for(int[] i:res ){
//            System.out.println(i[0] +" "+i[1]);
//        }

        // System.out.println(topKStream.topK(new int[]{5,1,6,2,4,3},2));

//        for(String s:ThreeSum.findZeroSum(new int[]{-1,-1,0,1,2}))
//            System.out.println(s);

//        for(int i:mergeFirstIntoSecond.merger_first_into_second(new int[]{11,11},new int[]{3,11,0,0})){
//            System.out.print(  i+" ");
//        }
//
//        for(char i:DutchFlag.dutch_flag_sort(new char[]{'G','G','R','G','B','R'})){
//            System.out.print(  i+" ");
//        }
//-------
        //int[] arr = MergeKSortedArray.mergeArrays(new int[][]{{2,6,12,34},{1,9,20,1000}});
        //int[] arr = MergeKSortedArray.mergeArrays(new int[][]{{34,12,6,2},{1000,20,9,1}});

//        for(int i:arr){
//            System.out.print(i+" ");
//   }
        //----------

      //  https://leetcode.com/problems/merge-k-sorted-lists/solution/ todo:pls do every time once
//        MergeKSortedList mergeKSortedList = new MergeKSortedList();
//
//
//        ListNode listNode = mergeKSortedList.mergeKLists(new ListNode[]{new ListNode(2, new ListNode(5, new ListNode(15))),
//                                                                        new ListNode(1, new ListNode(4, new ListNode(16)))});
//
//        while (listNode != null) {
//            System.out.print(listNode.val + " ");
//            listNode = listNode.next;
//        }


//------------------
//        List<List<Integer>> list = Subset.subsets(new int[]{1, 2, 3});
//        for (List<Integer> list1 : list) {
//            for (int i : list1) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//-----------------

//        SubSet2 subSet2 = new SubSet2();
//        ArrayList<ArrayList<Integer>> list= subSet2.subsetsWithDup(new ArrayList<>(Arrays.asList(1, 2, 2)));
//        for (List<Integer> list1 : list) {
//            for (int i : list1) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//----------------

//        PemutationSequence pemutationSequence = new PemutationSequence();
//        System.out.println(pemutationSequence.getPermutation(5,1));


//----------------


//        for(String s:generateAllSubsets.generate_all_subsets("abc")){
//            System.out.println(s);
//        }

///     ---------Test
        //System.out.println(SumTest.check_if_sum_possible(new long[]{-10l,-5l},-15));
///    ---------


///        -----------Test
//        String[] arr=  BracketsTest.find_all_well_formed_brackets(3);
///       -------------

// Baki evalutation -- todo::/must for recursion do it everytime
//        ExpressionEvaluateOperators expressionEvaluateOperators =new ExpressionEvaluateOperators();
//        String[] res = expressionEvaluateOperators.evaluateOperator("123");
//
//        for(String s:res){
//            System.out.println(s);
//        }

        //ExpressionEvaluateOperators expressionEvaluateOperators =new ExpressionEvaluateOperators();
//        String[] res = expressionEvaluateOperators.evaluateOperator("222",24);
//        for(String s:res){
//            System.out.println(s);
//        }

//        String[] res = expressionEvaluateOperators.evaluateOperator("0505",5);
//        for(String s:res){
//            System.out.println(s);
//        }

//        String[] res = expressionEvaluateOperators.evaluateOperator("8758115277303",87);
//        for(String s:res){
//            System.out.println(s);
//        }



        //---------------N queen first with comments
//        String[][] res = Nqueen.find_all_arrangements(4);
//
//       for(int i=0;i<res.length;i++){
//           for(int j=0;j<res[i].length;j++){
//               System.out.println(res[i][j]);
//           }
//           System.out.println();
//           System.out.println();
//       }

        //List<List<Integer>> res = Nqueen.find_all_arrangements(4);
        //------------

        //---- test of matrix
        // testofMatrix.print(new int[][]{{1,2,3},{4,5,6}});

        //                       5
        //                     3   6
        //                   2    1  4


        TreeNode1 treeNode1 = new TreeNode1(5);

        treeNode1.left = new TreeNode1(3);
        treeNode1.right = new TreeNode1(6);

        treeNode1.left.left = new TreeNode1(2);

        treeNode1.right.left = new TreeNode1(1);
        treeNode1.right.right = new TreeNode1(4);

        //----------------invert tree----
//        InvertTrees invertTrees = new InvertTrees();
//        InOrderTranversal inOrderTranversal= new InOrderTranversal();
//        TreeNode1 treeNode11 = invertTrees.invertTree(treeNode1);
//        inOrderTranversal.print(treeNode1);
        // ------------------------

        //--------------isBalancedBST---------------
//        isBSTBalancedLeetCodeOptimal isBSTBalanced = new isBSTBalancedLeetCodeOptimal();
//        System.out.println(isBSTBalanced.isBalanced(treeNode1));

//        isBSTBalancedJugad isBSTBalancedJugad = new isBSTBalancedJugad();
//        System.out.println(isBSTBalancedJugad.isBalanced(treeNode1));

        //-------------------------------

        //------------is BST-------------------

        //TreeNode1 treeNode3 = new TreeNode1(2147483647);

        //                       5
        //                     1   7
        //                        3  9


        TreeNode1 treeNode2 = new TreeNode1(5);

        treeNode2.left = new TreeNode1(1);
        treeNode2.right = new TreeNode1(7);

        treeNode2.right.left = new TreeNode1(3);
        treeNode2.right.right = new TreeNode1(9);

//        isBinarySearchTree isBinarySearchTree = new isBinarySearchTree();
//        System.out.println(isBinarySearchTree.isValidBST(treeNode2));

        //-----------------------


        //---------------PostOrder Without Recursion-------------


        //todo: preorder need to implement
//        System.out.println("Postorder");
//
//        PostOrderTraversal postOrderTraversal=new PostOrderTraversal();
//        for(int i:postOrderTraversal.postOrderTraversal(treeNode1))
//            System.out.print(i+" ");
//
//        System.out.println();
//        System.out.println("InOrder");
//
//        InOrderTranversal inOrderTranversal=new InOrderTranversal();
//        for(int i:inOrderTranversal.inorderTranversal(treeNode1))
//            System.out.print(i+" ");

        //-----------------------------


        //---------printAllPaths of tree-------------
//
//        TreeNode1 treeNode2 = new TreeNode1(1);
//
//        treeNode2.left = new TreeNode1(2);
//        treeNode2.right = new TreeNode1(4);
//        treeNode2.left.right = new TreeNode1(3);
//
////        treeNode1.right.left = new TreeNode1(1);
////        treeNode1.right.right = new TreeNode1(4);
//        PrintAllPathsOfTree printAllPathsOfTree = new PrintAllPathsOfTree();
//        printAllPathsOfTree.printAllPath(treeNode2);


        // ---------mergeTwoBST--------------

//        TreeNode1 treeNode3 = new TreeNode1(5);
//
//        treeNode3.left = new TreeNode1(3);
//        treeNode3.right = new TreeNode1(7);
//
//        treeNode3.left.left = new TreeNode1(2);
//
//        treeNode3.right.left = new TreeNode1(6);
//        treeNode3.right.right = new TreeNode1(8);
        //-------------------------------------------continue
//        TreeNode1 treeNode2 = new TreeNode1(10);
//
//        treeNode2.left = new TreeNode1(9);
//        treeNode2.right = new TreeNode1(11);
//
//        TreeNode1 result =MergeTwoBSTs.mergeTwoBSTs(treeNode3,treeNode2);

        //---------------------------------------BinaryTree to Circular LL


//        BLToLL blToLL = new BLToLL();
//        blToLL.BTtoLL(treeNode1);

        //---------------------------------------sumtoLeaf BinayToDecimal---------


//        TreeNode1 treeNode2 = new TreeNode1(1);
//
//        treeNode2.left = new TreeNode1(0);
//        treeNode2.right = new TreeNode1(0);
//
//        treeNode2.left.left = new TreeNode1(1);
//
//        treeNode2.right.left = new TreeNode1(1);
//        treeNode2.right.right = new TreeNode1(1);
//
//    SumRootToLeaf sumRootToLeaf = new SumRootToLeaf();
//    sumRootToLeaf.sumRootToLeaf(treeNode2);


        //----------------------------HasPath for sum in tree
//
//        TreeNode1 treeNode5 = new TreeNode1(1000);
//
//        treeNode5.left = new TreeNode1(200);
//
//        HasPathSum hasPathSum = new HasPathSum();
//        System.out.println(hasPathSum.hasPathSum(treeNode5,1000));


//        -------_SubsetWIthDup-2----------todo:: Need to look everytime

//        SubsetWithDups subSet2 = new SubsetWithDups();
//        List<List<Integer>> list= subSet2.subsetsWithDup(new int[]{1, 2, 2});
//        for (List<Integer> list1 : list) {
//            for (int i : list1) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        -----------------------------leetcode 563

//        TreeNode1 treeNode2 = new TreeNode1(379);
//
//        treeNode2.left = new TreeNode1(826);
//
//        IncreasingOrderSearchTree increasingOrderSearchTree= new IncreasingOrderSearchTree();
//
//        increasingOrderSearchTree.increasingBST(treeNode2);

///        -------------------------Width of Binary Tree

//        TreeNode1 treeNode2 = new TreeNode1(5);
//
//        treeNode2.left = new TreeNode1(3);
//        treeNode2.right = new TreeNode1(6);
//
//        WidthOfBinaryTreeTodoApne widthOfBinaryTreeTodoApne= new WidthOfBinaryTreeTodoApne();
//        widthOfBinaryTreeTodoApne.widthOfBinaryTree(treeNode2);

///        --------------------------

///     ------------------------Graphs------------

///        -----Alien Dictonary-----

        ///       System.out.println(createGraph.find_order(new String[]{"baa", "abcd", "abca", "cab", "cad"}));

///      -----Course 1-----

//       System.out.println(CourseSchedule.course_schedule(4, Arrays.asList(Arrays.asList(1, 0), Arrays.asList(2, 0), Arrays.asList(3, 1),
//                                                                          Arrays.asList(3,2))));

        //System.out.println(CourseSchedule.course_schedule(2,Arrays.asList(Arrays.asList(1,0),Arrays.asList(0,1))));


        //       ----KnightReach ---

        //KnightReachOrNot.find_minimum_number_of_moves(2,7,0,5,0,1);

        //      --------------

        //       ----ZombieCluster-----

//        System.out.println(ZombieCluster.zombieCluster(Arrays.asList("110000",
//                                                                     "110000",
//                                                                     "001100",
//                                                                     "001100",
//                                                                     "000011",
//                                                                     "000011")));

        //System.out.println(ColorHouses256.costNHouses(new int[][]{{1,2,3},{4,5,6},{7,9,8},{13,10,11},{8,1,3}}));

        //------------findSingleValueTrees-----

//        TreeNode1 treeNode2 = new TreeNode1(5);
//
//        treeNode2.left = new TreeNode1(5);
//        treeNode2.right = new TreeNode1(5);
//
//        treeNode2.left.left = new TreeNode1(5);
//
//        treeNode2.right.left = new TreeNode1(5);
//        treeNode2.right.right = new TreeNode1(5);
//
//        System.out.println(FindSingleValueTrees.findSingleValueTrees(treeNode2));


        //--------------------Reorder Log files LC-937

//        String[] res = ReorderLogFiles.reorderLogFiles(Arrays.asList("dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero").toArray(new String[5]));
//
//        for(String s:res){
//            System.out.println(s);
//        }

        //------------Edit Disatnce
//        System.out.println(LevenSheithDistance.levenshteinDistance("azcef","abcdef"));

        //---Number of ways to climb---
        //System.out.println(NumberofWaysToClimb.countWaysToClimb(new int[]{2,3},7));

        //---------------

        //-----------CoinPlay-------//

        //System.out.println(CoinPlay.game(new int[]{8,15,13,7}));

        //-------TwoCity schedule cost--//
        //TwoCitySchedule.twoCitySchedCost(new int[][]{{10,20},{30,200},{400,50},{30,20}});

        // TwoCitySchedule.twoCitySchedCost(new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}});

        //-----StringTransformationUsingGivenWords----// Todo: Graph Must to do ---contains BFS,formaing graph

        //       String[] arr = StringTransformationUsingGivenWords.string_transformation(new String[]{"cat", "hat", "bad", "had"}, "bat", "had");
//        String[] arr = StringTransformationUsingGivenWords.string_transformation(new String[]{}, "zzzzzz", "zzzzzz");
//        for(String s:arr){
//            System.out.print(s+" ");
//        }
//
        // same as StringTransformationUsingGivenWords
//        WordLadderII wordLadderII = new WordLadderII();
//        List<List<String>> arr = wordLadderII.findLadders("bat", "had", Arrays.asList("cat", "hat", "bad", "had"));
//        for(List<String> li:arr){
//            for(String s: li){
//                System.out.print(s+" ");
//            }
//        }

        //------------------

        //------------IB1
        //https://www.geeksforgeeks.org/find-a-pair-with-given-sum-in-bst/
        //Asked to Aditi

        //                         15
        //                     10      20
        //                   8   12  16  25
        //                             17

//        TreeNode1 treeNode2 = new TreeNode1(15);
//
//        treeNode2.left = new TreeNode1(10);
//        treeNode2.left.left = new TreeNode1(8);
//        treeNode2.left.right = new TreeNode1(12);
//
//        treeNode2.right = new TreeNode1(20);
//        treeNode2.right.left= new TreeNode1(16);
//        treeNode2.right.left.right= new TreeNode1(17);
//        treeNode2.right.right= new TreeNode1(25);
//
//        for(int i: TwoSumInTreeWithOlogNspace.t2Sum(treeNode2, 25)){
//            System.out.print(i +" ");
//        }
//
//        TreeNode1 treeNode3 = new TreeNode1(248);
//        treeNode3.right= new TreeNode1(318);
//
//        for(int i: TwoSumInTreeWithOlogNspace.t2Sum(treeNode3, 281)){
//            System.out.print(i +" ");
//        }

//
        //----------------critical connection----

//        CriticalConnection criticalConnection = new CriticalConnection();
//        criticalConnection.criticalConnections(4, Arrays.asList(
//                Arrays.asList(0, 1),
//                Arrays.asList(1, 2),
//                Arrays.asList(2, 0),
//                Arrays.asList(1, 3)));

        //--------------------populateSiblingPointers----

         //TODO: simple levell order tranversal , pls do

        //---------------------


        //LeetCode -658 Need to do
//        for(int i:KClosestElement.findClosestElements(Arrays.asList(1,2,4,5,6),2,-10)){
//            System.out.print(i+" ");
//        }

//        List<List<Integer>> res= NearestNeighbour.nearest_neighbours(-3,
//                                                                     -3, 4, Arrays.asList(Arrays.asList(-8,-3),
//                                                                        Arrays.asList(-1,-6),
//                                                                Arrays.asList(-8,-7),
//                                                                Arrays.asList(-7,-9),
//                                                                Arrays.asList(-1,-9)));

//        List<List<Integer>> res= NearestNeighbour.nearest_neighbours(1,
//                                                                     1, 1, Arrays.asList(Arrays.asList(0,0),
//                                                                                          Arrays.asList(1,0)));
//
//        for(List<Integer> list:res){
//            System.out.print(list.get(0)+" "+list.get(1));
//            System.out.println();
//        }


        //------Amazon- KSmallestElement

        //TreeNode1 treeNode3 = new TreeNode1(2147483647);

        //                       5
        //                     1   7
        //                        6  9


//        TreeNode1 treeNode4 = new TreeNode1(5);
//
//        treeNode4.left = new TreeNode1(1);
//        treeNode4.right = new TreeNode1(7);
//
//        treeNode4.right.left = new TreeNode1(6);
//        treeNode4.right.right = new TreeNode1(9);

//        TreeNode1 treeNode4 = new TreeNode1(1);
//        treeNode4.right = new TreeNode1(9);
//
//        treeNode4.right.left = new TreeNode1(4);
//        treeNode4.right.left.left = new TreeNode1(3);
//        treeNode4.right.left.left.left = new TreeNode1(2);
//
//        treeNode4.right.left.right = new TreeNode1(6);
//        treeNode4.right.left.right.left= new TreeNode1(5);
//        treeNode4.right.left.right.right= new TreeNode1(8);
//        treeNode4.right.left.right.right.left=new TreeNode1(7);
//
//
//        System.out.println(KSmallestElementInTree.kthsmallest(treeNode4,7));

        //---------

        //--MinDepth of tree---todo : Need to see it every time once

        //System.out.println(MinDepth.minDepth(treeNode2));

        //-----------Combination with value allowed multiple times

//        for(ArrayList<Integer> i: combinationSumWithManyTimesAllow.combinationSum(new int[]{2,3,6,7}, 7)){
//            for(int j:i){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // IBit //Heaps And Maps N Max Pair Combinations-todo : Need to see it every time once// It is not like creating two heaps, take sum and taking minimum //put sum in heap and not the actual array values
//        ArrayList<Integer> al = NMaxPairCombination.solve(Arrays.asList(3,2,4,2),
//                                                             Arrays.asList(4,3,1,2));
//        for(int i:al){
//            System.out.print(i+" ");
//        }

        //----Power --todo: update it and ask IKWEB for help
        //System.out.println(Power.calculate_power(10000000,10000000));

        //System.out.println(MaximumMedian.solve(Arrays.asList(1,1,1,1,2),"3"));

        //------------Permutation----todo : Need to see it every time once// Remember we already swaped so need to insert i everytime and not index in the loop

//        for(ArrayList<Integer> i: PermutationWithDuplicate.permute(Arrays.asList(1, 2, 2))){
//            for(int j:i){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //-----------------DiameterOfTree--todo : Need to see it every time once//
           //System.out.println(DiameterOfBinaryTree.diameterOfBinaryTree(treeNode1));

        //----IK recursion set 2 // find all combination

//        for(String s:FindAllPossibilities.find_all_possibilities("??")){
//            System.out.println(s);
//        }
      //--- Queens attacks the king ---todo: do n queens, it's not first what you thought, validate needs to happen after you add and should be the first thing in function

//        for(List<Integer> al: QueenAttackKings.queensAttacktheKing(new int[][]{{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}},new int[]{0,0})){
//            for(int i:al){
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //InfixtoPrefix---evaluateion

       //System.out.println(InfixToPrefix.infixToPostfix("1+2+3"));
       // System.out.println(InfixToPrefix.infixToPostfix("(")); Not in code for now, expression is not valid

//--------------------
        //IKWeb 1st interview --- bad performance leetcode 93 todo:: must to atleast once for recurssion //best for recursion
        RestoreIPAddress restoreIPAddress = new RestoreIPAddress();
//        for(String i:restoreIPAddress.restoreIpAddresses("0000")){
//            System.out.println(i);
//        }
//        for(String i:restoreIPAddress.restoreIpAddresses("010010")){
//            System.out.println(i);
//        }

        //-------Continuous sum array---Math logic-------
        //System.out.println(ContiguousSubArraySum.checkSubarraySum(new int[]{23,2,4,6,7},6));

       // -- Closest Three sum
        // System.out.println(ThreeSumClosest.threeSumClosest(Arrays.asList(-4,-1,1,2),1));

        // LongestPalindrome todo: String see everytime once
         //System.out.println(LongestPalindrome.longestPalindrome("badabb"));

//        ArrayList<String> al = new ArrayList<>();
//        al.add("geeksforgeeks");
//        al.add("geeks");
//        al.add("gee");
////        al.add("le");
////        al.add("code");
//        //System.out.println(LongestCommonPrefix.longestCommonPrefix(al));// Working but with array
//        System.out.println(LongestCommonPrefixUsingTrieWithHashMap.longestCommonPrefix(al));

        //-----------------


        //Mice And Holes  ---todo: ask on IKWEB //logic still don't able to understand

        //System.out.println(MiceAndHoles.mice(Arrays.asList(4,-4,2),Arrays.asList(4,0,5)));

          //System.out.println(MiceAndHoles.mice(Arrays.asList(-49, 58, 72, -78, 9, 65, -42, -3),Arrays.asList(30, -13, -70, 58, -34, 79, -36, 27)));

        //-------------------JoinWordsToMakeIt a palindrome

         //If leftover string which we want to check isPalindrome or not is on the right , it will definately resolved by CASE-1) left  -- car,racaa(left 2nd for || racaa,car(left 1st for)
        //If leftover string which we want to check isPalindrome or not is on the left , it will definately resolved by CASE-2) right  -- car,aarac(right 2nd for) || aarac,car(right 1st for)
//          for(String s:JoinWordsToMakePalindrome.join_words_to_make_a_palindrome(new String[]{"car","racaa"})){
//              System.out.print(s+" ");
//          }

        //--------------LongestRepeatedSubstr //todo: Baki che
        //System.out.println(LongestRepeatedSubString.getLongestRepeatedSubstring("anan"));


//        KMP kmp = new KMP();
//        //kmp.KMP(new char[]{'a','b','x','a','b','c','a','b','c','a','b','y'},new char[]{'a','b','c','a','b','y'});
//        kmp.KMP(new char[]{'a','b','y'},new char[]{'a','b','c','a','b','y'});

        //-------------
         //KMP Indices---//todo: Pls look at once every alternate day,, it is a nice algo, it'll not be asked but need to know and remeber it this time.
//        for(int i : KMPFindIndices.KMP("busOurbus", "bus")){
//            System.out.print(i+" ");
//        }
//
//        for(int i :KMPFindIndices.KMP("cccc","cc")){
//            System.out.print(i+" ");
//        }

//        for(int i :KMPFindIndices.KMP("MMMNGMMNG123MMMNG1234","MMNG")){
//            System.out.print(i+" ");
//        }


        //Height Of Binary Tree ------------todo:: every time I am off by 1;

//        TreeNode1 treeNode11 = new TreeNode1(5);
//        treeNode11.left = new TreeNode1(6);
//
//        System.out.println(HeightOfBinaryTree.height(treeNode11));


        //LRU Cache --- todo: every time need to look // /don't do this mistake of taking Queue as a seperate variable, rather add it as part of value , also in remove and add don't forget to update the hashmap

//       LRUCache lruCache= new LRUCache(2);  // simple case where every key is different
//        lruCache.put(1,1);
//        lruCache.put(2,2);
//        System.out.println(lruCache.get(1));
//        lruCache.put(3,3);
//        System.out.println(lruCache.get(2));
//        lruCache.put(4,4);
//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(3));
//        System.out.println(lruCache.get(4));


//                ["LRUCache","get","put","get","put","put","get","get"]
//                [[2],[2],[2,6],[1],[1,5],[1,2],[1],[2]] // same key value gets added with dofferent value
        //LRUCache lruCache= new LRUCache(2);
//        System.out.println(lruCache.get(2));
//        lruCache.put(2,6);
//        System.out.println(lruCache.get(1));
//        lruCache.put(1,5);
//        lruCache.put(1,2);
//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(2));
//
        //-------------Generate Decomposition Of Substrings  todo: best for recursion concept
//        String[] res= GeneratePalindromicDecomposition.generate_palindromic_decompositions("aaa");
//        for(String s:res){
//            System.out.println(s);
//        }
        //------------


        // MinimumHeightTrees -- Leetcode 310 //todo: Solid problem logic wise // Using BFS //TC - O(V+E)
//        MinimumHeightTrees minimumHeightTrees = new MinimumHeightTrees();
//        for(int i:minimumHeightTrees.findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}})){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for(int i:minimumHeightTrees.findMinHeightTrees(6, new int[][]{{0,3},{1,3},{2,3},{4,3},{5,4}})){
//            System.out.print(i+" ");
//        }

        //------------ReiterateItnerary

        //ReiterateItnerary GRAPH -- DFS where HashMap has priority queue as value
 //       ReiterateItnerary reiterateItnerary = new ReiterateItnerary();
//        for(String str:reiterateItnerary.findItinerary(Arrays.asList(Arrays.asList("JFK","SFO"),Arrays.asList("JFK","ATL"),Arrays.asList("SFO","ATL"),Arrays.asList("ATL","JFK"),
//                                                                     Arrays.asList("ATL","SFO")))){
//            System.out.println(str+" ");
//        }
//
//        for(String str:reiterateItnerary.findItinerary(Arrays.asList(Arrays.asList("MUC", "LHR"),Arrays.asList("JFK", "MUC"),Arrays.asList("SFO", "SJC"),Arrays.asList("LHR", "SFO")))){
//            System.out.println(str+" ");
//        }

        //---------RedundantConnection --Todo:// Set ,Union,Find -- Compression and optimization for union is still left in this solution; comparing new point with parent array

        //RedundantConnection -- Set ,Union,Find -- Compression and optimization for union is still left in this solution

//        RedundantConnection redundantConnection = new RedundantConnection();
//        for(int i:redundantConnection.findRedundantConnection(new int[][]{{1,2},{1,3},{2,3}})){
//            System.out.print(i+" ");
//        }

        //---------------

        // Todo://Not leetcode but good to understand(Disjoint set--Undirecgted graoh only to find if there is any cycle...Best for Kruskal's algorihtm(help to find minimum spanning tree)
        //Todo://Tushar roy's implementation  --https://www.youtube.com/watch?v=ID00PMy0-vE
        //Todo: Must for Set ,Union,Find

//        DisjointSet ds = new DisjointSet();
//        ds.makeSet(1);
//        ds.makeSet(2);
//        ds.makeSet(3);
//        ds.makeSet(4);
//        ds.makeSet(5);
//        ds.makeSet(6);
//        ds.makeSet(7);
//
//        System.out.println(ds.union(1, 2));
//        System.out.println(ds.union(2, 3));
//        System.out.println(ds.union(4, 5));
//        System.out.println(ds.union(6, 7));
//        System.out.println(ds.union(5, 6));
//        System.out.println(ds.union(4, 7)); //cycle
//        System.out.println(ds.union(3, 7));
//        System.out.println(ds.union(1,7)); //cycle


        //-------- Network singal letancy tor each all nodes
        //Todo: It is not just DFS and visited Node, need to see consider every neighbour fr evey nod

        //NetworkDelayTime  -- LeetCode 743  --- It is not just DFS and visited Node, need to see consider every neighbour fr evey nod

//        NetworkDelayTime networkDelayTime = new NetworkDelayTime();
////        System.out.println(networkDelayTime.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}},4,2));
//
//        System.out.println(networkDelayTime.networkDelayTime(new int[][]{{1,2,1},{2,3,2},{1,3,2}},3,1));

        //-----------Key and doors --use stack to store all the keys and have array also to keep check fast if we have already reached door or not . no need to pop all the keys and try . That's why we have taken array of canReach
//        CanVisitAllRooms canVisitAllRooms = new CanVisitAllRooms();
//        System.out.println(canVisitAllRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1,3),Arrays.asList(3,0,1),Arrays.asList(2),Arrays.asList(0))));
//        System.out.println(canVisitAllRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1),Arrays.asList(2),Arrays.asList(3),Arrays.asList())));


        //SatisfiabilityofEqualityEquations -- LeetCode 990

//        SatisfiabilityofEqualityEquations satisfiabilityofEqualityEquations = new SatisfiabilityofEqualityEquations();
//        System.out.println(satisfiabilityofEqualityEquations.equationsPossible(new String[]{"a==b","b==c","c==a"}));
//        System.out.println(satisfiabilityofEqualityEquations.equationsPossible(new String[]{"a==b","b==c","c!=a"}));

        //-----------------Validate Parentheses ------

//        System.out.println(FindMaxLengthOfMatchingParentheses.find_max_length_of_matching_parentheses(")()())"));
//           //System.out.println(FindMaxLengthOfMatchingParentheses.find_max_length_of_matching_parentheses_optimal_without_stack(")()())"));
//        System.out.println(FindMaxLengthOfMatchingParentheses.find_max_length_of_matching_parentheses_optimal_without_stack("()((())"));

        //------------MaximumValueInSlindingWindow

//        for(int i:MaximumInSlidingWindow.max_in_sliding_windowwithPriorityQueue(new int[]{1, 3, -1, -3, 5, 3, 6, 7},3)){
//            System.out.println(i);
//        }
//        System.out.println();
//        for(int i:MaximumInSlidingWindow.max_in_sliding_windowwithDequeue(new int[]{1, 3, -1, -3, 5, 3, 6, 7},3)){
//            System.out.println(i);
//        }
////        System.out.println();
//        for(int i:MaximumInSlidingWindow.max_in_sliding_windowwithDequeue(new int[]{6,-6,0},2)){
//            System.out.println(i);
//        }
//        System.out.println();
//        for(int i:MaximumInSlidingWindow.max_in_sliding_windowwithPriorityQueue(new int[]{6,-6,0},2)){
//            System.out.println(i);
//        }

        //----------Regular Expression Matching TODO: Recurssion way need to do

//        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
//        System.out.println(regularExpressionMatching.isMatchDP("xaabyc","xa*b.c"));
//        System.out.println(regularExpressionMatching.isMatchRecursion("xaabyc","xa*b.c"));
//
//        System.out.println(regularExpressionMatching.isMatchDP("","a*b*"));
//        System.out.println(regularExpressionMatching.isMatchRecursion("","a*b*"));


        //-------------Jump GameIII--------------- TODO: Must do for recurssion

//        JumpGameIII jumpGameIII = new JumpGameIII();
//        System.out.println(jumpGameIII.canReach(new int[]{4,2,3,0,3,1,2},5));

        //-----Min Window Substring---- Todo:  must to for string// please look at both minWindow + minWindowWithSuperLogic

//         System.out.println(MinWindowSubString.minWindow("ADOBECODEBANC","ABC"));
//
//        System.out.println(MinWindowSubString.minWindow("ABAACBAB","ABC"));
//
//        System.out.println(MinWindowSubString.minWindow("aa","aa"));
//
//        System.out.println(MinWindowSubString.minWindow("a","aa"));
//
//        System.out.println(MinWindowSubString.minWindow("acbbaca","aba"));
//
//        System.out.println(MinWindowSubString.minWindow("cabwefgewcwaefgcf","cae"));
//
//        System.out.println(MinWindowSubString.minWindow("aaaaaaaaaaaabbbbbcdd",
//                                                        "abcdd"));

        //---------------MinMovesWithout3ConsecutiveLetters --Microsoft----//

//        MinMovesWithout3ConsecutiveLetters minMovesWithout3ConsecutiveLetters = new MinMovesWithout3ConsecutiveLetters();
//        System.out.println(minMovesWithout3ConsecutiveLetters.solution("aaa"));
//        System.out.println(minMovesWithout3ConsecutiveLetters.solution("aaaa"));
//        System.out.println(minMovesWithout3ConsecutiveLetters.solution("aaaaa"));
//        System.out.println(minMovesWithout3ConsecutiveLetters.solution("aaaaaa"));
//        System.out.println(minMovesWithout3ConsecutiveLetters.solution("baaaaaaaaaab"));
//        System.out.println(minMovesWithout3ConsecutiveLetters.solution("baaaaaab"));
//        System.out.println(minMovesWithout3ConsecutiveLetters.solution("aacccaaabbbcccccccc"));


        //-----------StringwithNo3IdenticalConsecutiveLetters --MicroSoft----//

//        String s1 = "eedaaad";
//        String s2 = "xxxtxxx";
//        String s3 = "uuuuxaaaaxuuud";
//        StringwithNo3IdenticalConsecutiveLetters stringwithNo3IdenticalConsecutiveLetters = new StringwithNo3IdenticalConsecutiveLetters();
//        System.out.println(stringwithNo3IdenticalConsecutiveLetters.solution(s1));
//        System.out.println(stringwithNo3IdenticalConsecutiveLetters.solution(s2));
//        System.out.println(stringwithNo3IdenticalConsecutiveLetters.solution(s3));


        //---------------LongestSemiAlternatingSubString------Microsoft----//

//        LongestSemiAlternatingSubString longestSemiAlternatingSubString = new LongestSemiAlternatingSubString();
//        System.out.println(longestSemiAlternatingSubString.solution("baaabbabbb"));
//        System.out.println(longestSemiAlternatingSubString. solutionString("baaabbabbb"));


        //--------------FindMaximumLengthSequence------Microsoft//

//        FindMaximumLengthSequence findMaximumLengthSequence= new FindMaximumLengthSequence();
//
//        System.out.println(findMaximumLengthSequence.find_max_length_sort(new int[]{5,2,99,3,4,1,100}));
//
//        System.out.println(findMaximumLengthSequence.find_max_length_optimize(new int[]{5,2,99,3,4,1,100}));


        //---------DutchSortLinkedList--------------//

//        DutchSortLinkedList dutchSortLinkedList = new DutchSortLinkedList();
//
//        LinkedListNode linkedListNode= new LinkedListNode(5);
//        linkedListNode.next = new LinkedListNode(1);
//        linkedListNode.next.next= new LinkedListNode(4);
//        linkedListNode.next.next.next = new LinkedListNode(2);
//        linkedListNode.next.next.next.next = new LinkedListNode(3);
//
//        LinkedListNode result = dutchSortLinkedList.dutchSort(linkedListNode,3);
//
//        while(result!=null){
//            System.out.print(result.value+" ");
//            result = result.next;
//        }

        //-----------------SlidingPuzzle--------------//

       // SlindingPuzzle slindingPuzzle = new SlindingPuzzle();
      //  System.out.println(slindingPuzzle.slidingPuzzle(new int[][]{{1,0,2},{3,4,5}}));
       // System.out.println(slindingPuzzle.slidingPuzzle(new int[][]{{1,2,5},{3,4,0}}));

        //System.out.println(slindingPuzzle.slidingPuzzle(new int[][]{{1,2,0},{4,5,3}}));
    //   System.out.println(slindingPuzzle.slidingPuzzle(new int[][]{{4,1,2},{5,0,3}}));

       // System.out.println(slindingPuzzle.slidingPuzzle(new int[][]{{2,7,1},{6,3,5},{0,4,8}}));
       // System.out.println(slindingPuzzle.slidingPuzzle(new int[][]{{8,6,3},{2,7,1},{4,0,5}}));

        //-------------Min Stack Implmentation-----------

//        for(int i: MinStack.min_stack(new int[]{10,5,0,-1,0,-1,0})){
//            System.out.print(i+"  ");
//      }

        //-------------Swap Nodes --LinkedList ---//

//        LinkedListNode linkedListNode = new LinkedListNode(1);
//        linkedListNode.next= new LinkedListNode(2);
//        linkedListNode.next.next= new LinkedListNode(3);
//        linkedListNode.next.next.next= new LinkedListNode(4);
//        linkedListNode.next.next.next.next= new LinkedListNode(7);
//        linkedListNode.next.next.next.next.next= new LinkedListNode(0);
//
//        LinkedListNode result = SwapNodes.swap_nodes(linkedListNode, 6);
//
//        while(result!=null){
//            System.out.println(result.value);
//            result=result.next;
//        }


        //----Rotten Oranges---- // Todo:: Must do for graph// ultimate BFS

//        RottenOranges rottenOranges = new RottenOranges();
//        rottenOranges.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});

       // -- Min Edit Distance
//        EditDistance editDistance = new EditDistance();
//        System.out.println(editDistance.minDistance("BAT","CAT"));
//
//        System.out.println(editDistance.minDistance("HORSE","ROS"));

        //---Min Refuel Stops ---Todo:Ask how to do memoization?

       // MinRefuelStops minRefuelStops =new MinRefuelStops();
//        minRefuelStops.minRefuelStops(100,10,new int[][]{{10,60},{20,30},{30,30},{60,40}});
//        minRefuelStops.minRefuelStopsRecursion(100,10,new int[][]{{10,60},{20,30},{30,30},{60,40}});
//
//       int res= minRefuelStops.minRefuelStopsRecursion(1000,10,new int[][]{
//                {7,217},{10,211},{17,146},{21,232},{25,310},{48,175},{53,23},{63,158},{71,292},{96,85},{100,302},{102,295},{116,110},{122,46},{131,20},{132,19},{141,13},{163,85},{169,263},{179,233},{191,169},{215,163},{224,231},{228,282},{256,115},{259,3},{266,245},{283,331},{299,21},{310,224},{315,188},{328,147},{345,74},{350,49},{379,79},{387,276},{391,92},{405,174},{428,307},{446,205},{448,226},{452,275},{475,325},{492,310},{496,94},{499,313},{500,315},{511,137},{515,180},{519,6},{533,206},{536,262},{553,326},{561,103},{564,115},{582,161},{593,236},{599,216},{611,141},{625,137},{626,231},{628,66},{646,197},{665,103},{668,8},{691,329},{699,246},{703,94},{724,277},{729,75},{735,23},{740,228},{761,73},{770,120},{773,82},{774,297},{780,184},{791,239},{801,85},{805,156},{837,157},{844,259},{849,2},{860,115},{874,311},{877,172},{881,109},{888,321},{894,302},{899,321},{908,76},{916,241},{924,301},{933,56},{960,29},{979,319},{983,325},{988,190},{995,299},{996,97}});
//
//        System.out.println(res);
        //System.out.println(minRefuelStops.minRefuelStopsRecursion(100,50,new int[][]{{25,50},{50,25}}));

        //--Frog Jumpes----Todo: Recursion every time

//        FrogJump frogJump = new FrogJump();
// //       System.out.println(frogJump.canCross(new int[]{0,1,3,5,6,8,12,17}));
//        System.out.println(frogJump.canCross(new int[]{0,1,2,3,4,8,9,11}));

        //---EqualSumSubset -- DP & Recursion --Todo::Must do fo recursion(Left for now but do it -necessary) & DP

          //EqualSumSubSet1.equalSubSetSumPartition(Arrays.asList(1, 5, 7, 2, 4, 1));
//
//        WordBreakIII wordBreakIII = new WordBreakIII();
//        for(String s:wordBreakIII.wordBreak("catsanddog", Arrays.asList("cats","cat","and","sand","dog"))){
//            System.out.println(s);
//        }

         //-----------CombinationSum----------Todo: Recursion combination I,II,III,IIII(4 is left)
        //CombinationSum.combinationSum(new int[]{2,3,6,7},7);
//
//        CombinationSumIV combinationSumIV = new CombinationSumIV();
//        combinationSumIV.combinationSum4(new int[]{1,2,3},4);


        //-----Cycle in Directed Graph-----//

        //System.out.println(HasCycleInDirectedGraph.hasCycle(2,2,Arrays.asList(Arrays.asList(0,1),Arrays.asList(1,0))));

//        System.out.println(HasCycleInDirectedGraph.hasCycle(6,6,Arrays.asList(Arrays.asList(0,1),
//                                                                              Arrays.asList(1,3),
//                                                                              Arrays.asList(2,3),
//                                                                              Arrays.asList(1,2),
//                                                                              Arrays.asList(4,5),
//                                                                              Arrays.asList(5,4))));



        //--------IKWeb 2nd Interview------
//
//        StoreOutlineOfTree storeOutlineOfTree = new StoreOutlineOfTree();
//
//        TreeNode1 root1234 = new TreeNode1(20);
//
//        root1234.left = new TreeNode1(8);
//        root1234.left.right= new TreeNode1(12);
//        root1234.left.right.left= new TreeNode1(10);
//        root1234.left.right.right= new TreeNode1(14);
//
//        root1234.right = new TreeNode1(22);
//        root1234.right.right = new TreeNode1(25);
//
//        storeOutlineOfTree.helper(root1234);



        //---UniquePathIII--------------//

//        UniquePathIII uniquePathIII= new UniquePathIII();
//        System.out.println(uniquePathIII.uniquePathsIII(new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}}));
       // System.out.println(uniquePathIII.uniquePathsIII(new int[][]{{1,0,0,0},{0,0,0,0},{0,0,0,2}}));

        //--UniquePathIIRecursion-----------//

//        UniquePathIIRecursion uniquePathII = new UniquePathIIRecursion();
//        System.out.println(uniquePathII.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));

        //---UniquePathIIDP-----//
//        UniquePathIIDP uniquePathII = new UniquePathIIDP();
//        System.out.println(uniquePathII.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));


          //---Microsoft max number---//
//        MaximumPossibleValue maximumPossibleValue = new MaximumPossibleValue();
//        System.out.println(maximumPossibleValue.MaximumPossibleValue(-999));
//        System.out.println(maximumPossibleValue.MaximumPossibleValue(999));


        //---Microsoft to count how many addtion can we do for a without having three consecutive a's
//        String s1 = "aabab";
//        String s2 = "dog";
//        String s3 = "aa";
//        String s4 = "baaa";
//        String s5 = "aaba";
//        System.out.println(MaxInsertWithout3ConsecutiveAs.maxA(s1));
//        System.out.println(MaxInsertWithout3ConsecutiveAs.maxA(s2));
//        System.out.println(MaxInsertWithout3ConsecutiveAs.maxA(s3));
//        System.out.println(MaxInsertWithout3ConsecutiveAs.maxA(s4));
//        System.out.println(MaxInsertWithout3ConsecutiveAs.maxA(s5));


        //-----find_shortest_distance_from_a_guard----// MultiSource Shortest Path todo: Graph atleast once, remember in BFS whoever reaches first will be added to queue first ,and when we pop we are saying visited of the node to true. So even after queue has same node as it was already visited, that node will not revisit again
//        List<List<Integer>> res =ShortestDistanceFromGuard.find_shortest_distance_from_a_guard(Arrays.asList(
//                Arrays.asList('O','O','O','O','G'),
//                Arrays.asList('O','W','W','O','O'),
//                Arrays.asList('O','O','O','W','O'),
//                Arrays.asList('G','W','W','W','O'),
//                Arrays.asList('O','O','O','O','G')));


//        List<List<Integer>> res =ShortestDistanceFromGuard.find_shortest_distance_from_a_guard(Arrays.asList(
//                Arrays.asList('O','G','O'),
//                Arrays.asList('O','O','O'),
//                Arrays.asList('G','O','O')));

//        for(List<Integer> list:res){
//            for(int i:list){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


        //------------CountBasins-----//todo: Graph atleast once, find/union + graph take minvalue

//        List<Integer> resCountBasins =CountBasins.find_basins(Arrays.asList(
//                Arrays.asList(0,2,1,3),
//                Arrays.asList(2,1,0,4),
//                Arrays.asList(3,3,3,3),
//                Arrays.asList(5,5,2,1)));
//
//        for(int i:resCountBasins){
//            System.out.print(i+" ");
//        }

       //-------------------------------
    }

}
