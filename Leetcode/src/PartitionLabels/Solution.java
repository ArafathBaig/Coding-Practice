class Solution {
    public List<Integer> partitionLabels(String s) {

        int index[] = new int[26];

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            index[c - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();

        int cur = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);
            cur = Math.max(cur, index[c - 'a']);
            if (cur == i) {
                result.add(cur + 1 - prev);
                prev = cur + 1;
            }

        }

        return result;
    }
}