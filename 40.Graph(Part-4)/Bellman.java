import java.util.*;

public class Bellman {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    private static void createGraph(ArrayList<ArrayList<Edge>> graph) {
        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(0).add(new Edge(0, 2, 4));

        graph.get(1).add(new Edge(1, 2, -4));

        graph.get(2).add(new Edge(2, 3, 2));

        graph.get(3).add(new Edge(3, 4, 4));

        graph.get(4).add(new Edge(4, 1, -1));

    }

    private static void algo(ArrayList<ArrayList<Edge>> graph, int src) {
        int[] dist = new int[graph.size()];

        for(int i = 0; i < dist.length; i++){
            if(src != i){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.size();

        for(int i = 0; i < V-1; i++){

            for(int j = 0; j < graph.size(); j++){
                for(int k = 0; k < graph.get(j).size(); k++){
                    Edge e = graph.get(j).get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u]+wt;
                    }
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);
        algo(graph, 0);
    }
}
