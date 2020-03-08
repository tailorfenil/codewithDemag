package LCRecursion;

import java.util.HashSet;

public class FrogJump {

    HashSet<Integer> hsStones = new HashSet<>();

    public boolean canCross(int[] stones) {

        hsStones.clear();

        for(int i:stones){
            hsStones.add(i);
        }
        //hs.put(new pair(0,stones[0]));
        return helper(stones,0,stones[0], new HashSet<pair>());

    }

    public boolean helper(int[] stones, int index, int jump,HashSet<pair> hs){

        pair newPair = new pair(index,jump);

        if(index==stones[stones.length-1]){
            return true;
        }

        if(!hs.contains(newPair) && hsStones.contains(index) && jump>=0){

            hs.add(newPair);

            return helper(stones,index+jump-1,jump-1,hs)|| helper(stones,index+jump+1,jump+1,hs) ||
                   helper(stones,index+jump,jump,hs);

        }

        else{
            return false;
        }

    }

    class pair{
        int a;
        int b;
        pair(int p,int q){
            a=p;
            b=q;
        }
        public boolean equals(Object o) {
            if (o instanceof pair) {
                pair p = (pair)o;
                return p.a == a && p.b == b;
            }
            return false;
        }
        public int hashCode() {
            return new Integer(a).hashCode() * 31 + new Integer(b).hashCode();
        }
    }
}
