import java.util.ArrayList;
import java.util.Collections;

public class SubSet2 {

    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList());
        if ( a == null || a.size() == 0 ) {
            return result;
        }

        Collections.sort(a);
        auxSubsetWithDup(a, 0, new ArrayList<>(), result);
        return result;
    }

    private void auxSubsetWithDup(ArrayList<Integer> nums, int start, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result) {
        for ( int i = start; i < nums.size(); i++ ) {
            if ( i > start && nums.get(i) == nums.get(i-1) ) {
                continue;
            }

            temp.add(nums.get(i));
            result.add(new ArrayList<>(temp));
            auxSubsetWithDup(nums, i+1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
