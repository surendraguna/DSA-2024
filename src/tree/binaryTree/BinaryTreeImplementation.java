package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import tree.Node;

public class BinaryTreeImplementation implements BinaryTree{
    private Node root = null;
    
    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    @Override
    public void inOrder() {
        inOrder(getRoot());
        System.out.println();
        // inOrderIterative(getRoot());
    }

    @SuppressWarnings("unused")
    private void inOrderIterative(Node root) {
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) {
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            System.out.print(cur.data + " ");
            cur = cur.right;
        }
        System.out.println();
    }

    private void inOrder(Node root) {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    @Override
    public void preOrder() {
        preOrder(getRoot());
        System.out.println();
        // preOrderIterative(getRoot());
    }

    @SuppressWarnings("unused")
    private void preOrderIterative(Node root) {
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node cur = st.pop();
            System.out.print(cur.data + " ");
            if(cur.right != null)
                st.push(cur.right);
            if(cur.left != null) 
                st.push(cur.left);
        }
        System.out.println();
    }

    private void preOrder(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    @Override
    public void postOrder() {
        postOrder(getRoot());
        System.out.println();
        // postOrderIterative(root);
    }

    @SuppressWarnings("unused")
    private void postOrderIterative(Node root) {
        if(root == null) return;
        Stack<Node> st = new Stack<>();
        Node cur = root;
        Node lastVisit = null;
        while (cur != null || !st.isEmpty()) {
            if(cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                Node peekNode = st.peek();
                if(peekNode.right != null && lastVisit != peekNode.right) {
                    cur = peekNode.right;
                } else {
                    System.out.print(peekNode.data + " ");
                    lastVisit = st.pop();
                }
            }
        }
        System.out.println();
    }

    private void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    @Override
    public void levelOrder() {
        levelOrder(getRoot());
        System.out.println();
    }

    private void levelOrder(Node root) {
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
    }

    @Override
    public void insertElement(int data) {
        if(root == null) {
            root = new Node(data);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.left == null) {
                temp.left = new Node(data);
                return;
            } else {
                q.add(temp.left);
            }

            if(temp.right == null) {
                temp.right = new Node(data);
                return;
            } else {
                q.add(temp.right);
            }
        }

    }

    @Override
    public void removeElement(int data) {
        setRoot(removeElement(data, root));  
    }

    private Node removeElement(int data, Node root) {
        if(root == null) return null;
        if(root.data == data) {
            if(root.left == null && root.right == null) return null;
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            if(root.left != null) {
                Node newNode = findMax(root.left);
                root.data = newNode.data;
                root.left = removeElement(newNode.data, root.left);
            } else {
                Node newNode = findMin(root.right);
                root.data = newNode.data;
                root.right = removeElement(newNode.data, root.right);
            }
        } else {
            root.left = removeElement(data, root.left);
            root.right = removeElement(data, root.right);
        }

        return root;
    }

    private Node findMin(Node root) {
        while (root.left != null) root = root.left;
        return root;
    }

    private Node findMax(Node root) {
        while (root.right != null) root = root.right;
        return root;
    }

    @Override
    public boolean searchElement(int data) {
        return searchElement(data, getRoot());
    }

    private boolean searchElement(int data, Node root) {
        if(root == null) return false;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.data == data) return true;
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
        return false;
    }

    public String toString() {
        Node root = getRoot();
        if(root == null) return null;
        StringBuilder sb = new StringBuilder();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            sb.append(temp.data + " ");
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
        return sb.toString();
    }
 
}
