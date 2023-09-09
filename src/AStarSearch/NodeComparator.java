package AStarSearch;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {

    // Node1 is smaller than node2 of node1.f <node2.f (f=g+h)
    @Override
    public int compare(Node o1, Node o2) {
        return Double.compare(o1.getF(),o2.getF());
    }
}
