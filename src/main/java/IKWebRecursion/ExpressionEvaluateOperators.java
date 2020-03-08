package IKWebRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionEvaluateOperators {


    StringBuilder sb= new StringBuilder();
    String[] res;
    ArrayList<String> targetres= new ArrayList<>();
    String[] operator = new String[]{"+","*"};

    int j=0;

    int stringSize;

    public String[] evaluateOperator(String s,long target){

        double length = s.length();
        int size = (int) Math.pow(operator.length+1,length-1);
        stringSize=size;

        res = new String[size];

        helper(sb,0,s,res);

        return evaluate(res,target).toArray(new String[targetres.size()]);
    }

    public void helper(StringBuilder sb,int i,String s,String[] res){

        if(i==s.length()) {
            res[j]=sb.toString();
            j++;
            return;
        }

            sb.append(s.charAt(i));
            helper(sb,i+1,s,res);
            sb.deleteCharAt(sb.length()-1);

            if(j<stringSize) {
//                sb.append(operator[0] + s.charAt(i));
//                helper(sb, i + 1, s, res);
//                sb.delete(sb.length() - 2, sb.length());
//
//                sb.append(operator[1] + s.charAt(i));
//                helper(sb, i + 1, s, res);
//                sb.delete(sb.length() - 2, sb.length());

                for(int k=0;k<operator.length;k++){
                    sb.append(operator[k] + s.charAt(i));
                    helper(sb, i + 1, s, res);
                    sb.delete(sb.length() - 2, sb.length());
                }
            }

        return;
    }


    public List<String> evaluate(String[] res, long target){

        Stack<Long> stack = new Stack<>();
        Long pop=0L;
        boolean flag=false;
        for(String s:res){
         for(int i=0;i<s.length();i++){
             if(Character.isLetterOrDigit(s.charAt(i))){
                 if(flag==true) {
                     Long multiply = Long.valueOf(String.valueOf(s.charAt(i)))*pop;
                     stack.push(multiply);
                 }
                 else{
                     if(i!=0 && Character.isLetterOrDigit(s.charAt(i-1)))
                        stack.push(((stack.pop())*10)+ s.charAt(i)-48);
                     else
                         stack.push(s.charAt(i)-48L);
                 }
                 flag=false;
                 pop=0L;
             }
             else{
                 if(s.charAt(i)=='*'){
                     pop = stack.pop();
                     flag=true;
                 }
             }
         }
         long result=0;
         while(!stack.isEmpty()){
             result+=stack.pop();

         }
         if(result==target){
             targetres.add(s);
         }

        }
        return targetres;

    }


}
