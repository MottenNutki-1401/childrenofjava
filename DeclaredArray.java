import java.util.Arrays;
public class DeclaredArray {
    public static void main(String[]args) {
        String[] foods = new String [4]; //size of the array  
     
        //putting values in the indexes
        foods[0] = "Pizza"; 
        foods[1] = "Cake";
        foods[2] = "Pasta";
        foods[3] = "Salad";
        
        //printing the array
        System.out.println("Menu List" +Arrays.toString(foods));
    }
}