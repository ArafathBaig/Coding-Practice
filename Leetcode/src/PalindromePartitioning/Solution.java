package PalindromePartitioning;

class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();

        recursion(s,0,result,new ArrayList<>());

        return result;

    }

    private void recursion(String s, int ind, List<List<String>> result, List<String> list){

        if(ind >= s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        // System.out.println(ind);
        StringBuilder sb = new StringBuilder();
        for(int i = ind ;i < s.length() ;i++){
            char c = s.charAt(i);
            sb.append(c);

            if(isPalindrome(sb)){
                list.add(sb.toString());
                recursion(s,i+1,result,list);
                list.remove(list.size()-1);
            }

        }

    }

    private boolean isPalindrome(StringBuilder s){

        for(int i = 0, j = s.length()-1; i<j ; i++,j--){

            if(s.charAt(i) != s.charAt(j))
                return false;
        }

        return true;
    }


}
