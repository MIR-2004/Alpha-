import java.util.*;

class TopologicalSort{

    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    private static void createGraph(ArrayList<ArrayList<Edge>> graph){
        graph.get(2).add(new Edge(2, 3));

        graph.get(3).add(new Edge(3, 1));

        graph.get(4).add(new Edge(4, 0));
        graph.get(4).add(new Edge(4, 1));

        graph.get(5).add(new Edge(5, 0));
        graph.get(5).add(new Edge(5, 2));
       
    }

    private static void calculateDegree(ArrayList<ArrayList<Edge>> graph, int[] indeg){
        for(int i = 0; i < graph.size(); i++){
            for(int j = 0; j < graph.get(i).size(); i++){
                Edge e = graph.get(i).get(j);
                indeg[e.dest]++;
            }
        }
    }

    private static void topoSort(ArrayList<ArrayList<Edge>> graph){
        int[] indeg = new int[graph.size()];
        calculateDegree(graph, indeg);

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }


        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i = 0; i < graph.get(curr).size(); i++){
                Edge e = graph.get(curr).get(i);
                indeg[e.dest]--;

                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args){
        int v = 6;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        createGraph(graph);
        topoSort(graph);
    }
}