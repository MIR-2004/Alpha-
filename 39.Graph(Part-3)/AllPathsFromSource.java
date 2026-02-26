import java.util.ArrayList;

public class AllPathsFromSource {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<ArrayList<Edge>> graph) {
        graph.get(0).add(new Edge(0, 3));

        graph.get(2).add(new Edge(2, 3));

        graph.get(3).add(new Edge(3, 1));

        graph.get(4).add(new Edge(4, 0));
        graph.get(4).add(new Edge(4, 1));

        graph.get(5).add(new Edge(5, 0));
        graph.get(5).add(new Edge(5, 2));
    }

    public static void detectPath(ArrayList<ArrayList<Edge>> graph, int curr, int dest, String path){
        if(curr == dest){
            System.out.println(path + dest);
        }

        for (int i = 0; i < graph.get(curr).size(); i++) {
            Edge e = graph.get(curr).get(i);
            detectPath(graph, e.dest, dest, path+curr);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);

        detectPath(graph, 5, 1, "");

    }
}
