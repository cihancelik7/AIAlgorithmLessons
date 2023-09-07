package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex1 {


    private String name;
    private boolean visited = false;
    private List<Vertex1> adjacencyList;

    public Vertex1(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbor(Vertex1 v) {
        adjacencyList.add(v);
    }

    public List<Vertex1> getNeighbors() {
        return adjacencyList;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return name;
    }
}
