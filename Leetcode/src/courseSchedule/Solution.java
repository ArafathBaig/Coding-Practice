class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        Map<Integer, List<Integer>> graph = constructGraph(pre);

        int[] colors = new int[numCourses];

        boolean res = true;
        for (int i = 0; i < numCourses; i++) {
            boolean val = detectCycle(i, graph, colors);

            if (val == false)
                return false;
        }

        return true;
    }

    private boolean detectCycle(int node, Map<Integer, List<Integer>> map, int colors[]) {

        if (colors[node] == 1)
            return false;

        if (colors[node] == 2 || map.get(node) == null)
            return true;

        colors[node] = 1;
        for (int neighbours : map.get(node)) {
            if (detectCycle(neighbours, map, colors) == false)
                return false;
        }
        colors[node] = 2;

        return true;
    }

    private Map<Integer, List<Integer>> constructGraph(int[][] pre) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < pre.length; i++) {

            int node = pre[i][0];
            int neighbour = pre[i][1];

            if (!map.containsKey(node))
                map.put(node, new ArrayList<>());

            map.get(node).add(neighbour);
        }

        return map;
    }
}