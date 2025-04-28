package org.devSayan.BinarySearchTrees;

public class SearchInABST {
    public static void main(String[] args) {

    }

    public Node search(Node root,int key){
        if(root==null) return null;
        if(root.data==key) return root;
        if(root.data>key) return search(root.left,key);
        return search(root.right,key);
    }
}
