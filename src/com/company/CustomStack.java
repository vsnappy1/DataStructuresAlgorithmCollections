package com.company;

public class CustomStack {

    Node top;

    public CustomStack() {
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int data){

        if(top == null){
            top = new Node(data);
            return;
        }

        Node oldTo = top;
        top = new Node(data);
        top.next = oldTo;
    }
    public Node pop(){

        if(top == null){
            return null;
        }

        Node oldTop = top;
        top = top.next;
        return oldTop;
    }

    public Node peek(){

        if(top == null){
            return null;
        }

        return top;
    }


    public void printStack(){
        if(top == null){
            System.out.println("Empty Stack");
            return;
        }

        Node node = top;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
