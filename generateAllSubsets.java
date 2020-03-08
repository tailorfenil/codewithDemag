package IKWebRecursion;


public class generateAllSubsets {

    static int pos=0;

    public static String[] generate_all_subsets(String s) {

        double length= Math.pow(2,s.length());
        String[] result= new String[(int)length];
        StringBuilder sb= new StringBuilder();
        helper(s,0,sb,result);
        return result;

    }

    static void helper(String s, int i, StringBuilder sb, String[] res){

        if(i==s.length()){
            res[pos]=sb.toString();
            pos++;
            return;
        }

        helper(s,i+1,sb,res);

        sb.append(s.charAt(i));
        helper(s,i+1,sb,res);
        sb.deleteCharAt(sb.length()-1);

    }
}
