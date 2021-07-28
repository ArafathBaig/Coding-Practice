class Solution {
    public int countPalindromicSubsequence(String s) {

        int startIndex[] = new int[26];
        int endIndex[] = new int[26];

        Arrays.fill(startIndex, -1);
        Arrays.fill(endIndex, -1);

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (startIndex[c] == -1)
                startIndex[c] = i;

            endIndex[c] = i;
        }

        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < startIndex.length; i++) {
            char c = (char) i;
            if (startIndex[i] != endIndex[i] && !set.contains(c)) {
                ans += numOfUniqueCharacters(s, startIndex[i], endIndex[i]);
                set.add(c);
            }
        }

        return ans;

    }

    private int numOfUniqueCharacters(String s, int i, int j) {

        Set<Character> set = new HashSet<>();

        for (int k = i + 1; k < j; k++) {
            set.add(s.charAt(k));
        }

        return set.size();
    }
}