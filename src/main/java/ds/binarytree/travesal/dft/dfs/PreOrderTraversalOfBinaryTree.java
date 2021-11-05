package ds.binarytree.travesal.dft.dfs;

public class PreOrderTraversalOfBinaryTree {

    /**
     * Create Node of Binary Tree
     */
    public static class BinaryTreeNode {

        // Left and right node of Binary tree
        BinaryTreeNode leftNode;
        BinaryTreeNode rightNode;

        // Data of BinaryTree
        int data;

        BinaryTreeNode(int data) {
            this.data = data;
        }
    }

    /**
     * This method will do pre-order Traversal of binary tree in java. Method
     * will pass leftNode of binary tree recursively Once leftNode child is
     * done, pass rightNode of binary tree recursively
     */
    public void preorderTraversalMethod(BinaryTreeNode binaryTreeNode) {
        // Continue if binaryTreeNode is not null
        if (binaryTreeNode != null) {

            // Display data of current binaryTreeNode.
            System.out.print(binaryTreeNode.data + " ");

            // pass leftNode of binary tree recursively
            preorderTraversalMethod(binaryTreeNode.leftNode);

            // pass rightNode of binary tree recursively
            preorderTraversalMethod(binaryTreeNode.rightNode);
        }
    }

    /**
     * Main method to perform PreOrder Traversal of Binary Tree in java
     */
    public static void main(String[] args) {

        PreOrderTraversalOfBinaryTree preOrderTraversalOfBinaryTree = new PreOrderTraversalOfBinaryTree();

        // Now, let's start creating nodes of Binary tree

        // create node1 (which is ROOT node)
        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(1);

        // Left node of node1
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        binaryTreeNode1.leftNode = node2;
        // Right node of node1
        BinaryTreeNode node3 = new BinaryTreeNode(3);
        binaryTreeNode1.rightNode = node3;

        // Left node of node2
        BinaryTreeNode node4 = new BinaryTreeNode(4);
        node2.leftNode = node4;
        // Right node of node2
        BinaryTreeNode node5 = new BinaryTreeNode(5);
        node2.rightNode = node5;

        // Left node of node3
        BinaryTreeNode node6 = new BinaryTreeNode(6);
        node3.leftNode = node6;
        // Right node of node3
        BinaryTreeNode node7 = new BinaryTreeNode(7);
        node3.rightNode = node7;

        System.out.println("Pre order Traversal of Binary Tree in java : ");
        // Pass root node to pre order traversal method
        preOrderTraversalOfBinaryTree.preorderTraversalMethod(binaryTreeNode1);
    }
}

/*
 * Output
 *
 * Pre order Traversal of Binary Tree in java : 1 2 4 5 3 6 7
 *
 * 1 2 4 5 3 6 7
 * 4 5 2 6 7 3 1
 * 4 5 2 6 7 3 1
 *
 *
 */