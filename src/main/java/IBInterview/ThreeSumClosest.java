package IBInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest {

    public static int threeSumClosest(List<Integer> A, int B) {

        Collections.sort(A);
// Wrong Approach - everytime
//        for(int i=0;i<A.size()-2;i++){
//            int sum= -A.get(i);
//            for(int j=i+1,k=A.size()-1;j<k;){
//                int intSum=sum;
//                sum = sum-(A.get(j)+A.get(k));
//                if(sum>intSum){
//                    return sum;
//                }
//                else if(sum<=B){
//                    k--;
//                }
//                else{
//                    j++;
//                }
//            }
//        }
//        return -1;
//    }

        int closeSum = Integer.MAX_VALUE;

        for (int i = 0; i < A.size() - 2; i++) {

            int j = i + 1;
            int k = A.size() - 1;

            while (j < k) {

                int sum = A.get(i) + A.get(j) + A.get(k);

                if (Math.abs(sum - B) < Math.abs(closeSum - B))
                    closeSum = sum;

                if (sum < B) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closeSum;
    }
}

