package LongestMountainInArray;

class Solution {
    public int longestMountain(int[] arr) {

        if(arr.length <3)
            return 0;

        boolean up = false;
        boolean down = false;

        int count = 1;
        int max = 0;

        for(int i = 1; i < arr.length ;i++){

            if(!up && !down && arr[i]>arr[i-1] ){
                up = true;
                count++;
            }else if(up && !down && arr[i] > arr[i-1]){
                count++;
            }else if(up && arr[i] < arr[i-1]){
                down = true;
                count++;
            }else if(up && down && arr[i] > arr[i-1]){
                count = 2;
                up = true;
                down = false;
            }else{
                count = 1;
                up = false;
                down = false;
            }

            if(count >= 3 && up && down){
                max = Math.max(count,max);
            }

        }

        return max;



    }
}
