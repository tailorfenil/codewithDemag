package IKGraphs;

import java.util.List;

public class ZombieCluster {

    public static int zombieCluster(List<String> zombies) {
        // Write your code here

        int counter=0;
        boolean visited[]= new boolean[zombies.size()];

        for(int i=0;i<zombies.size();i++){
            if(!visited[i]){
                counter++;
                //visited[i]=true;
                dfsHelper(zombies,visited,i);
            }
        }

        return counter;

    }

//     1100
//     1110
//     0110
//     0001


    //                                                                     "110000",
    //                                                                     "110000",
    //                                                                     "001100",
    //                                                                     "001100",
    //                                                                     "000011",
    //                                                                     "000011"
    public static void dfsHelper(List<String> zombies,boolean[] visited,int index){

//        if(index>zombies.size()-1)
//            return;

        for(int i=0;i<zombies.get(index).length();i++){
            if(zombies.get(index).charAt(i)=='1' && !(visited[i])){
                visited[i]=true;
                dfsHelper(zombies,visited,i);
            }
        }
    }
}
