package SearchInRotatedArray;

class Solution {
    public int search(int[] a, int target) {

        int l = 0, r = a.length -1;
        int pivot = 0;
        while(l<r){

            int mid = l + (r-l)/2;

            if(a[mid] > a[r]){
                l = mid+1;
            }else if(a[mid] < a[r]){
                r = mid;
            }
        }

        // System.out.println(pivot);ac
        if(a[r] <= target && a[a.length-1] >= target){
            l = r;
            r = a.length -1;
        }else{
            l = 0;
            r = r-1;
        }

        // System.out.println(l+" "+r);

        int ans = -1;
        while(l <= r){


            int mid = l + (r-l)/2;
            // System.out.println(l+ " " + r + " " + mid);
            if(a[mid] > target)
                r = mid-1;
            else if(a[mid]<target)
                l=mid+1;
            else
                return mid;
        }


        return a[l] == target? l : -1;


    }
}