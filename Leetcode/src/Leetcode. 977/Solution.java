class Solution {
    public int[] sortedSquares(int[] a) {
        
        int i = 0, j = a.length -1  ;
        int b[] = new int[a.length];
        int count = j;
        
        while(i<=j){
            
            if(Math.abs(a[i]) > Math.abs(a[j])){
                b[count] = a[i]*a[i];
                i++;
            }else{
                b[count] = a[j]*a[j];
                j--;
            }
            
           count--;
        }
        
        return b;
    }
}