package org.devSayan.BinarySearchTrees;

import java.util.Scanner;

public class InsertIntoBST {
    public static void main(String[] args) {

    }
    public static Node takeInput(Node root, int data){
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        while(data != -1){
            root = insertBST(root, data);
            data = sc.nextInt();
        }
        return root;

    }

    private static Node insertBST(Node root, int data) {
        // If the tree is empty
        if(root== null){
            root = new Node(data);
            return root;
        }
        //left subtree
        else if(root.data > data){
            root.left = insertBST(root.left,data);
        }
        // right subtree
        else{
            root.right = insertBST(root.right,data);
        }
        return root;
    }
}
