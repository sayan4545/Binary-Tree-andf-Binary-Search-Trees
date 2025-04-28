package org.devSayan.BinarySearchTrees;

public class InOrderSuccesor {
    public static void main(String[] args) {

    }
    public static Node findMin(Node root){
        Node temp = root;
        if(temp == null) return null;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }
    public static Node findMax(Node root){
        Node temp = root;
        if(temp == null) return null;
        while(temp.right != null){
            temp = temp.right;
        }
        return temp;
    }
    public static Node inOrderSucc(Node root){
        return findMin(root.right);
    }
    public static Node inOrderPred(Node root){
        return findMax(root.left);
    }
}
