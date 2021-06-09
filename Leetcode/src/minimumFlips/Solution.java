class Solution {
    public int minFlips(String s) {

        int k = s.length();
        s += s;
        int flip1 = 0, flip2 = 0;
        StringBuilder pattern1 = new StringBuilder();
        StringBuilder pattern2 = new StringBuilder();
        char p1 = '1', p2 = '0';
        int n = s.length();

        for (int i = 0; i < n; i++) {
            pattern1.append(p1);
            pattern2.append(p2);

            p1 = p1 == '0' ? '1' : '0';
            p2 = p2 == '0' ? '1' : '0';
        }

        int minFlips = k * 2;

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            // System.out.println(flip1 + " " +flip2);

            if (curr != pattern1.charAt(i))
                flip1++;

            if (curr != pattern2.charAt(i))
                flip2++;

            if (i >= k) {

                if (pattern1.charAt(i - k) != s.charAt(i - k))
                    flip1--;

                if (pattern2.charAt(i - k) != s.charAt(i - k))
                    flip2--;
            }

            if (i >= k - 1) {
                minFlips = Math.min(minFlips, Math.min(flip1, flip2));
            }

        }

        return minFlips;
    }
}