package ContainerWithMostWater;

class Solution {
    public int maxArea(int[] a) {

        int max =0, prod = 0;

        int i = 0, j = a.length-1;

        while(i< j){

            prod = Math.min(a[i],a[j]) * (j-i);
            max = Math.max(max, prod);

            if(a[i]<= a[j]){
                i++;
            }else{
                j--;
            }
        }

        return max;
    }
}c