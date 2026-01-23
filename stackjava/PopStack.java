package stackjava;
import java.util.Stack;
public class PopStack {

    public static void main (String[] args) {

        Stack <Integer> popStack = new Stack<>();

        //now lets push items into pop stack using push() method

        popStack.push (10);
        popStack.push(9);
        popStack.push (8);
        popStack.push(7);
        popStack.push(6);
        popStack.push(5);
        popStack.push(4);
        popStack.push(3);
        popStack.push(2);
        popStack.push(1);

        System.out.println("Stack before pop operation: " + popStack);

        //pop() method removes the top element from the stack and returns it
        Integer popElement = popStack.pop();
        System.out.println ("Popped element: " + popElement);

        //Now if we wanna see the stack elements after pop operation
        System.out.println (popStack);
    }
    
}
