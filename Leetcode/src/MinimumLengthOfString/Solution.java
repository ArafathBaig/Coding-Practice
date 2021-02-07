package MinimumLengthOfString;

class Solution {
    public int minimumLength(String s) {
        int i = 0, j = s.length() -1;

        while(i<j){

            char c= s.charAt(i);

            if(c == s.charAt(j)){
                // System.out.println(s.charAt(i)+ " "+ c);
                while(i < j && s.charAt(i) == c){
                    i++;
                }

                while(j >= i && s.charAt(j) == c){
                    j--;
                }
            }else{
                break;
            }

            System.out.println(c+" "+i+" "+j);
        }

        return j-i+1 < 0 ? 0 : j-i+1;
    }
}
