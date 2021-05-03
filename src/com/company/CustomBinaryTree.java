package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTree {
    Node root;

    public CustomBinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.remove();

            if(temp.left == null){
                temp.left = new Node(data);
                return;
            }
            else {
                queue.add(temp.left);
            }

            if(temp.right == null){
                temp.right = new Node(data);
                return;
            }
            else {
                queue.add(temp.right);
            }
        }
    }

    public void printBinaryTree(){

        if(root == null){
            System.out.println("Empty Tree");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();
            System.out.print(temp.data+", ");

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }

    public void deleteRightMostNode(Node root, Node delNode ){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node temp;
        while (!queue.isEmpty()){
            temp = queue.peek();
            queue.remove();

            if(temp == delNode){
                temp = null;
                return;
            }

            if(temp.left != null){
                if(temp.left == delNode){
                    temp.left = null;
                    return;
                }
                queue.add(temp.left);
            }

            if(temp.right != null){
                if(temp.right == delNode){
                    temp.right = null;
                    return;
                }
                queue.add(temp.right);
            }
        }

    }

    public boolean removeValue(int data){
        if(root == null){
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node nodeToBeDeleted = null;
        Node temp = null;

        while (!queue.isEmpty()){
            temp = queue.peek();
            queue.remove();

            if(temp.data == data){
                nodeToBeDeleted = temp;
            }

            if(temp.left != null)
                queue.add(temp.left);

            if(temp.right != null)
                queue.add(temp.right);
        }

        if(nodeToBeDeleted != null){
            nodeToBeDeleted.data  = temp.data;
            deleteRightMostNode(root, temp);
            return true;
        }

        return false;
    }

    public void printBinaryTree(Node node){

        if(node == null)
            return;

        System.out.print(node.data+", ");
        printBinaryTree(node.left);
        printBinaryTree(node.right);
    }


    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
