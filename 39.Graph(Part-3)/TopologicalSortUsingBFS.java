import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TopologicalSortUsingBFS {
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

    public static void calcIndeg(ArrayList<ArrayList<Edge>> graph, int[] indeg){
        for (int i = 0; i < graph.size(); i++) {
            for(int j = 0; j < graph.get(i).size(); j++) {
               Edge e = graph.get(i).get(j);
               indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<ArrayList<Edge>> graph){
        int[] indeg = new int[graph.size()];
        Queue<Integer> q = new ArrayDeque<>();

        calcIndeg(graph, indeg);

        for (int i = 0; i < graph.size(); i++) {
            if(indeg[i] == 0){
                q.add(i);
            }
        }


        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");

            for(int i = 0; i < graph.get(curr).size(); i++){
                Edge e = graph.get(curr).get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }

    }
    public static void main(String[] arg){
        int v = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);
        topSort(graph);
    }
}
