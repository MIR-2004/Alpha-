import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort{
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<ArrayList<Edge>> graph){
        graph.get(2).add(new Edge(2, 3));

        graph.get(3).add(new Edge(3, 1));
        
        graph.get(4).add(new Edge(4, 0));
        graph.get(4).add(new Edge(4, 1));

        graph.get(5).add(new Edge(5, 0));
        graph.get(5).add(new Edge(5, 2));
    }

    public static void sort(ArrayList<ArrayList<Edge>> graph) {
        boolean[] vis = new boolean[graph.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < graph.size(); i++) {
            if(!vis[i]){
                sortUtils(graph, vis, stack, i);
            }
        }

        while(!stack.isEmpty()){
            System.err.print(stack.pop() + " ");
        }
    }

    public static void sortUtils(ArrayList<ArrayList<Edge>> graph, boolean[] vis, Stack<Integer> stack, int curr){
        vis[curr] = true;

        for(int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            if(!vis[e.dest]){
                sortUtils(graph, vis, stack, e.dest);
            }
        }

        stack.push(curr);
    }
 
    public static void main(String[] args){
        int v = 7;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);
        sort(graph);
    }
}
