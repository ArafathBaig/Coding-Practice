package MaximizeDistance;

class Solution {
    public int maxDistToClosest(int[] seats) {
        int prev = -1;

        for(int i = 0 ; i < seats.length ;i++){

            if(seats[i] == 1){
                prev = i;
                break;
            }
        }

        int max = prev - 0;
        int next = prev+1;
        for(int i = next ;i < seats.length ;i++){

            if(seats[i] == 1){
                max = Math.max(max, (i-prev)/2);
                prev = i;
            }
        }

        max = Math.max(max, seats.length - 1 - prev);

        return max;
    }
}