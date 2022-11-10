package DFS;

import java.util.ArrayList;
import java.util.List;

class Node {
    int value;
    List<Node> neighbors;

    public Node(int val) {
        this.value = val;
        neighbors = new ArrayList<>();
    }

    public void addEdge(Node to) {
        neighbors.add(to);
    }

}
