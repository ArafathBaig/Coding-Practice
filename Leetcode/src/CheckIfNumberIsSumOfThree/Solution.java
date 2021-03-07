package CheckIfNumberIsSumOfThree;

class Solution {
    public boolean checkPowersOfThree(int n) {

        List<Integer> list = new ArrayList<>();

        int t =1;

        while(n >= t){
            list.add(t);
            t *= 3;
        }

        int a[] = new int[list.size()];

        for(int i = 0 ; i < a.length ;i++){
            a[i] = list.get(i);
            // System.out.println(a[i]);
        }

        return recursion(a,0,n);
    }

    private boolean recursion(int a[] , int i, int n){

        if(n == 0)
            return true;

        if(n < 0 || i >= a.length || (i != 0 && n%3 != 0))
            return false;

        // System.out.println(i + " " + n);
        return recursion(a, i+1, n-a[i]) || recursion(a,i+1,n);
    }
}