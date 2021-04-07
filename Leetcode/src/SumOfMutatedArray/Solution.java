package SumOfMutatedArray;

class Solution {
    public int findBestValue(int[] arr, int target) {

        int l = 0,  r = 0;

        for(int n : arr)
            r = Math.max(r,n);

        int ans = 0;
        int max = target;
        while(l <= r){

            int mid = (l+r)/2;

            int sum = 0;

            for(int n : arr){

                if(n > mid){
                    sum+= mid;
                }else{
                    sum+= n;
                }
            }

            // System.out.println(l+" "+r);

            if(Math.abs(sum-target) <= max){

                if(max == Math.abs(sum-target)){
                    ans = Math.min(ans,mid);
                }else{
                    ans = mid;
                }
                max = Math.abs(sum-target);
            }

            if(sum > target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return ans;
    }
}