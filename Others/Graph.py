from collections import deque

class Graph:
    def __init__(self, v):
        # No. of vertices
        self.V = v

        # Adjacency Lists
        self.adj = [[] for _ in range(v)]

    # Function to add an edge into the graph
    def add_edge(self, v, w):
        self.adj[v].append(w)

    # prints BFS traversal from a given source s
    def bfs(self, s):
        # Mark all the vertices as not visited (By default, set as False)
        visited = [False] * self.V

        # Create a queue for BFS
        queue = deque()

        # Mark the current node as visited and enqueue it
        visited[s] = True
        queue.append(s)

        while queue:
            # Dequeue a vertex from the queue and print it
            s = queue.popleft()
            print(s, end=" ")

            # Get all adjacent vertices of the dequeued vertex s.
            # If an adjacent vertex has not been visited, then mark it visited and enqueue it
            for n in self.adj[s]:
                if not visited[n]:
                    visited[n] = True
                    queue.append(n)


# Creating a graph with 4 vertices
g = Graph(4)

# Adding edges to the graph
g.add_edge(0, 1)
g.add_edge(0, 2)
g.add_edge(1, 2)
g.add_edge(2, 0)
g.add_edge(2, 3)
g.add_edge(3, 3)

# Printing the BFS traversal starting from vertex 2
print("Breadth First Traversal (starting from vertex 2):")
g.bfs(2)
