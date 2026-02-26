
import java.util.*;

public class DFS {

    static class Edge {

        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void dfs(ArrayList<ArrayList<Edge>> graph, int curr, boolean[] visit) {
        System.out.print(curr + " ");
        visit[curr] = true;

        for (int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if (!visit[e.dest]) {
                dfs(graph, e.dest, visit);
            }
        }
    }

    public static boolean hashPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean[] visit){
        visit[src] = true;

        if(src == dest){
            return true;
        }

        for(int i = 0; i < graph.get(src).size(); i++){
            Edge e = graph.get(src).get(i);
            if(!visit[e.dest] && hashPath(graph, e.dest, dest, visit)){
                return true;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        int v = 7;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        boolean[] visit = new boolean[v];

        for (int i = 0; i < v; i++) {
            graph.add(i, new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 1));
        graph.get(1).add(new Edge(1, 0));
        graph.get(0).add(new Edge(0, 1));
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
        graph.get(5).add(new Edge(5, 6));


        boolean ans = hashPath(graph, 0, 6, visit);
        System.out.println(ans);

    }
}
