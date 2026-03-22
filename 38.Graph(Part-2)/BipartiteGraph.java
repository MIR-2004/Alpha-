import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BipartiteGraph {

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

        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 3));

        graph.get(2).add(new Edge(2, 0));
        // graph.get(2).add(new Edge(2, 4));
       

        graph.get(3).add(new Edge(3, 1));
        graph.get(3).add(new Edge(3, 4));

        // graph.get(4).add(new Edge(4, 2));
        graph.get(4).add(new Edge(4, 3));
    }
    
    public static boolean isBipartite(ArrayList<ArrayList<Edge>> graph){
        int color[] = new int[graph.size()];

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new ArrayDeque<>();
        

        for(int i = 0; i < graph.size(); i++) {
            if(color[i] == -1){
                q.add(i);
                color[i] = 0;

                while(!q.isEmpty()){
                    int curr = q.remove();

                    for(int j = 0; j < graph.get(curr).size(); j++) {
                        Edge e = graph.get(curr).get(j);

                        if(color[e.dest] == -1){
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            q.add(e.dest);
                        }else if(color[curr] == color[e.dest]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] arg){
        int v = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
