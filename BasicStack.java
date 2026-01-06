import java.util.Stack;
public class BasicStack {
    
    public static void main (String [] args){

        Stack <String> exampleStack = new Stack<>();

        // push items/elements into stack name = exampleStack 
        //using push() method -> push method adds element to the top of the stack

        exampleStack.push("2026");
        exampleStack.push ("year");
        exampleStack.push("Welcome!");

        System.out.println(exampleStack); //this method only shows storage order from indec 0 to 2
        // hence we can't see lifo in action 

    }
}
