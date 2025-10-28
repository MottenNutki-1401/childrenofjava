import java.util.Arrays;
public class FixedList {
    public static void main(String[] args){
        String name = "Sudo";
        int age = 500;
    
       System.out.println ("Hello! My name is " + name + " and I am " + age+ " years old." );

       String[] foods = {"Pizza", "Burger", "Pasta", "Salad"};

       //Converting array to string for printing
       System.out.println ("My favorite foods are:" +Arrays.toString(foods));
   }
}
