package org.devSayan.BinarySearchTrees;

public class FindMaximumAndMinimum {
    public static void main(String[] args) {

    }
    public static int findMin(Node root){
        Node temp = root;
        if(temp == null) return -1;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp.data;
    }
    public static int findmax(Node root){
        Node temp = root;
        if(temp == null) return -1;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp.data;
    }
}
