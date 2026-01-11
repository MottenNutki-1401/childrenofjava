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


        // If we want something flexible that has no compiler warning
        // This is the standard waty of creating a stack with generic data type Object
        
        //Example typical human bone number
        Stack <Object> searchObject = new Stack <> ();
        searchObject.push ("Adult Human");
        searchObject.push (206);
        searchObject.push ("Baby Human");
        searchObject.push (270); // can be 270 - 300 bones for newborn babies

        // now we wanna locate the position of string "Adult Human" in this stack we created

        int pos = searchObject.search ("Adult Human");
        System.out.println (searchObject);
        System.out.println ("Position of String \"Adult Human\" in the stack is: " +pos);


        // Important Notes:
        //In array-index terms:
        //Index 0 → "Adult Human"
        //Index 1 → 206

//Index 3 → 270

    }
    
}
