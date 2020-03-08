package IKWebRecursion;


import java.util.ArrayList;

public class FindAllPossibilities {

    static ArrayList<String> res = new ArrayList<>();
    static StringBuffer sb = new StringBuffer();
    public static String[] find_all_possibilities(String s) {

        helper(0,new ArrayList<Character>(),s.toCharArray());

        return res.toArray(new String[res.size()]);

    }
    public static void helper(int i, ArrayList<Character> al, char[] input){

        if(i==input.length){
            sb.delete(0, sb.length());
            for(Character ch:al){
                sb.append(ch);
            }
            res.add(sb.toString());
            return;
        }

        if(input[i]=='?'){
            al.add('0');
            helper(i+1,al,input);
            al.remove(al.size()-1);

            al.add('1');
            helper(i+1,al,input);
            al.remove(al.size()-1);
        }
        else{
            al.add(input[i]);
            helper(i+1,al,input);
            al.remove(al.size()-1);
        }

    }
}
