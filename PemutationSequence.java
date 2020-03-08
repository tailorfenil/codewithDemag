import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PemutationSequence {

    List<List<Integer>> res = new ArrayList<>();

    HashSet<Integer> hs = new HashSet<>();

    public String getPermutation(int n, int k) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        helper(arr, 0, new ArrayList<>());

        for (List<Integer> i : res) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        return String.valueOf(res.get(k - 1));
    }

    public void helper(int[] arr, int i, List<Integer> slate) {

        if (i == arr.length) {
            res.add(new ArrayList<>(slate));
            return;
        }

        if (i == 0) {
            while (hs.contains(arr[i])) {
                i = i + 1;
            }
            if(i<arr.length)
                hs.add(arr[i]);
        }

        for (int pick = i; pick < arr.length; pick++) {
            swap(arr, i, pick);
            slate.add(arr[i]);
            helper(arr, i + 1, slate);
            slate.remove(slate.size() - 1);
            swap(arr, i, pick);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
