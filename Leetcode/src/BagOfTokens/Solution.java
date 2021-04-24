class Solution {
    public int bagOfTokensScore(int[] t, int p) {

        int score = 0;

        Arrays.sort(t);
        int max = 0;
        int i = 0, j = t.length - 1;

        while (i <= j) {

            if (t[i] <= p) {
                p -= t[i++];
                score++;
            } else if (score > 0) {
                p += t[j--];
                score--;
            } else {
                return score;
            }
            max = Math.max(max, score);
        }

        return max;
    }
}