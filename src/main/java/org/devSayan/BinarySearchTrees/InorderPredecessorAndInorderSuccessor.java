package org.devSayan.BinarySearchTrees;

import java.util.ArrayList;
public class InorderPredecessorAndInorderSuccessor {
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
    public static ArrayList<Integer> findPredAndSucc(int key, Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            list.add(-1);
            list.add(-1);
            return list;
        }

        Node predNode = search(root,key);
        if(predNode == null){
            // Key not found in the tree
            list.add(-1);
            list.add(-1);
            return list;
        }

        // Find predecessor
        Node pred = findMax(predNode.left);
        if(pred == null) {
            list.add(-1);
        } else {
            list.add(pred.data);
        }

        // Find successor
        Node succ = findMin(predNode.right);
        if(succ == null){
            list.add(-1);
        } else {
            list.add(succ.data);
        }

        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(75);
        root.right = new Node(120);
        System.out.println(findPredAndSucc(100,root));

        Node root2 = new Node(1000) ;
        System.out.println(findPredAndSucc(1000,root2));

    }
}
