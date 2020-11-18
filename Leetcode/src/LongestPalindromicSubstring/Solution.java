package LongestPalindromicSubstring;

class Solution {
    public String longestPalindrome(String s) {

        int max = 0;
        int k = 0, r = 0;
        for(int i =0 ; i < s.length() ;i++){

            int o = checkPal(s,i,i)+1;
            int e = checkPal(s,i,i+1);

            if(e!=i+1)
                e++;

            int r1 = (i-o) + i;
            int r2 = (i-e) + i+1;

            if(max < r1-o+1){
                max = r1-o+1;
                k=o;
                r=r1;
            }

            if(max < r2-e+1){
                max = r2-e+1;
                k=e;
                r=r2;
            }

            // System.out.println(s.substring(k,r+1)+" "+max+" "+r1+" "+r2+" "+i);
        }


        return s.substring(k,r+1);

    }

    private int checkPal(String s, int l, int r){

        while(l>= 0 && r < s.length() && s.charAt(l) == s.charAt(r)  ){
            l--;
            r++;
        }

        return l;
    }
}