package IKLinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MaximumInSlidingWindow {

    public static int[] max_in_sliding_windowwithPriorityQueue(int[] nums, int k) {

        // O(num*log(k))

        if(nums.length < k || k == 0){
            return nums;
        }

        int[] result = new int[nums.length-k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int left = 0;
        int right = 0;
        int i = 0;
        while(right < nums.length) {
//            if(pq.size() == k){
//                pq.remove(nums[left++]); //remember we are not deleteting the smallest one as it should filt in  given window.
//            }

            pq.offer(nums[right++]);
            if(pq.size() >= k){
                result[i++] = pq.peek();
                pq.remove(nums[left++]);
            }
        }

        return result;
    }

    public static int[] max_in_sliding_windowwithDequeue(int[] nums, int k){

        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){

            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);

            if(i>=k-1){
                while(deque.peekFirst()<i-k+1) {
                    deque.pollFirst();
                }
                ans[i-k+1] = nums[deque.peekFirst()];
            }

        }
      return ans;

    }
}
