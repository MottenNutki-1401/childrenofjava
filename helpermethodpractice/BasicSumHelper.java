package helpermethodpractice;

public class BasicSumHelper {

    //this is called a non-void, since its not a void we must return something
    public static int add(int a, int b){
        return a+b;

    }
    //see void here doesn't return anything, it only perform actions
    public static void main (String[] args){
        int x =  add(3,4);
        System.out.println(x);
    }
}
// Usually we put a helper method on top of main, for readability 
//but anywhere below/top main is fine
//Note: The first int above "int add(int a, int b)" determines what dt we will return
// the second int determines the dt of what we are gonna accept
//int first = output
//int second = input