package ValidParanthesis;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character,Character> map = new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(int i =0; i < s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                char top = !stack.isEmpty() ? stack.pop() : '#';

                if(top != map.get(ch)){
                    return false;
                }
            }else{
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}