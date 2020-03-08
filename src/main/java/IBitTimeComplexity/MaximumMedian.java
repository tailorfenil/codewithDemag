package IBitTimeComplexity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumMedian {

    public static String solve(List<Integer> A, String B) {
        Collections.sort(A);
        Long n = Long.valueOf(B);
        List<Long> nums = new ArrayList<>();
        for(int i=A.size()/2; i<A.size(); i++) {
            nums.add(Long.valueOf(A.get(i)));
        }
        // System.out.println(nums);
        long l = nums.get(0);
        long r = l+n;

        while(l<r) {
            // System.out.println("l: "+l+" r: "+r);
            long m = (r-l)/2+l+1;
            if(predicate(n, nums, m)) {
                l = m;
            }
            else {
                r = m-1;
            }
        }
        return ""+l;
    }

    private static boolean predicate(long n, List<Long> nums, long med) {
        // System.out.println("med: "+med);
        for(int i=0; i<nums.size(); i++) {
            // System.out.println("nums["+i+"]: "+nums.get(i));
            if(nums.get(i)>=med)
                break;
            if(med-nums.get(i)<=n) {
                n -= med-nums.get(i);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
