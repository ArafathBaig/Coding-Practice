class Solution {
    public List<Integer> lexicalOrder(int n) {

        List<Integer> list = new ArrayList<>();

        dfs(1, n, list);

        return list;
    }

    private void dfs(int curr, int limit, List<Integer> list) {

        if (curr > limit)
            return;

        if (curr == 1)
            curr = 0;

        for (int i = curr; i <= curr + 9; i++) {

            if (i == 0)
                continue;

            if (i > limit)
                return;

            list.add(i);
            dfs(i * 10, limit, list);
        }
    }
}