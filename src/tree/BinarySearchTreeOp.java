package tree;

import tree.binarySearchTree.BinarySearchTree;
import tree.binarySearchTree.BinarySearchTreeImplementation;

public class BinarySearchTreeOp {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTreeImplementation();
        int[] a = {8, 3, 10, 1, 6, 4, 7, 14, 13, 5};
        for (int i : a) {
            tree.insertElement(i);
        }   
        for (int i : a) {
            System.out.print(tree.heightOfElement(i)+ " ");
        }   
        System.out.println(tree.heightOfElement(99));
    }
}
