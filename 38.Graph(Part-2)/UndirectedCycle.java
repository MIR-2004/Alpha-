import java.util.ArrayList;

public class UndirectedCycle {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    private static void createGraph(ArrayList<ArrayList<Edge>> graph){
        graph.get(0).add(new Edge(0, 1));
        // graph.get(0).add(new Edge(0, 2));
        graph.get(0).add(new Edge(0, 3));

        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 2));

        // graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 1));
       

        graph.get(3).add(new Edge(3, 0));
        graph.get(3).add(new Edge(3, 4));

        graph.get(4).add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<ArrayList<Edge>> graph){
        boolean[] vis = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++) {
            if(!vis[i]){
                if(detectCycleUtils(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtils(ArrayList<ArrayList<Edge>> graph, boolean[] vis, int curr, int par){
        vis[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++){
            Edge e = graph.get(curr).get(i);

            if(!vis[e.dest] &&  detectCycleUtils(graph, vis, e.dest, curr)){
                return true;
            }else if(vis[e.dest] && e.dest != par){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] arg) {
        int v = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);

        System.out.println(detectCycle(graph));
    }
}
