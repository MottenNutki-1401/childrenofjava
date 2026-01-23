package arrays;

public class BasicArray {
    public static void main (String[] args) {

        //making a basicarray fixed size/primitive type
        //primitive = basic built-in data type in java

        //Creating an array of integers with size 5
        int [] numbers = new int [5];

        //Assigning values to each index of the array (adding elements)
        numbers [0]= 1;
        numbers[1]= 2;
        numbers[2]=3;
        numbers[3]= 4;
        numbers[4]= 5;

        //printng values using a for loop
        for (int i=0; i<7; i++) {
            System.out.println("Element at index " + i+ ": " +numbers [i]); 
        }

    }
    
}
