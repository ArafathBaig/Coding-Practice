package getMaximum;

class Solution {
    public int maxSum(int[] a, int[] b) {
        int flag = 0;

        int n= a.length, m = b.length;
        int i = 0, j = 0;
        long sumi= 0, sumj = 0, res = 0;

        while(i < n && j < m){

            int ni = a[i];
            int nj = b[j];

            if(nj > ni){
                sumi += a[i++];
            }else if(ni > nj){
                sumj+=b[j++];
            }else{
                flag = 1;
                res += Math.max(sumi+ni, sumj+nj);
                i++;
                j++;
                sumi = 0;
                sumj = 0;
            }
        }

        while(i < n)
            sumi+=a[i++];

        while(j < m)
            sumj+=b[j++];

        res += Math.max(sumi, sumj);

        return (int) (res%1000000007);

    }
}