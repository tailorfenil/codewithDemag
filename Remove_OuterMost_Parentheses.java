import java.util.ArrayList;
import java.util.Stack;

public class Remove_OuterMost_Parentheses {

    public String removeOuterParentheses(String S) {

        ArrayList<String> al = new ArrayList<String>();

        Stack<Character> stack = new Stack<Character>();

        StringBuilder sb = new StringBuilder();

        for(char ch:S.toCharArray()){
            sb.append(ch);
            if(ch=='(')
                stack.push(ch);
            else{
                if(!(stack.isEmpty())){
                    stack.pop();
                }

                if(stack.isEmpty()){
                    al.add(sb.toString().substring(1,sb.length()-1));
                    sb.setLength(0);
                }
            }

//            sb.append(ch);
        }

        sb.setLength(0);

        for(String s:al){
            sb.append(s);
        }

        return sb.toString();

    }
}
