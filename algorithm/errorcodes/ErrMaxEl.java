package algorithm.errorcodes;

public class ErrMaxEl {
    
    public static void main (String[] args) {

        // MaxEl.java we made a simple algorithm to find the maximum element in an array
        //Here we are going to break that code
        //I call this "Build and Break" principle
        //We learn faster by making errors and study why it error

        //Now same as the prev file lets make an array

        int arr [] = {2,3,5,6,1,7,9,4}; // we have an 8 elements in this array

        int max = arr[0]; //assume the first element is the maximum 

        //perform a linear search algorith using a for loop
        for (int i=1; i <10; i++) {
            //an if statement to compare each element
            if (arr [i] > max) {
                max = arr [i];
            }
        }
        // we need to put the print statement outside the for loop
        //otherwise it will print multiple times, since the loop will take it (itterate it)
        System.out.println(max + ": is the largest element in the array");
    }
}
// If you run this code you will get an Error saying this
/*"Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
        at algorithm.errorcodes.ErrMaxEl.main(ErrMaxEl.java:21)" */
//This error is called ArrayIndexOutOfBoundsException

////////////////////////////////////////////////////////////////////////////////////////////////////////
// This is because in the for loop we put the condition i<10
// but the array only has 8 elements, so the valid index locations are from 0 to 7
// when the loop reaches i=8 it will throw an error because there is no index 8 in the array
// The code is trying to acces an index that doesnt exist
//To fix this error we need to change the condition in the for loop to i < arr.length
//or simple just put i < 8 since we know the array has 8 elements (but this is not optimal for dynamic arrays)
////////////////////////////////////////////////////////////////////////////////////////////////////////

//PS: arr.lenght doesnt determine index location
//it just a condition statement to tell the loop how many times to iterate
// its the initializer who's pointing the index int i =1;
//then since we use updater (increment) i++ will update the intializer i=1
//This code didnt take int =1 as an integer value
//it took as index pointer location
// this is because we created an array above so the for loop absorbed that array

//Definition of ArrayIndexOutOfBoundsException:
/* ArrayIndexOutOfBoundsException in Java is a runtime exception thrown when code attempts to access an array element using an index 
that is either negative or greater than or equal to the array's length.  */