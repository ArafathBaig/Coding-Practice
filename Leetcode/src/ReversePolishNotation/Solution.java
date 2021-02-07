package ReversePolishNotation;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] t) {

        if(t.length == 0)
            return 0;

        Stack<Integer> stack = new Stack<>();

        for(int i  =0 ;i < t.length ;i++){

            String s = t[i];

            try{

                int n = Integer.parseInt(s);
                stack.push(n);

            }catch(Exception e){

                int a = stack.pop();
                int b = stack.pop();
                char c = s.charAt(0);
                if(c =='+'){
                    b+=a;
                }else if(c=='-'){
                    b-=a;
                }else if(c =='/'){
                    b/=a;
                }else{
                    b*=a;
                }

                stack.push(b);
            }
        }

        return stack.pop();
    }
}