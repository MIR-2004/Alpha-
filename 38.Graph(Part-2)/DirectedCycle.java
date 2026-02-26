import java.util.ArrayList;

public class DirectedCycle {

     static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    private static void createGraph(ArrayList<ArrayList<Edge>> graph){
        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));
        graph.get(1).add(new Edge(1, 3));
        graph.get(2).add(new Edge(2, 3));
    }

    private static boolean isCycle(ArrayList<ArrayList<Edge>> graph){
        boolean[] vis = new boolean[graph.size()];
        boolean[] stack = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++){
            if(!vis[i]){
                if(isCycleUtils(graph, vis, stack, i)){
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean isCycleUtils(ArrayList<ArrayList<Edge>> graph, boolean[] vis, boolean[] stack, int curr){
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++){
            Edge e = graph.get(curr).get(i);

            if(stack[e.dest]){
                return true;
            }else if(!vis[e.dest] && isCycleUtils(graph, vis, stack, e.dest)){
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void main(String[] arg) {
        int v = 4;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);

        System.out.println(isCycle(graph));
    }
}
