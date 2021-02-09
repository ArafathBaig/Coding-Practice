package RemoveInvalid;

import java.util.Stack;

class Solution {
    int max = 0;
    public List<String> removeInvalidParentheses(String s) {

        Set<String> list = new HashSet<>();
        recursion(s, 0, list,"");

        return new ArrayList<>(list);
    }

    private void recursion(String s, int ind, Set<String> list, String ans){

        if(ind >= s.length()){

            if(checkValid(ans)){

                // System.out.println("-------->" + ans);

                if(max < ans.length()){
                    list.clear();
                    max = ans.length();
                }

                if(max == ans.length()){
                    list.add(ans);
                }

            }

            return;
        }

        // System.out.println(ans);
        char c = s.charAt(ind);

        if(c != ')' && c != '('){
            recursion(s, ind+1,list, ans+c);
        }else{
            recursion(s,ind+1, list, ans+c);
            recursion(s,ind+1,list,ans);
        }
    }

    private boolean checkValid(String s){

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ;i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }else if(c == ')'){

                if(stack.isEmpty()){
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}