package graphs.CloneGraph;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);

        // Clone the graph
        Solution solution = new Solution();
        Node clonedGraph = solution.cloneGraph(node1);

        // Print the cloned graph (for demonstration purposes)
        System.out.println("Cloned Node Value: " + clonedGraph.val);
        System.out.println("Cloned Node Neighbors: " + clonedGraph.neighbors.size());
    }
}
