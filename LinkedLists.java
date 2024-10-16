import java.util.LinkedList;
public class LinkedLists {

    public static void main(String[] args) {
        linkedLists();
    }

    private static void linkedLists(){

   // *******************************************************
  // LinkedList =  Nodes are in 2 parts (data + address)
  //                        Nodes are in non-consecutive memory locations
  //                        Elements are linked using pointers
            
  //    advantages?
  //    1. Dynamic Data Structure (allocates needed memory while running)
  //    2. Insertion and Deletion of Nodes is easy. O(1) 
  //    3. No/Low memory waste
  
  //    disadvantages?
  //    1. Greater memory usage (additional pointer)
  //    2. No random access of elements (no index [i])
  //    3. Accessing/searching elements is more time consuming. O(n)
  
  //    uses?
  //    1. implement Stacks/Queues
  //    2. GPS navigation
  //    3. music playlist

  
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("A"); // A
        linkedList.push("B"); // B, A
        linkedList.push("C"); // C, B, A
        linkedList.push("F"); // D, C, B, A
        //  linkedList.pop(); // C, B, A
        System.out.println("LinkedList: " + linkedList);
        System.out.println("LinkedList: " + linkedList.indexOf("B"));
        System.out.println("LinkedList: " + linkedList.contains("B"));
        System.out.println("LinkedList: " + linkedList.peekFirst());
        System.out.println("LinkedList: " + linkedList.peekLast());
        System.out.println("LinkedList: " + linkedList.poll());
        linkedList.addFirst("0");
        linkedList.addLast("Z");
        System.out.println("LinkedList: " + linkedList);
    }
    
}