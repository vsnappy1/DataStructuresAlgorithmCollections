package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    static class Student {
        int mId;
        int mAge;
        String mClass;

        public Student(int mId, int mAge, String mClass) {
            this.mId = mId;
            this.mAge = mAge;
            this.mClass = mClass;
        }

        @Override
        public int hashCode() {
            return mClass.hashCode() & Integer.valueOf(mId).hashCode() & Integer.valueOf(mAge).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Student student = (Student) obj;
            return student.mId == this.mId && student.mAge == this.mAge && student.mClass.equals(this.mClass);
        }

        @Override
        public String toString() {
            return "Id: " + mId + " Age: " + mAge + " Class: " + mClass;
        }
    }


    public static void main(String[] args) {


//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(8);
//        priorityQueue.add(2);
//        priorityQueue.add(10);
//        priorityQueue.add(1);
//        priorityQueue.add(8);
//        priorityQueue.add(8);
//        priorityQueue.add(8);
//
//
//        Iterator iterator = priorityQueue.iterator();
//       while (iterator.hasNext()){
//           print(iterator.next());
//       }


        CustomBinaryTree tree = new CustomBinaryTree();
        tree.add(8);
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);

//        tree.DFS(10);
        tree.BFS(10);

//        CustomHashSet<Integer> customHashSet = new CustomHashSet<>();
//        customHashSet.add(8);
//        customHashSet.add(1);
//        customHashSet.add(6);
//        customHashSet.add(8);
//
//        customHashSet.printSet();
//        print(customHashSet.remove(1));
//        print(customHashSet.isEmpty());
//        print(customHashSet.getSize());

//        CustomHashSet<Student> set = new CustomHashSet<>();
//        print(set.add(new Student(5, 15, "three")));
//        print(set.add(new Student(1, 15, "three")));
//        print(set.add(new Student(2, 15, "three")));
//        print(set.add(new Student(4, 15, "three")));
//        print(set.add(new Student(3, 15, "three")));
//
//        print(set.remove(new Student(1, 15, "three")));
//        set.printSet();
//
//        print(set.isEmpty());
//        print(set.getSize());

//        print(set.remove(new Student(1,15,"three")));


//        CustomHashMap<String, Integer> hashMap = new CustomHashMap<>();
//        hashMap.put("King",1300);
//        hashMap.put("Queen",1200);
//        hashMap.put("Jack",1100);
//        hashMap.put("Ten",1000);
//        hashMap.put("Nine",900);
//        hashMap.put("Eight",800);
//        hashMap.put("Seven",700);
//        hashMap.put("Six",600);
//        hashMap.put("Five",500);
//        hashMap.put("Four",400);
//        hashMap.put("Three",300);
//        hashMap.put("Two",200);
//        hashMap.put("One",100);
//
//        print(hashMap.get("Five"));
//        print(hashMap.remove("Five"));
//        print(hashMap.get("Five"));
//
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(8);
//        queue.add(1);
//        queue.add(10);
//
//        for (int i : queue) System.out.print(i+", ");


//        Vector<Integer> list = new Vector<>();
//
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(1);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(2);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(5);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//
//        for(int i: list) System.out.print(i+", ");
//
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 > o2 ? -1 : 1;
//            }
//        });
//
//        System.out.println();
//        for(int i: list) System.out.print(i+", ");


//        System.out.println(list.capacity());
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//        list.removeElementAt(0);
//
//        System.out.println(list.capacity());

//        Dijkstra dijkstra = new Dijkstra();
//        dijkstra.dijkstra(dijkstra.getGraph(), 5);


//        int[] arr = {5,10,1,12,38,4,2,9,15,7};
//        for (int j : arr) System.out.print(j+", ");
//        System.out.println();
//
//        new MergeSort().sort(arr, 0, arr.length-1);
//        for (int j : arr) System.out.print(j+", ");


//        int[] sortedArray = new MergeSort().mergeSort(arr);

//        int[] arr = new int[1000];
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = i+1;
//        }
//
//        System.out.println(BinarySearch.binarySearch(arr, 999));

//        CustomBST bst = new CustomBST();
//        bst.insert(10);
//        bst.insert(7);
//        bst.insert(9);
//        bst.insert(5);
//        bst.insert(15);
//        bst.insert(16);
//        bst.insert(13);
//
////        CustomBST.Node node = bst.searchNode(13);
////
////        System.out.println(node.data);
//
//        bst.inOrder(bst.root);
//        System.out.println();
//        bst.preOrder(bst.root);
//        System.out.println();
//        bst.postOrder(bst.root);


//        CustomBinaryTree binaryTree = new CustomBinaryTree();
//        binaryTree.add(1);
//        binaryTree.add(2);
//        binaryTree.add(3);
//        binaryTree.add(4);
//        binaryTree.add(5);
//        binaryTree.add(6);
//        binaryTree.add(7);
//        binaryTree.add(8);
//
//        binaryTree.printBinaryTree();
//        binaryTree.removeValue(2);
//        System.out.println();
//        binaryTree.printBinaryTree();

//        CustomQueue queue = new CustomQueue();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//
//        queue.printQueue();
//        System.out.println("Dequeued: " + queue.dequeue().data);
//        queue.printQueue();


//        CustomStack stack = new CustomStack();
//        stack.push(5);
//        stack.push(2);
//        stack.push(10);
//        stack.push(6);
//        System.out.println("top: "+stack.peek().data);
//        System.out.println("popped: "+stack.pop().data);
//        System.out.println("top: "+stack.peek().data);
//        System.out.println("isEmpty: "+stack.isEmpty());
//        System.out.println("popped: "+stack.pop().data);
//        System.out.println("popped: "+stack.pop().data);
//        System.out.println("popped: "+stack.pop().data);
//        System.out.println("isEmpty: "+stack.isEmpty());
//
//        stack.printStack();

        //Linked List
//        CustomLinkedList list = new CustomLinkedList();
//        list.insertAtLast(5);
//        list.insertAtLast(3);
//        list.insertAtLast(10);
//        list.insertAtLast(7);
//        list.insertAtLast(13);
//        list.insertAtLast(65);
//        list.insertAtLast(21);
//        list.insertAtLast(-8);
//
//        list.insertAtBeginning(2742);
//        list.insertAtBeginning(27);
//
//        list.insertAfter(list.getNodeAt(2),677);
//
//        list.deleteNodeAt(4);
//
//        list.searchNode(8);
//
//        list.printLinkedList();


        //Recursion
//        System.out.println(fibonacciNumber(50));
    }


    static void print(Object o) {
        System.out.println(o);
    }

}
