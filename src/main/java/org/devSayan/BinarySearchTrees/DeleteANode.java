package org.devSayan.BinarySearchTrees;

public class DeleteANode {
    public static void main(String[] args) {
        // Create a sample BST
        //       5
        //     /   \
        //    3     7
        //   / \   / \
        //  2   4 6   8

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println("Original BST (Inorder traversal):");
        inorderTraversal(root);

        // Test case 1: Delete a leaf node (2)
        root = delete(root, 2);
        System.out.println("\n\nAfter deleting leaf node 2:");
        inorderTraversal(root);

        // Test case 2: Delete a node with one child (7)
        root = delete(root, 7);
        System.out.println("\n\nAfter deleting node 7 with one child:");
        inorderTraversal(root);

        // Test case 3: Delete a node with two children (3)
        root = delete(root, 3);
        System.out.println("\n\nAfter deleting node 3 with two children:");
        inorderTraversal(root);

        // Test case 4: Delete the root node (5)
        root = delete(root, 5);
        System.out.println("\n\nAfter deleting root node 5:");
        inorderTraversal(root);
    }
    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    public static Node findMax(Node root){
        Node temp = root;
        if(root == null) return null;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp;
    }
    public static Node findMin(Node root){
        Node temp = root;
        if(temp == null) return null;
        while(temp.left !=null){
            temp = temp.left;
        }
        return temp;
    }
    public static Node search(Node root, int key){
        if(root == null) return null;
        if(root.data == key) return root;
        else if(root.data > key){
            return search (root.left, key);

        }
        else{
            return search(root.right, key);
        }

    }
    public static Node inOrderSucc(Node root){
        return findMin(root.right);
    }
    public static Node delete(Node root, int target){
        if (root == null) return null;

        // Recursively search and delete the node
        if (root.data > target) {
            // Target is in left subtree
            root.left = delete(root.left, target);
        } 
        else if (root.data < target) {
            // Target is in right subtree
            root.right = delete(root.right, target);
        }
        else {
            // Found the node to delete

            // Case 1: Leaf node (no children)
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Node with only one child
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            // Case 3: Node with two children
            else {
                // Find inorder successor (smallest node in right subtree)
                Node successor = inOrderSucc(root);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }
}
