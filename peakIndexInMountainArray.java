

public class peakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1]) {
                lo = mi + 1;
                System.out.println("lo is "+lo);
            }
            else {
                hi = mi;
                System.out.println("hi is "+hi);
            }
        }
        System.out.println();
        System.out.println("Retrun "+ lo);
        return lo;
    }
}
