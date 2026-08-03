import java.util.*;

class Dijkstra{

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    private static void createGraph(ArrayList<ArrayList<Edge>> graph){
        graph.get(0).add(new Edge(0, 1, 2));
        graph.get(0).add(new Edge(0, 2, 4));

        graph.get(1).add(new Edge(1, 3, 7));
        graph.get(1).add(new Edge(1, 2, 1));

        graph.get(2).add(new Edge(2, 4, 3));

        graph.get(3).add(new Edge(3, 5, 1));

        graph.get(4).add(new Edge(4, 3, 2));
        graph.get(4).add(new Edge(4, 5, 5));
       
    }

    static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }

    }

    private static void algo(ArrayList<ArrayList<Edge>> graph, int src){
        int[] dist = new int[graph.size()];

        for(int i = 0; i < dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[graph.size()];

        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            
            if(!vis[p.n]){
                vis[p.n] = true;
                for(int i = 0; i < graph.get(p.n).size(); i++){
                    Edge e = graph.get(p.n).get(i);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.offer(new Pair(v, dist[v]));
                    }
                
                }
            }
        }


    for (int i = 0; i < dist.length; i++) {
        System.out.print(dist[i] + " ");
    }

    }

    public static void main(String[] args){
        int v = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);
        algo(graph, 0);
    }
}