package IKGraphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualSumSubSet {

    public static int firstFind(List<Set<Integer>> dp, int sum, int idx) {

        for (int i=0; i <= idx; i++) {
            if (dp.get(i).contains(sum)) {
                return i;
            }
        }

        return -1;
    }

    public static List<Boolean> equalSubSetSumPartition(List<Integer> s) {
        // Write your code here
        List<Boolean> result = new ArrayList<>();

        int sum = 0;
        for (int i=0; i < s.size(); i++) {
            sum += s.get(i);
        }

        if (sum % 2 == 1) {
            return result;
        }

        List<Set<Integer>> dp = new ArrayList<>();

        dp.add(new HashSet<Integer>());
        dp.get(0).add(s.get(0));

        for (int i=1; i < s.size(); i++) {
            dp.add(new HashSet<Integer>());
            dp.get(i).add(s.get(i));
            for (Integer k : dp.get(i-1)) {
                dp.get(i).add(k);
                dp.get(i).add(k+s.get(i));
            }
        }

        for (int i=0; i < dp.size(); i++) {
            if (dp.get(i).contains(sum/2)) {
                if (sum == 0 && i == dp.size()-1) {
                    return (new ArrayList<>());
                }
                for (int j=0; j <= i; j++) {
                    result.add(false);
                }

                int value = sum/2 - s.get(i);
                int firstIndex = i;
                result.set(firstIndex, true);

                while (value != 0) {
                    firstIndex = firstFind(dp, value, firstIndex);
                    if (firstIndex == -1) {
                        return (new ArrayList<>());
                    }
                    result.set(firstIndex, true);
                    value = value - s.get(firstIndex);
                }

                for (int j=i+1; j < s.size(); j++) {
                    result.add(false);
                }
                return result;
            }
        }

        return result;
    }
}

