package LCGraph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class SlindingPuzzle {

    HashSet<String> hashset = new HashSet<>();

    Queue<Puzzle> queue = new LinkedList<>();

    public int slidingPuzzle(int[][] board) {

        //1) BFS ( TC can be n!)
        //2) visited of perticular permutation
        //3) generation of given sequence based on where is empty/zero slide
        //4) did we found?
        //5) Took HashSet of string so that we can able to verify if perticular permutation(config) exist or not
        //6) Took array to store config so that it'll easy to swap the values here

        hashset.clear();
        queue.clear();

        /*
        {-2, -3,   3},
        {-5, -10,  1},
        {10,  30, -5}
         */

        int[] config = new int[board.length*board[0].length]; // it's easy to swap values here than if we took string and replace values in it

        int zeroPos=0;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                config[i*board[0].length+j]=board[i][j];

                if(board[i][j]==0){
                    zeroPos=i*board[0].length+j;
                }

                sb.append(i*board[0].length+j);
            }
        }

        String key = generateKey(config);

        Puzzle puzzle = new Puzzle(zeroPos,config,key,0,null);

        queue.offer(puzzle);

        while(!queue.isEmpty()) {

            Puzzle pollVal = queue.poll();

            if(pollVal.key.matches(sb.toString())) { // sb is 0.....n and not LC specified one

                int returnSteps = pollVal.steps;

                while (pollVal != null) {
                    for (int i = 0; i < pollVal.config.length; i++) {
                        System.out.print(pollVal.config[i]);
                        if (i != 0 && pollVal.config.length% 3 == 0 && i%3==2) {
                            System.out.println();
                        }
                        if (i != 0 && pollVal.config.length%2 == 0 && i%2==1) {
                            System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    pollVal=pollVal.parent;
                }

                return returnSteps;
            }

            if(!hashset.contains(pollVal.key)) {

                hashset.add(pollVal.key);

                int pollZeroPosVal = pollVal.zeroPos;

                if(pollZeroPosVal%(board[0].length)==0) {
                    arrangeKeyValue(pollVal,pollZeroPosVal,pollZeroPosVal+1,pollVal.steps+1);

                    if(pollZeroPosVal==(board.length-1)*board[0].length){
                        arrangeKeyValue(pollVal,pollZeroPosVal,pollZeroPosVal-board[0].length,pollVal.steps+1);
                    }
                    else{
                        arrangeKeyValue(pollVal,pollZeroPosVal,pollZeroPosVal+board[0].length,pollVal.steps+1);
                    }

                }

                else if(pollZeroPosVal%(board[0].length)==board[0].length-1){
                    arrangeKeyValue(pollVal,pollZeroPosVal,pollZeroPosVal-1,pollVal.steps+1);

                    if(pollZeroPosVal==(board.length*board[0].length)-1) {
                        arrangeKeyValue(pollVal, pollZeroPosVal, pollZeroPosVal - board[0].length, pollVal.steps + 1);
                    }
                    else{
                        arrangeKeyValue(pollVal, pollZeroPosVal, pollZeroPosVal + board[0].length, pollVal.steps + 1);
                    }


                }

                else{
                    arrangeKeyValue(pollVal,pollZeroPosVal,pollZeroPosVal-1,pollVal.steps+1);
                    arrangeKeyValue(pollVal,pollZeroPosVal,pollZeroPosVal+1,pollVal.steps+1);

                    if(pollZeroPosVal>=0 && pollZeroPosVal<board[0].length) {

                        arrangeKeyValue(pollVal, pollZeroPosVal, pollZeroPosVal + board[0].length, pollVal.steps + 1);
                    }
                    else if(pollZeroPosVal>=(board.length-1)*board[0].length && pollZeroPosVal<=(board.length)*board[0].length-1){
                        arrangeKeyValue(pollVal, pollZeroPosVal, pollZeroPosVal - board[0].length, pollVal.steps + 1);
                    }
                    else{
                        arrangeKeyValue(pollVal, pollZeroPosVal, pollZeroPosVal + board[0].length, pollVal.steps + 1);
                        arrangeKeyValue(pollVal, pollZeroPosVal, pollZeroPosVal - board[0].length, pollVal.steps + 1);
                    }

                }

            }
        }

        return -1;



    }

    private void arrangeKeyValue(Puzzle puzzle, int pollZeroPosVal, int i,int steps) {

        swap(puzzle,pollZeroPosVal,i);
        String s= generateKey(puzzle.config);


//        if(!hashset.contains(s)){
            //hashset.add(s);
            queue.offer(new Puzzle(i, Arrays.copyOf(puzzle.config,puzzle.config.length), s, steps,puzzle));
//        }

        swap(puzzle,pollZeroPosVal,i);

    }

    private void swap(Puzzle puzzle, int pollZeroPosVal, int i) {

        int temp= puzzle.config[pollZeroPosVal];
        puzzle.config[pollZeroPosVal]=puzzle.config[i];
        puzzle.config[i]=temp;

    }

    private String generateKey(int[] config) {

        StringBuilder sb = new StringBuilder();

        for(int i:config){
            sb.append(i);
        }
        return sb.toString();
    }


    class Puzzle{

        int zeroPos;
        int[] config;
        String key;
        int steps;
        Puzzle parent;


        public Puzzle(int zeroPos,int[] config,String key,int steps,Puzzle parent){
            this.zeroPos=zeroPos;
            this.config=config;
            this.key =key;
            this.steps=steps;
            this.parent=parent;
        }

    }
}
