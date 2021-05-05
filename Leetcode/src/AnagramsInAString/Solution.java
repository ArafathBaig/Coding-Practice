class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : p.toCharArray()) {

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int candidate = map.size();

        int j = 0;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0)
                    candidate--;
            }

            while (candidate == 0) {

                if (i - j + 1 == p.length()) {
                    res.add(j);
                }

                char d = s.charAt(j++);

                if (map.containsKey(d)) {
                    map.put(d, map.get(d) + 1);

                    if (map.get(d) > 0)
                        candidate++;

                }
            }
        }

        return res;

    }
}