package org.devSayan.TreeLeetCode;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/path-sum-ii/
public class pathSum {
    public static void main(String[] args) {
        Node root = new Node(5);
        Node n1 = new Node(4);
        Node n2 = new Node(11);
        Node n3 = new Node(7);
        Node n4 = new Node(2);
        Node n5 = new Node(8);
        Node n6 = new Node(13);
        Node n7 = new Node(4);
        Node n8 = new Node(5);
        Node n9 = new Node(1);
        root.left = n1;
        root.right = n5;
        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n5.left = n6;
        n5.right = n7;
        n7.left = n8;
        n7.right = n9;
        System.out.println(pathSum(root,22));
    }
    public static void helper(Node root, List<Integer> path,List<List<Integer>> result, int curSum, int targetSum){
        if(root == null) return;
        path.add(root.data);
        curSum = curSum + root.data;
        if(root.left == null && root.right == null && curSum == targetSum){
            result.add(new ArrayList<>(path));
        }
        if(root.left!=null) helper(root.left,path,result,curSum,targetSum);
        if(root.right!=null) helper(root.right,path,result,curSum,targetSum);
        path.remove(path.size()-1);
    }
    public static List<List<Integer>> pathSum(Node root, int targetSum){
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int curSum = 0;
        helper(root,path,result,curSum,22);
        return result;
    }
}
