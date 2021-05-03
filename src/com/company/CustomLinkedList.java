package com.company;

public class CustomLinkedList {
    Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insertAtBeginning(int data){
        if(head == null){
            head = new Node(data);;
            return;
        }

        Node oldHead = head;
        head = new Node(data);
        head.next = oldHead;

    }

    public void insertAtLast(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = node;
    }

    public void insertAfter(Node node, int data){
        if(head == null){
            head = new Node(data);
            return;
        }

        Node lastNode = head;
        while (lastNode != node){
            lastNode = lastNode.next;
        }

        Node no = new Node(data);
        no.next = lastNode.next;
        lastNode.next = no;

    }

    public void deleteNodeAt(int position){
        if(head == null){
            return;
        }

        Node previous = null;
        Node last = head;
        int i = 0;

        while (last != null && i < position){
            previous = last;
            last = last.next;
            i++;
        }

        if(last.next == null){
            previous.next = null;
        }
        else {
            previous.next = last.next;
        }
    }

    public void searchNode(int key){
        if(head == null){
            return;
        }

        Node last = head;
        while(last != null){
            if(last.data == key){
                System.out.println("\n"+key+" Found");
                return;
            }
            last = last.next;
        }
        System.out.println("\n"+key+" Not Found");
    }

    public void printLinkedList(){
        if(head != null){
            Node lastNode = head;
            while (lastNode.next != null){
                System.out.print(lastNode.data+", ");
                lastNode = lastNode.next;
            }
            System.out.print(lastNode.data);

        }
    }

    public Node getNodeAt(int n){
        int count = 0;
        Node lastNode = head;
        while (lastNode.next != null & count < n){
            lastNode = lastNode.next;
            count++;
        }

        return lastNode;
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
