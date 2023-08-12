package Others;
import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> graph;

    // Constructor
    public Graph() {
        // Default dictionary to store graph
        graph = new HashMap<>();
    }

    // Function to add an edge to the graph
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    // Function to print a BFS of the graph
    public void BFS(int s) {
        // Mark all the vertices as not visited
        boolean[] visited = new boolean[graph.size()];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the source node as visited and enqueue it
        queue.offer(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            // Get all adjacent vertices of the dequeued vertex.
            // If an adjacent vertex has not been visited, then mark it visited and enqueue it
            for (int neighbor : graph.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();

        // Adding edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2):");
        g.BFS(2);
    }
}

