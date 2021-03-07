package FindNearestPoint;

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int min = 100000;
        int count = 0;
        for(int i = 0 ;i  < points.length ;i++){

            int a = points[i][0];
            int b = points[i][1];

            if(x == a || y == b){

                int diff = Math.abs(x-a) + Math.abs(y-b);

                if(diff < min){
                    count = i;
                    min = diff;
                }


            }
        }

        return min == 100000 ? -1 : count;
    }
}
