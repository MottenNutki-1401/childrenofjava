package loops; //package here is only a sub folder, if you wanna run it in your device no need to copy this, unless you also have a sub folder that name is "loops"
public class BasicWhile {
    public static void main (String[] args) {
        //while loop is a flow control statement
        //it will run the code block as long as the condition is true
        //it is convenient if you don't know how many times the loop will run

        //simple code to print number (initialization) to 5 using while loop
        int i = -67;// initialization, the beginning value

        while(i <=5) { // this is the logic say (is -67 less than or equal to 5?) true
            //then it will repeat till its not = 5
            System.out.println(i); 
            i++;//increment here is like i = i + 1
            // this will keep adding 1 to i till the condition is false (i > 5)
        }

    }
    
}
//key notes->
/*For loop:

- You already know how many times you want to repeat

- You tell Java: “Start at 1, stop at 5, go +1 each time”

- Java handles the counting automatically

While loop:

- You don’t have to know in advance how many times it runs

- You just give a condition

- Java keeps repeating until the condition is false
- If you want the block to run 5 times, you make the condition true exactly 5 times (like i <= 5) */