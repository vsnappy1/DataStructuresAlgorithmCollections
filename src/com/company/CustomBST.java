package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBST {
    Node root;

    public CustomBST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {

        if (root == null) {
            root = new Node(data);
            return;
        }

        Node temp = root;
        while (temp != null) {
            if (data < temp.data) {
                if (temp.left == null) {
                    temp.left = new Node(data);
                    return;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = new Node(data);
                    return;
                }
                temp = temp.right;
            }
        }
    }

    public Node searchNode(int data){
        return search(root, data);
    }

    public Node search(Node root, int data) {

        if(data == root.data)
            return root;

        if (data < root.data) {
            if (root.left == null)
                return null;
            return search(root.left, data);
        } else {
            if (root.right == null)
                return null;
            return search(root.right, data);
        }
    }

    public void inOrder(Node root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data+", ");
        inOrder(root.right);
    }

    public void preOrder(Node root){
        if(root == null)
            return;

        System.out.print(root.data+", ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+", ");
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
