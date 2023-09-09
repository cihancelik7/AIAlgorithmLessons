package IterativeDeepeningDepthFirstSearchIDDFSimplementation;

public class Main {
    public static void main(String[] args) {

        Node node0 = new Node("A");
        Node node1 = new Node("B");
        Node node2 = new Node("C");
        Node node3 = new Node("D");
        Node node4 = new Node("E");
        Node node5 = new Node("H");
        /*
        if we will not add the node5 and after we will create new algorithm from IDFFS(node5)
          IDDFS algorithm = new IDDFS(node5);
        algorithm.setTargetNode(node0);
        A
        ACB
        ACBD
        ACBDE node is not  found...
         */

        node0.addNeighbor(node1);
        node0.addNeighbor(node2);
        node1.addNeighbor(node3);
        node3.addNeighbor(node4);

        IDDFS algorithm = new IDDFS(node3);
        algorithm.setTargetNode(node0);
        /*
        A
        ACB
        ACBD
        ACBDE node has been found...
         */

    }
}
