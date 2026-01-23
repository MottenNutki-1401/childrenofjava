package stackjava;
import java.util.Stack;

public class ArrayStack {
   public static void main (String [] args) {

        //lets create an array of numbers
        int [] numbers = {10,20,30,40,50};
        

        //Lets create an instace where we can store the arrays
        Stack <Integer> stackArr = new Stack <> ();
        //now we will push these array elements into the stack
        for (int stackNum: numbers) {
            stackArr.push(stackNum);

        }
        System.out.println("Stack elemets:" + stackArr); //but the output is not a lifo structure

        //We will use pop() ,method to see lifo in action
        System.out.println("Popped element: " + stackArr.pop());
        
   }
}
