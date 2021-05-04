package com.company;

public class CustomPriorityQueue<E> {



    class Node{
        E value;
        Node left;
        Node right;

        public Node(E value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
