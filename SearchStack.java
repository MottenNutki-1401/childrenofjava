import java.util.Stack;
public class SearchStack {

    public static void main (String [] args) {


        //There are ways we can create a stack this is one way where we do not explicitly 
        //tell the data type of stack element, this allows flexibility such as that we can add any data type "push()"
        // But this is not recommended, the compiler will show warning which is not so aesthetic 

        //Below is the example of it 
        Stack searchStack = new Stack (); //we created a stack without specifying data type
        
        searchStack.push ("Cell"); //next we push elements to it 
        searchStack.push("Division");
        searchStack.push("Phases");
        searchStack.push (4);
        searchStack.push ("for body cells"); 

        int position = searchStack.search("Division");
        System.out.println(searchStack);
        System.out.println ("Position of element 'Division' from top of the stack is: " + position);
    }
    
}
