package com.company;

public class CustomHashSet<E> {
    private final int n;
    private final Node<E>[] buckets;
    private int nodesInBucket;

    public CustomHashSet() {
        n = 16;
        buckets = new Node[n];
        nodesInBucket = 0;
    }

    public boolean add(E object) {
        int hash = getHash(object);
        int index = getIndex(hash);

        if (buckets[index] == null) {
            buckets[index] = new Node<>(hash, object);
            nodesInBucket++;
            return true;
        }

        Node<E> parentNode = buckets[index];
        Node<E> node = buckets[index];

        while (node != null) {
            if (node.hash == hash) {
                if (node.object.equals(object)) {
                    return false;
                }
            }
            parentNode = node;
            node = node.next;
        }

        parentNode.next = new Node<E>(hash, object);
        nodesInBucket++;
        return true;
    }

    public boolean remove(E object) {
        int hash = getHash(object);
        int index = getIndex(hash);

        if (buckets[index] != null) {

            Node<E> parent = buckets[index];
            Node<E> node = buckets[index];

            if(node.hash == hash){
                if(node.object.equals(object)){
                    buckets[index] = null;
                    nodesInBucket--;
                    return true;
                }
            }

            while (node != null) {
                if (node.hash == hash) {
                    if (node.object.equals(object)) {
                        parent.next = null;
                        nodesInBucket--;
                        return true;
                    }
                }
                parent = node;
                node = node.next;
            }
        }
        return false;
    }

    public int getSize(){
        return nodesInBucket;
    }

    public boolean isEmpty(){
        return nodesInBucket == 0;
    }

    public void printSet() {

        for (int i = 0; i < n; i++) {

            Node<E> node = buckets[i];

            if (node != null) {
                Node<E> last = buckets[i];

                while (last != null) {
                    System.out.println( last.object.toString());
                    last = last.next;
                }
            }
        }
    }

    private int getIndex(int hash) {
        return hash & (n - 1);
    }

    private int getHash(E key) {
        return key == null ? 0 : key.hashCode();
    }

    private static class Node<E> {
        int hash;
        E object;
        Node<E> next;

        public Node(int hash, E object) {
            this.hash = hash;
            this.object = object;
            this.next = null;
        }
    }

}
