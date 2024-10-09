import java.util.Stack;

public class StackDataStructures {
    public static void main(String[] args) {
        //stack is a data structure that follows the LIFO (Last In First Out) principle
        getStack();

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
}
