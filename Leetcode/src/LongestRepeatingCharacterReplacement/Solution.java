class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int j = 0;
        int max = 0;
        int maxL = 0;
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);

            max = Math.max(max, map.get(c));

            if (i - j - max + 1 > k) {
                map.put(s.charAt(j), map.get(s.charAt(j++)) - 1);
            }

            maxL = Math.max(maxL, i - j + 1);
        }

        return maxL;
    }
}