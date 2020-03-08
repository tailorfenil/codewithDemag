package LCGraph;

import java.util.List;
import java.util.Stack;

public class CanVisitAllRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean canReach[] = new boolean[rooms.size()];

        canReach[0]= true;

        Stack<Integer> stack = new Stack(); // Important --where we are storing all the keys
        stack.push(0);

        while(!stack.isEmpty()){

            int key = stack.pop(); // first 0 poped

            for(Integer i: rooms.get(key)){
                if(canReach[i]==false){
                    canReach[i]=true; // need to make it canReach true before adding values to stack ;pohnchi sake pehla importance
                    stack.push(i);
                }
            }

        }

        for(boolean canReachToroom:canReach){
            if(canReachToroom==false){
                return false;
            }
        }
        return true;


    }

}
