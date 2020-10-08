package ReconstructItinary;

import java.util.*;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {

        Map<String, List<String>> graph = generateGraph(tickets);


        Map<String, Integer> outDegree = new HashMap<>();
        for(String s : graph.keySet())
            outDegree.put(s, 0);

        List<String> result = new ArrayList<>();

        dfs(graph, result, "JFK","",outDegree);

        // System.out.println("-----------------------");

        Collections.reverse(result);
        return result;
    }

    private Map<String, List<String>> generateGraph(List<List<String>> g){

        Map<String, List<String>> graph = new HashMap<>();

        for(List<String> list : g){
            String from = list.get(0);
            String to = list.get(1);

            if(!graph.containsKey(from))
                graph.put(from, new ArrayList<>());

            graph.get(from).add(to);
        }

        for(String key : graph.keySet())
            Collections.sort(graph.get(key));

        return graph;
    }

    private void dfs(Map<String, List<String>> graph, List<String> path, String from, String prev, Map<String, Integer> outDegree){

        if(!graph.containsKey(from)){
            path.add(from);
            return;
        }

        List<String> list = graph.get(from);

        for(int i = outDegree.get(from) ; i < list.size(); i++){


            String to = list.get(i);

            outDegree.put(from, outDegree.get(from)+1);
            // System.out.println(from+" --> " +to+ " --> " + outDegree.get(from));
            dfs(graph, path, to,from,outDegree);

            if(outDegree.get(from) >= list.size())
                break;
        }

        path.add(from);
    }
}
