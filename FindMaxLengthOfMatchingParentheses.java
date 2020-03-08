package IKLinkedList;

import java.util.Stack;

public class FindMaxLengthOfMatchingParentheses {

    //ex - ((()))
    //   - (((()))
    //   - ()()()
    //   - )()()()
    //   - ))(())(
    public static int find_max_length_of_matching_parentheses(String brackets) {

        Stack<Integer> stack = new Stack<>();

        int open_brackets_so_start_ind = -1;
        int start_ind =0;
        int max_length =0;

        for(int i=0;i<brackets.length();i++){

            if(brackets.charAt(i)=='(') {
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){
                    open_brackets_so_start_ind = i;
                }
                else{
                    stack.pop(); // main here we are not storing value; remember
                    start_ind = stack.isEmpty() ? open_brackets_so_start_ind : stack.peek();
                    max_length = Math.max(max_length,i-start_ind);
                }
            }

        }
        return max_length;
    }


    public static int find_max_length_of_matching_parentheses_optimal_without_stack(String brackets) {

        int left_brack =0;
        int right_brack =0;
        int max_length=0;


        for(int i=0;i<brackets.length();i++){

            if(brackets.charAt(i)=='('){
                left_brack++;
            }
            else{
                right_brack++;
            }

            if(right_brack>left_brack){
                right_brack=left_brack=0;
            }
            else if(right_brack==left_brack) {
                //max_length=right_brack+left_brack; wrong  ()((())
                max_length = Math.max(max_length, 2 * left_brack);
            }

        }

        right_brack=left_brack=0; // don't forget to do ()((())
        for(int i=brackets.length()-1;i>=0;i--){

            if(brackets.charAt(i)==')'){
                right_brack++;
            }
            else{
                left_brack++;
            }

            if(left_brack>right_brack){
                left_brack=right_brack=0;
            }
            else if(right_brack==left_brack){
                max_length = Math.max(max_length, 2*left_brack);
            }
        }
        return max_length;

    }

    }