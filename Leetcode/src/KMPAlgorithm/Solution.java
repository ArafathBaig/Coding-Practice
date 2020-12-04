package KMPAlgorithm;

class Solution {
    public int strStr(String haystack, String needle) {


        int h = haystack.length();
        int n = needle.length();

        if(n == 0)
            return 0;

        int kmp[] = new int[n];

        int j = 0, i = 1;
        while(i < n){
            char ch = needle.charAt(i);

            while(j != 0 && needle.charAt(j) != ch)
                j = kmp[j-1];

            if(ch == needle.charAt(j)){
                kmp[i] = j+1;
                j++;
            }

            i++;
        }

        j = 0;

        for( i = 0 ; i < h ;i++){
            char ch = haystack.charAt(i);

            while(j != 0 && needle.charAt(j) != ch)
                j = kmp[j-1];

            if(needle.charAt(j) == ch)
                j++;

            if(j == n)
                break;

        }

        return j == n ? i-j+1 : -1;
    }
}