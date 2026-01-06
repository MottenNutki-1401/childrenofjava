import java.util.Stack;
public class PeekStack {
    public static void main (String[]args) {
        Stack <String> peekStack = new Stack<>();


        System.out.println ("Star Cycle Stages");

        // pushing elements using push() method
        peekStack.push("Stellar Nebula");
        peekStack.push("Protostar");
        peekStack.push("Main Sequence Star");
        peekStack.push("Red Giant");
        peekStack.push("Supernova");
        peekStack.push ("Neutron Star");
        peekStack.push ("Black Hole");
        
        System.out.println(peekStack);

        //now we wanna see the top most element of the stack without removing it
        //we now will use the peek() method

        String peekElement = peekStack.peek();
        System.out.println("Top most element of the stack is: " + peekElement);

    }
    
}
