import java.util.*;

class AllPaths{

    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    private static void createGraph(ArrayList<ArrayList<Edge>> graph){
        graph.get(0).add(new Edge(0, 3));

        graph.get(2).add(new Edge(2, 3));

        graph.get(3).add(new Edge(3, 1));

        graph.get(4).add(new Edge(4, 0));
        graph.get(4).add(new Edge(4, 1));

        graph.get(5).add(new Edge(5, 0));
        graph.get(5).add(new Edge(5, 2));
       
    }

    private static void path(ArrayList<ArrayList<Edge>> graph, int src, int dest, String path){
        if(src == dest){
            System.out.println(path+dest);
            return;
        }

        for(int i = 0; i < graph.get(src).size(); i++){
            Edge e = graph.get(src).get(i);
            path(graph, e.dest, dest, path+src);
        }
    }


    public static void main(String[] args){
        int v = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);

        int src = 5; 
        int dest = 1;

        path(graph, src, dest, "");
        
    }
}