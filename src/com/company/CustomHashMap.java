package com.company;

import java.lang.reflect.Array;

public class CustomHashMap<K, V> {


    private final int n;
    private final Node<K,V>[] buckets;

    public CustomHashMap() {
        n = 16;
        buckets = new Node[n];

        for(int i = 0; i < n; i++){
            buckets[i] = null;
        }
    }

    // <number> & <number> here and is used to perform bit wise AND operation
    /* i.e 12 & 5 = 4
        1100
        0101
        ----
        0100 = 4
    * */

    public void put(K k, V v) {
        int hash = hash(k);
        int index = hash & n;

        if(buckets[index] == null){
            buckets[index] = new Node<K,V>(hash,k,v);
            return;
        }

        Node<K,V> last = buckets[index];
        while (last.next != null){
            last = last.next;
        }

        last.next = new Node<K,V>(hash,k,v);
    }


    public V get(K key){
        int hash = hash(key);
        int index = hash & n;

        if(buckets[index] != null){
            Node<K, V> last = buckets[index];
            while (last != null){
                if (last.hash == hash){
                    if(last.key == key){
                        return last.value;
                    }
                }
                last = last.next;
            }
        }
        return null;
    }

    public boolean remove(K key){
        int hash = hash(key);
        int index = hash & n;

        if(buckets[index] != null){
            Node<K, V> parent =  buckets[index];
            Node<K, V> last = buckets[index];
            while (last != null){
                if (last.hash == hash){
                    if(last.key == key){
                        parent.next = null;
                        return true;
                    }
                }
                parent = last;
                last = last.next;
            }
        }
        return false;
    }


    private int hash(Object key) {
        return (key == null) ? 0 : key.hashCode();
    }

    private static class Node<K, V> {
        private int hash;
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(int hash, K key, V value) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
