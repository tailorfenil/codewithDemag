import java.util.ArrayList;

public class Solution1 {

    public int removeDuplicates(ArrayList<Integer> a) {

        for (int i = 0; i < a.size() - 1; i++) {
            int j = i;
            while (j != a.size() - 1 && a.get(j).equals(a.get(j + 1))) {
                a.remove(j);
            }
        }
        return a.size();
    }
}
