package IKGraphs;


/*
 1) create m*n disJointSets
 2) assign it to 0..n
 3) iterate through matrix and find min in four direction for every cell
 4) findSet for concerned cell and all possible cell through step 3
 5) do union
 6) count number of disjointSet and their count<--result

-->  if we have more than one min, it'll go to minimest

0 2 1 3        0,0,6,6
2 1 0 4        0,6,6,6
3 3 3 3        0,6,6,15
5 5 2 1        0,15,15,15

 */

import java.util.*;

public class CountBasins {

    public static List<Integer> find_basins(List<List<Integer>> matrix){

        int m=matrix.size();
        int n=matrix.get(0).size();

        int[] dr = new int[]{0,0,-1,1};
        int[] dc= new int[]{1,-1,0,0};

        int[] disJointSet = new int[m*n];

        for(int i=0;i<disJointSet.length;i++){
            disJointSet[i]=i;
        }

        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(i).size();j++){

                int min=matrix.get(i).get(j);
                int r=i,c=j;

                for(int k=0;k<dr.length;k++){

                   int dlR=i+dr[k]; // not r+dr[k] as it is being modifed in the loop
                   int dlC =j+dc[k]; // not c+dc[k] as it is being modifed in the loop

                   if(dlR<0 || dlR>=matrix.size() || dlC<0 || dlC>=matrix.get(i).size()){
                       continue;
                   }
                   else {
                       min = Math.min(min,matrix.get(dlR).get(dlC));
                       if(min==matrix.get(dlR).get(dlC)) {
                           r = dlR;
                           c = dlC;
                       }
                   }

                }
                int edge1 = i*matrix.get(i).size()+j;
                int edge2=  r*matrix.get(i).size()+c;

                int vertex1 = findSet(disJointSet,edge1);
                int vertex2 = findSet(disJointSet,edge2);

                if(vertex1!=vertex2){
                    union(vertex1,vertex2,disJointSet);
                }
                System.out.print("i= "+i+" , j= "+j+", value= "+ disJointSet[i*matrix.get(0).size()+j]);
                System.out.println();

            }
        }


        for(int i=0;i<disJointSet.length;i++){
            disJointSet[i]= findSet(disJointSet,i);
        }

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<disJointSet.length;i++){

            if(!hm.containsKey(disJointSet[i])){
                hm.put(disJointSet[i],1);
            }
            else{
                hm.put(disJointSet[i],hm.get(disJointSet[i])+1);
            }
        }

        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            res.add(map.getValue());
        }
        Collections.sort(res);
        return res;
    }

    public static int findSet(int[] disJointSet,int vertex){

        while(disJointSet[vertex]!=vertex){
            vertex=disJointSet[vertex];
        }

        return vertex;
    }


    public static void union(int vertex1,int vertex2,int[] disjointSet){

        disjointSet[vertex1]=vertex2;

    }

    }
