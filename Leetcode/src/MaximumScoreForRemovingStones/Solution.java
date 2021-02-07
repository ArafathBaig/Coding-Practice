package MaximumScoreForRemovingStones;

import java.util.PriorityQueue;

class Solution {
    public int maximumScore(int a, int b, int c) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(a);
        queue.add(b);
        queue.add(c);

        int size = 0;
        while(queue.size() > 1){

            a= queue.poll()-1;
            b = queue.size() > 1 ? queue.poll() : 0;
            c = queue.poll() - 1;

            if(a != 0)
                queue.add(a);

            if(b != 0)
                queue.add(b);

            if(c != 0)
                queue.add(c);

            size++;
        }

        return size;
    }
}