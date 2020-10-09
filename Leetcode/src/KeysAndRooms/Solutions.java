package KeysAndRooms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    int count = 0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean vis[] = new boolean[rooms.size()];
        count = 0;

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int i = 0; i < rooms.size();i++){
            graph.put(i, new ArrayList<>());

            for(int key : rooms.get(i))
                graph.get(i).add(key);
        }

        dfs(graph, vis, 0);
        return count == rooms.size();
    }

    private void dfs(Map<Integer, List<Integer>> graph, boolean vis[], int cur){

        if(vis[cur])
            return;

        vis[cur] = true;
        count++;

        for(int key : graph.get(cur)){

            dfs(graph, vis, key);

        }
    }
}
