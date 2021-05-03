package com.company;

public class CustomQueue {
    Node first;

    public CustomQueue() {
        this.first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(int data){
        if(first == null){
            first = new Node(data);
            return;
        }

        Node last = first;
        while (last.next != null){
            last = last.next;
        }

        last.next = new Node(data);
    }

    public Node dequeue(){
        if(first == null){
            return null;
        }

        Node oldFirst = first;
        first = first.next;
        return oldFirst;
    }

    public void printQueue(){
        if(first == null){
            System.out.println("Queue is Empty");
            return;
        }

        Node node = first;
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
