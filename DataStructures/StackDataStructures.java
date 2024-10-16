package DataStructures;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackDataStructures {
    public static void main(String[] args) {
        //stack is a data structure that follows the LIFO (Last In First Out) principle
        // getStack();
        // queue is a data structure that follows the FIFO (First In First Out) principle
        // enqueue is adding an element to the queue
        // dequeue is removing an element from the queue
        // queue();
        priorityQueue();


    }

    private static void queue() {
        Queue<String> queue = new LinkedList<String>();
        System.out.println("Queue: " + queue.isEmpty());
        queue.offer("A");    // A
        queue.offer("B");    // A, B
        queue.offer("C");    // A, B, C
        // collection methods
        System.out.println("Queue: " + queue.isEmpty());
        System.out.println("Queue: " + queue.size());
        System.out.println("Queue: " + queue.contains("A"));
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        queue.poll();        // B, C
        System.out.println("Queue after poll: " + queue);
        // no elemeent
        
    }

    private static void getStack() {
        Stack<String> stack = new Stack<String>();
        stack.push("A");    // A    
        stack.push("B");    // A, B
        stack.push("C");    // A, B, C
        stack.push("D");    // A, B, C, D

        System.out.println("Stack: " + stack);

        stack.pop();        // A, B, C
        stack.pop();        // A, B  
        System.out.println("Stack after pop: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Search for B: " + stack.search("B"));
        System.out.println("Search for D: " + stack.search("D"));
    }

    private static void priorityQueue() {
        // priority queue is a data structure that allows you to add elements in any order and remove the element with the highest priority
        // the priority is determined by the natural order of the elements or by a comparator
        // the element with the highest priority is removed first
        // if two elements have the same priority, they are removed in the order they were added

        Queue<String> priorityQueue = new PriorityQueue<String>(Collections.reverseOrder());
        priorityQueue.offer("B");
        priorityQueue.offer("C");
        priorityQueue.offer("A");
        priorityQueue.offer("F");
        System.out.println("Priority Queue: " + priorityQueue);
    }
}
