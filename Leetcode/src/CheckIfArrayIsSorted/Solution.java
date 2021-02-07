package CheckIfArrayIsSorted;

class Solution {
    public boolean check(int[] a) {

        int rot = 0;
        for(int i= 0 ; i < a.length-1 ;i++ ){

            if(a[i] > a[i+1]){
                rot = i+1;
                break;
            }
        }

        int n = a.length;
        int prev = -1;
        for(int i = rot ; i < rot+n ;i++){

            int next = a[i%n];

            if(prev > next)
                return false;

            prev = next;

        }

        return true;

    }
}