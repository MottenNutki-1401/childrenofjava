package stackjava;
import java.util.Stack;

public class NotEmptyStck {
    public static void main (String [] args) {

        //creating a stack with elements
        Stack <String> stacks = new Stack <> ();
        stacks.push("Apple");
        stacks.push("Banana");
        stacks.push("Mango");

        //check if the stack is not empty 
        System.out.println("Is the stack empty? " + stacks.isEmpty());
    }
    
}
