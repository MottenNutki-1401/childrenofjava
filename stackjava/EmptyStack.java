package stackjava;
import java.util.Stack;

public class EmptyStack {
    public static void main (String [] args) {

        //creating an empty stack
        Stack <String> stacks = new Stack <> ();

        //check if the stack is empty 
        System.out.println("Is the stack empty? " + stacks.isEmpty());
    }
    
}
