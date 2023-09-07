package IterativeDeepeningDepthFirstSearchIDDFSimplementation;

import java.util.Stack;

public class IDDFS {
    // This is the node(vertex) we are looking for
    private Node targetNode;
    // Track whether we have to keep looking for the item or not
    private boolean isTargetFound;
    private int maxLength;

    public IDDFS(Node targetNode){
        this.targetNode = targetNode;
    }
    public void setTargetNode(Node root){
        int depth = 0;

        while (!isTargetFound){
            if (depth > maxLength){
                System.out.println("Node is not found...");
                break;
            }
            System.out.println();
            dfs(root,depth);
            depth++;
        }
    }

    private void dfs(Node source, int depthLevel) {
        Stack<Node> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()){
            Node actualNode = stack.pop();
            System.out.print(actualNode+" ");

            // we have to check whether we have found the node
            if (actualNode.getName().equals(targetNode.getName())){
                System.out.println("Node has been found...");
                isTargetFound = true;
                return;
            }
            if (actualNode.getAdjacencyList() != null)
                maxLength = actualNode.getDepthLevel()+1;
            // this is the IDDFS !!!
            if (actualNode.getDepthLevel() >= depthLevel)
                continue;

            // the standard DFS
            for (Node node : actualNode.getAdjacencyList()){
                node.setDepthLevel(actualNode.getDepthLevel()+1);
                stack.push(node);
            }
        }
    }
}
