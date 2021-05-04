package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public boolean DFS(int data){

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        Node currentNode = root;

        while (!stack.isEmpty()){

            if(currentNode.data == data){
                return true;
            }

            if(currentNode.right != null && !currentNode.right.isVisited){
                stack.add(currentNode.right);
            }

            if(currentNode.left != null && !currentNode.left.isVisited){
                stack.add(currentNode.left);
            }

            System.out.print(currentNode.data+", ");
            currentNode.isVisited = true;
            currentNode = stack.pop();
        }

        return false;

    }

    public boolean BFS(int data){

        Stack<Node> stack = new Stack<>();
        stack.add(root);
        return BFS(data, stack);
    }

    public boolean BFS(int data, Stack<Node> stack){

        if(stack.isEmpty()){
            return false;
        }

        Node currentNode = stack.pop();

        if(currentNode.data == data){
            return true;
        }

        if(currentNode.left != null && !currentNode.left.isVisited){
            System.out.print(currentNode.left.data+", ");
            currentNode.left.isVisited = true;
            stack.add(currentNode.left);
        }

        if (currentNode.right != null && !currentNode.right.isVisited){
            System.out.print(currentNode.right.data+", ");
            currentNode.right.isVisited = true;
            stack.add(currentNode.right);
        }

        return BFS(data, stack);


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
        boolean isVisited = false;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
