package BeautifulArrangement;

class Solution {
    int count = 0;
    public int countArrangement(int N) {

        count = 0;
        boolean[] vis = new boolean[N+1];
        backtrack(1,vis,N+1);

        return count;
    }

    private void backtrack(int cur, boolean[] vis, int n){

        if(cur == n){
            count++;
            return;
        }


        for(int i = 1 ; i< n ;i++){

            if(vis[i] || (i%cur != 0 && cur%i != 0))
                continue;

            // System.out.println(i);
            vis[i] = true;
            backtrack(cur+1, vis, n);
            vis[i] = false;
        }


    }
}