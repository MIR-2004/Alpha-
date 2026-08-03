import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
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
        graph.get(0).add(new Edge(0, 1, 10));
        graph.get(0).add(new Edge(0, 2, 15));
        graph.get(0).add(new Edge(0, 3, 30));

        graph.get(1).add(new Edge(1, 0, 10));
        graph.get(1).add(new Edge(1, 3, 40));

        graph.get(2).add(new Edge(2, 0, 15));
        graph.get(2).add(new Edge(2,3, 50));

        graph.get(3).add(new Edge(3, 1, 40));
        graph.get(3).add(new Edge(3, 2, 50));

    }

    static class Pair{
        int v;
        int cost;

        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
    }

    private static void algo(ArrayList<ArrayList<Edge>> graph, int src) {
        boolean[] vis = new boolean[graph.size()];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.poll();

            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost += curr.cost;


                for(int i = 0; i < graph.get(curr.v).size(); i++){
                    Edge e = graph.get(curr.v).get(i);

                    pq.offer(new Pair(e.dest, e.wt));

                }
            }
        }

        System.out.println(finalCost);


    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);
        algo(graph, 0);
    }
}




