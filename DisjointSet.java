package LCGraph;

import java.util.HashMap;

//Not leetcode.  Tushar roy's implementation
public class DisjointSet {


    class DisjointSetNode{

        int data;
        DisjointSetNode parent;
        int rank;
    }

    private HashMap<Integer,DisjointSetNode> hm = new HashMap<>();


    public void makeSet(int data){
        DisjointSetNode disjointSetNode = new DisjointSetNode();
        disjointSetNode.data=data;
        disjointSetNode.rank=0;
        disjointSetNode.parent= disjointSetNode;
        hm.put(data,disjointSetNode); // We need to put it in map so that next time we can get the node from data in O(1) time
    }


    //Just for letting user know if two points are in same set, it is a cycle and returns true
    public boolean union(int point1, int point2){

        DisjointSetNode parentPoint1 = findRecursiveWithCompression(point1);
        DisjointSetNode parentPoint2 = findRecursiveWithCompression(point2);

        if(parentPoint1==parentPoint2){
            return true; // cycle as they belong to same set
        }

        else{
            if(parentPoint1.rank>parentPoint2.rank){  // making smaller point to larger one so that tree height can be the same and search is efficient
                parentPoint2.parent=parentPoint1;
            }
            else if(parentPoint1.rank<parentPoint2.rank){
                parentPoint1.parent=parentPoint2;
            }
            else{
                parentPoint1.rank+=1;                 //same that means by adding it we are going down one level more in tree
                parentPoint2.parent=parentPoint1;
            }
            return false;
        }
    }

    public DisjointSetNode findIterative(int data){  // iterative approach and it can take O(rank(root)) operation

        DisjointSetNode disjointSetNode= hm.get(data);

        while(disjointSetNode.parent!=disjointSetNode){
            disjointSetNode=disjointSetNode.parent;
        }
        return disjointSetNode;
    }

    public DisjointSetNode findRecursiveWithCompression(int data){  // can be done in O(1) as every chlid node has only one parent which is top root

        DisjointSetNode disjointSetNode= hm.get(data);

        if(disjointSetNode.parent!=disjointSetNode){
            disjointSetNode.parent=findRecursiveWithCompression(disjointSetNode.parent.data);
            return disjointSetNode.parent;
        }

        return disjointSetNode;

    }

}
