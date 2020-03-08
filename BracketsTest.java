package IKWebRecursion;

public class BracketsTest {

    static String[] res;
    static int j=0;

    public static String[] find_all_well_formed_brackets(int n) {

        res= new String[2*n];
        //Take arrayList as res size can be < 2*n

        StringBuilder sb = new StringBuilder();
        helper(sb,0,n,n);

        return res;

    }

    public static void helper(StringBuilder sb,int i, int numofOpenLeft, int numOfCloseLeft){

        if(numofOpenLeft>numOfCloseLeft){
            return;
        }

        if(i==res.length){  //make condition as numofOpenLeft==numofCloseLeft==0
            res[j]=sb.toString();
            j++;
        }

        if(numofOpenLeft>0) {
            sb.append('(');
            helper(sb, i + 1, numofOpenLeft - 1, numOfCloseLeft);
            sb.deleteCharAt(sb.length()-1);
        }
            sb.append(')');
            helper(sb, i + 1, numofOpenLeft, numOfCloseLeft - 1);
            sb.deleteCharAt(sb.length()-1);
    }

}
