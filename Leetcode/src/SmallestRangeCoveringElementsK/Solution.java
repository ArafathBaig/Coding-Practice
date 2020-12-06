package SmallestRangeCoveringElementsK;

import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Tuple> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        int max = Integer.MIN_VALUE;

        int n= nums.size();
        for(int i = 0; i < n; i++){
            List<Integer> list = nums.get(i);
            minHeap.add(new Tuple(0,i,list.get(0)));
            max = Math.max(list.get(0), max);
        }

        int a[] = new int[2];
        a[0] = 0;
        a[1] = Integer.MAX_VALUE;

        while(!minHeap.isEmpty()){
            Tuple temp = minHeap.poll();

            int min = temp.val;

            if(a[1]-a[0] > max - min){
                a[0] = min;
                a[1] = max;
            }

            int i = temp.i;
            int j = temp.j;

            if(nums.get(j).size()  == i+1)
                break;

            int val = nums.get(j).get(i+1);

            minHeap.add(new Tuple(i+1, j, val));

            if(val > max)
                max = val;


        }

        return a;

    }

    class Tuple{
        int i, val, j;

        public Tuple(int i, int j, int val){
            this.i = i;
            this.j = j;
            this.val = val;
        }
    }
}