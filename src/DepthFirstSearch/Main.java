package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Stack kullanimi olmaidigi zamanlarda vertex her bir ogeyi tek tek gezer ve yazar ama eger stack kullanirsak
        stack arada ustunden gectigi ogeleri yazmaz yani a b ve d ye gidecekse bize d yi yazar
         */
        

        Vertex1 v1 = new Vertex1("A");
        Vertex1 v2 = new Vertex1("B");
        Vertex1 v3 = new Vertex1("C");
        Vertex1 v4 = new Vertex1("D");
        Vertex1 v5 = new Vertex1("E");
        Vertex1 v6 = new Vertex1("F");
        Vertex1 v7 = new Vertex1("G");
        Vertex1 v8 = new Vertex1("H");

        List<Vertex1> list = new ArrayList<>();
        v1.addNeighbor(v2);
        v1.addNeighbor(v6);
        v1.addNeighbor(v7);
        v2.addNeighbor(v3);
        v2.addNeighbor(v4);
        v4.addNeighbor(v5);
        v7.addNeighbor(v8);

        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);
        list.add(v6);
        list.add(v7);
        list.add(v8);

        DepthFirstSearchRecursion dfs = new DepthFirstSearchRecursion();
        dfs.dfs(list);


    }
}
