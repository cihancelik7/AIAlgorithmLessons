package AStarSearch;

import java.util.*;

public class AStarSearch {
    private Node source;
    private Node destination;
    private Set<Node> explored;
    private PriorityQueue<Node> queue;

    public AStarSearch(Node source, Node destination) {
        this.source = source;
        this.destination = destination;
        this.explored = new HashSet<>();
        this.queue = new PriorityQueue<>(new NodeComparator());
    }

    public void run() {

        queue.add(source);
        while (!queue.isEmpty()) {
            // we always get the node with the lowest f(x) value possible
            Node current = queue.poll();
            explored.add(current);

            // we have found the destination node
            if (current == destination)
                break;

            // consider the adjacent nodes
            for (Edge edge : current.getAdjacencyList()) {
                Node child = edge.getTarget();
                double cost = edge.getWeight();
                double tempG = current.getG() + cost;
                double tempF = tempG + heuristic(current, destination);

                // if we have not considered the child amd the f(x) is higher
                if (explored.contains(child) && tempF >= child.getF()) {
                    continue;
                }
                // else if we have not visited OR the f(x) score is lower
                else if (!queue.contains(child) || tempF < child.getF()) {
                    // this is how we can track the shortest path (predecessor)
                    child.setParent(current);
                    child.setG(tempG);
                    child.setF(tempF);

                    // we have it in the queue bot now we have a lower value
                    // instead of update - we remove and reinsert again
                    if (queue.contains(child)) {
                        queue.remove(child);
                    }
                    queue.add(child);
                }
            }

        }

    }

    private double heuristic(Node node1, Node node2) {
        return Math.sqrt(((node1.getX() - node2.getX()) * (node1.getX() - node2.getX())) +
                ((node1.getY() - node2.getY()) * (node1.getY() - node2.getY())));
    }
    public void printSolutionPath(){
        List<Node> path = new ArrayList<Node>();
        for (Node node=destination;node!=null;node=node.getParent()){
            path.add(node);
        }
        Collections.reverse(path);
        System.out.println(path);
    }

}
