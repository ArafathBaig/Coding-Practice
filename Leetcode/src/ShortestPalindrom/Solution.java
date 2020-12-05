package ShortestPalindrom;

class Solution {
    public String shortestPalindrome(String s) {

        if(s.length() == 0)
            return "";
        StringBuilder sb = new StringBuilder(s);

        StringBuilder temp = new StringBuilder(s);
        temp.append(sb.reverse());

        int a[] = kmp(temp.toString(), 1);

        sb = new StringBuilder();

        if(a[temp.length()-1] > s.length()){
            a = kmp(temp.toString(), s.length());
        }

        for(int i = s.length()-1 ; i >=a[temp.length()-1]  ; i--)
            sb.append(s.charAt(i));

        sb.append(s);

        // System.out.println(Arrays.toString(a));
        return sb.toString();
    }

    private int[] kmp(String temp, int k){

        int a[] = new int[temp.length()];

        int j = 0;

        for(int i= k; i < temp.length() ;i++){
            char c = temp.charAt(i);

            while(j > 0 && temp.charAt(j) != c)
                j = a[j-1];

            if(c == temp.charAt(j)){
                a[i] = j+1;
                j++;
            }

        }

        return a;

    }
}