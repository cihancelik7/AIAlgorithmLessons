package AStarSearch;

public class Edge {
    private double weight;
    private Node target;

    Edge(Node target, double weight){
        this.target = target;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Node getTarget(){
        return target;
    }



}
