package tree;

public class Node {
    public int data;
    public Node left;
    public Node right;
    public Node () {}
    public Node (int data) {
        this.data = data;
        left = right = null;
    }

    public Node (Node node) {
        Node newNode = copyNode(node);
        this.data = newNode.data;
        this.left = newNode.left;
        this.right = newNode.right;
    }

    private Node copyNode (Node node) {
        if(node == null) return null;
        Node newNode = new Node(node.data);
        newNode.left = copyNode(node.left);
        newNode.right = copyNode(node.right);
        return newNode;
    }
}
