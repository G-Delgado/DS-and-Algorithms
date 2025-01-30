import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphs {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        // Add edges to the graph
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Carol");
        graph.addEdge("Alice", "David");
        graph.addEdge("Carol", "David");

        // Print the graph
        System.out.println("The graph:");
        graph.printGraph();

        // Get and print Bob's friends
        System.out.println("\nBob's friends:");
        List<String> bobFriends = graph.getAdjVertices("Bob");
        for (String friend : bobFriends) {
            System.out.println(friend);
        }
    }
}

class Graph<T> {
    private Map<T, List<T>> map = new HashMap<>();

    // Add a vertex to the graph
    public void addVertex(T s) {
        map.putIfAbsent(s, new ArrayList<>());
    }

    // Add an edge between source and destination
    public void addEdge(T source, T destination) {
        if (!map.containsKey(source))
            addVertex(source);
        if (!map.containsKey(destination))
            addVertex(destination);
        map.get(source).add(destination);
        map.get(destination).add(source); // for undirected graph
    }

    // Get all vertices connected to a vertex
    public List<T> getAdjVertices(T s) {
        return map.get(s);
    }

    // Print the graph
    public void printGraph() {
        for (T vertex : map.keySet()) {
            System.out.print(vertex + ": ");
            for (T adj : map.get(vertex)) {
                System.out.print(adj + " ");
            }
            System.out.println();
        }
    }
}
