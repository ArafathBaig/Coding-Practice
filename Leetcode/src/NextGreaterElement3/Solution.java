package NextGreaterElement3;

class Solution {
    public int nextGreaterElement(int n) {

        char s[] = String.valueOf(n).toCharArray();

        int i = s.length-2;

        while(i >= 0 && s[i] >= s[i+1])
            i--;


        if(i == -1)
            return -1;

        int j = s.length-1;

        while(j>i && s[j] <= s[i] )
            j--;

        swap(s,i,j);

        reverse(s,i+1,s.length-1);

        try{
            return Integer.parseInt(String.valueOf(s));
        }catch(NumberFormatException e){
            return -1;
        }
    }

    private void swap(char s[], int i, int j){

        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }

    private void reverse(char s[], int i, int j){

        while(i < j){
            swap(s,i++,j--);
        }
    }
}