import java.util.ArrayList;
import java.util.List;

public class Subset {

//    static List<List<Integer>> res=new ArrayList();
//    public static List<List<Integer>> subsets(int[] nums) {
//        List<Integer> temp=new ArrayList();
//        dfs(0,nums,temp);
//        return res;
//    }
//    public static void dfs(int deep,int[] nums,List temp){
//        if(deep==nums.length){
//            res.add(temp);
//            return ;
//        }
//        //branch 1
//        temp.add(nums[deep]);
//        dfs(deep+1,nums,new ArrayList(temp));
//        //branch 2
//        temp.remove(temp.size()-1);
//        dfs(deep+1,nums,new ArrayList(temp));
//
//    }

    static List<List<Integer>> res= new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {

        helper(nums,0,new ArrayList<>());
        return res;

    }

    public static void helper(int[] nums,int i,ArrayList<Integer> temp){

        if(i==nums.length){
            res.add(temp);
            return;
        }
            temp.add(nums[i]);
            helper(nums,i+1,new ArrayList(temp));
            temp.remove(temp.size()-1);
            helper(nums,i+1,new ArrayList(temp));

    }
}
