package tree.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import tree.Node;
import tree.binaryTree.BinaryTreeImplementation;

public class BinarySearchTreeImplementation extends BinaryTreeImplementation implements BinarySearchTree{
    
    @Override
    public void insertElement(int data) {
        insertElement(data, getRoot());
    }

    private void insertElement(int data, Node root) {
        if(root == null) {
            root = new Node(data);
            setRoot(root);
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.data == data)
                return;
            else if (temp.data > data) {
                if(temp.left == null) {
                    temp.left = new Node(data);
                    return;
                }
                else    
                    q.add(temp.left);
            } else {
                if(temp.right == null) {
                    temp.right = new Node(data);
                    return;
                }
                else 
                    q.add(temp.right);
            }
        }
    }

    @Override
    public void removeElement(int data) {
        int f = 1;
        setRoot(removeElement(data, getRoot(), f));
    }

    private Node removeElement(int data, Node root, int f) {
        if(root == null) return null;
        if(root.data > data) root.left = removeElement(data, root.left, f);
        else if (root.data < data) root.right = removeElement(data, root.right, f);
        else {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            if(f == 0) {
                root.data = findMax(root.left).data;
                root.left = removeElement(root.data, root.left, f);
            } else {
                root.data = findMin(root.right).data;
                root.right = removeElement(root.data, root.right, f);
            }
        }
        return root;
    }

    private Node findMin (Node root) {
        if(root == null) return null;
        while (root.left != null) root = root.left;
        return root;
    }

    private Node findMax(Node root) {
        if(root == null) return null;
        while (root.right != null) root = root.right;
        return root;
    }

    @Override
    public boolean searchElement(int data) {
        return searchElement(data, getRoot());
    }

    private boolean searchElement(int data, Node root) {
        if(root == null) return false;
        Node cur = root;
        while (cur != null) {
            if(cur.data == data) return true;
            if(cur.data > data) cur = cur.left;
            else cur = cur.right;
        }
        return false;
    }

    @Override
    public int heightOfElement(int data) {
        Node node = findNode(data, getRoot());
        if(node == null) return -1;
        return heightOfElement(node);
    }



    private Node findNode(int data, Node root) {
        if(root == null) return null;
        Node cur = root;
        while (cur != null) {
            if(cur.data == data) return cur;
            if(cur.data > data) cur = cur.left;
            else cur = cur.right;
        }
        return cur;
    }

    private int heightOfElement(Node node) {
        if(node == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int height = -1;
        while (!q.isEmpty()) {
            height++;
            for(int i = 0; i < q.size(); i++) {
                Node temp = q.poll();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return height;
    }

    @Override
    public int depthOfElement(int data) {
        return depthOfElement(data, getRoot());
    }

    private int depthOfElement(int data, Node root) {
        if(root == null) return 0;
        int depth = 0;
        Node cur = root;
        while (cur != null) {
            if(cur.data == data) return depth;
            if(cur.data > data) cur = cur.left;
            else cur = cur.right;
            depth++;
        }
        return -1;
    }
}
