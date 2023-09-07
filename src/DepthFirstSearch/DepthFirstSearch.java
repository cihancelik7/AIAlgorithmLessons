package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    private Stack<Vertex1> stack;

    public DepthFirstSearch(){
        this.stack = new Stack<>();
    }
    public void dfs(List<Vertex1> vertexList){
        // it may happen that we have independent clusters
        for(Vertex1 v : vertexList){
            if (!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(Vertex1 rootVertex1) {
        /*
        Stack : Bir veri yapisi olarak tanimlanir. Bir stack verileri sirali bir sekilde saklamak
        icin kullanilan LIFO (son giren once cikar) yontemini kullanir. Stack verileri sirayla saklamak
        icin kullanilan bir yapidir, ve verileri sirayla saklamak icin kullanilan bir algoritmadir.
         */


        // "LIFO" structure
        stack.add(rootVertex1);
        rootVertex1.setVisited(true);

        while (!stack.isEmpty()){
            Vertex1 actualVertex1 = stack.pop();
            System.out.println(actualVertex1);

            // consider all the neighbors
            for (Vertex1 v : actualVertex1.getNeighbors()){
                if (!v.isVisited()){
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }

    }
}
