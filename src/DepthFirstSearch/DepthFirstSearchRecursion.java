package DepthFirstSearch;

import java.util.List;

public class DepthFirstSearchRecursion {

    public void dfs(List<Vertex1> vertexList) {

        // it may happen that we have independent clusters
        for (Vertex1 v : vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(Vertex1 vertex1) {
        System.out.println(vertex1);

        for (Vertex1 v : vertex1.getNeighbors()) {

            if (!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }
}
