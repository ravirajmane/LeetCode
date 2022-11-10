package DFS;

import java.util.HashSet;

import java.util.Set;
import java.util.Stack;

public class MainDFS {
    public static void main(String[] args) {

        // Constructing the graph
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n0.addEdge(n1);
        n1.addEdge(n0);
        n1.addEdge(n3);
        n1.addEdge(n2);
        n2.addEdge(n1);
        n2.addEdge(n4);
        n3.addEdge(n1);
        n3.addEdge(n4);
        n3.addEdge(n5);
        n4.addEdge(n2);
        n4.addEdge(n3);
        n5.addEdge(n3);

        System.out.println(" DFS ");

        dfsIterative(n0);

        System.out.println(" DFS ");
        dfsRecursive(n0, new HashSet<Integer>());

    }

    public static void dfsIterative(Node startNode) {
        Stack<Node> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(startNode);
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();
            if (!visited.contains(currentNode.value)) {
                System.out.println(currentNode.value);
                visited.add(currentNode.value);
            }

            for (Node n : currentNode.neighbors) {
                if (!visited.contains(n.value)) {
                    stack.push(n);
                }
            }
        }
    }

    public static void dfsRecursive(Node startNode, Set<Integer> visited) {
        System.out.println(startNode.value);
        visited.add(startNode.value);

        for (Node n : startNode.neighbors) {
            if (!visited.contains(n.value)) {
                dfsRecursive(n, visited);
            }
        }

    }

}
