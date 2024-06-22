package tree.binarySearchTree;

import tree.binaryTree.BinaryTree;

public interface BinarySearchTree extends BinaryTree{
    int heightOfElement(int data);
    int depthOfElement(int data);
}
