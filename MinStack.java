package IKLinkedList;


import java.util.ArrayList;
import java.util.Stack;

public class MinStack {

    //Remeber here to maintain minimum value at each iteration

    // -1 to pop but no return
    // 0 to add min value in return value
    // >1 push element

    // BruteForce -- o(n^2) -- to take out elements and put it on to another stack every time to find the min value + put it back to original stack

    //o(n) approach -- to store a pair(number,minValue) till now every time we saw value >1
    public static int[] min_stack(int[] operations) {


        Stack<Pair> stack= new Stack<>();

        ArrayList<Pair> res = new ArrayList<>();

        int[] result;

        int minValue = Integer.MAX_VALUE;

        for(int i=0;i<operations.length;i++){

            if(operations[i]>=1){

                //Wrong --RED flag -- should not compare with MIN Value// it can be case where we popped out element from stack but minValue
                // which we calculated before not changed
//                minValue = Math.min(minValue,operations[i]);
//                stack.push(new Pair<Integer,Integer>(operations[i], minValue));


                if(stack.isEmpty()){
                    minValue = operations[i];
                }
                else{
//                    minValue = Math.min(minValue,(Integer)stack.peek().second); //Again NO, we need to compare operations value with top of the stack value
                     minValue = Math.min(operations[i],(Integer)stack.peek().second);

                }
                stack.push(new Pair(operations[i],minValue));

            }

            else if(operations[i]==0){

                if(!stack.isEmpty()){
                    res.add(stack.peek());
                }
                else{
                    res.add(new Pair<Integer,Integer>(-1, -1));
                }

            }

            else {

                if(!stack.isEmpty()){
                    stack.pop();
                }

            }

        }

        result = new int[res.size()];

        for(int i=0;i<res.size();i++){
            //System.out.println(res.get(i).first.toString() + res.get(i).second.toString());
            result[i]=(Integer)res.get(i).second;
        }

        return  result;

    }

        static class Pair<T,R> {
        public T first;
        public R second;

        Pair(T f, R s) {
            first = f;
            second = s;
        }
    }




}
