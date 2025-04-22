package graphs.CloneGraph;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> oldToNew = new HashMap<>();
        return dfs(node, oldToNew);
    }

    private Node dfs(Node node, Map<Node, Node> newGraph) {
        if (node == null) {
            return null;
        }

        if (newGraph.containsKey(node)) {
            return newGraph.get(node);
        }

        Node copy = new Node(node.val);
        newGraph.put(node, copy);

        for (Node neighbour : node.neighbors) {
            copy.neighbors.add(dfs(neighbour, newGraph));
        }
        return copy;
    }

}
