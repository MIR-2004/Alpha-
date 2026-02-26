
import java.util.*;

class BFS {

    public static class Edge {

        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void bfs(ArrayList<ArrayList<Edge>> graph){
        boolean[] vis = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++) {
            if(!vis[i]){
                bfsUtil(graph, vis, i);
            }
        }
    }

    public static void bfsUtil(ArrayList<ArrayList<Edge>> graph, boolean[] vis, int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph.get(curr).size(); i++) {
                    q.add(graph.get(curr).get(i).dest);
                }
            }
        }
    }

    public static void main(String arg[]) {
        int v = 8;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));
        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 3));
        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 4));
        graph.get(3).add(new Edge(3, 1));
        graph.get(3).add(new Edge(3, 4));
        graph.get(3).add(new Edge(3, 5));
        graph.get(4).add(new Edge(4, 2));
        graph.get(4).add(new Edge(4, 3));
        graph.get(4).add(new Edge(4, 5));
        graph.get(5).add(new Edge(5, 3));
        graph.get(5).add(new Edge(5, 4));
        // graph.get(5).add(new Edge(5, 6));
        graph.get(6).add(new Edge(6, 7));
        graph.get(7).add(new Edge(7, 6));


        bfs(graph);

    }
}
