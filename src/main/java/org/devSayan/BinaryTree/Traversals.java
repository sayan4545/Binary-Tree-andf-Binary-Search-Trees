package org.devSayan.BinaryTree;

public class Traversals {
    public static void main(String[] args) {
        Node root = new Node(100);
        Node n1 = new Node(120);
        Node n2 = new Node(130);
        Node n3 = new Node(140);
        Node n4 = new Node(150);
        Node n5 = new Node(160);
        Node n6 = new Node(170);
        Node n7 = new Node(180);
        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.left = n5;
        n2.right = n6;
        n3.left = n7;
        /*
                100
                 |
                /  \
              120    130
             / \     / \
           140  150 160  170
           /
          180

         */
        inOrderTraversal(root);
        System.out.println();
        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
    }

    public static void inOrderTraversal(Node root){
        // base condition
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data +" ");
        inOrderTraversal(root.right);
    }
    public static void preOrderTraversal(Node root){
        // base condition
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }
}
