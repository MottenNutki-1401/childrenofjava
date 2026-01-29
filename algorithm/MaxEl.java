package algorithm;

public class MaxEl {
    public static void main (String[] args) {

        //A simple algorithm to find the maximum elememt in an array

        //lets make an array, or assume this is the given array

        int []  element = {3,6,9,12,15,1}; //here we use a static method array [] box 
        //lets assume the firt element is the maximum, which is located at index [0]

        int largest = element [0]; 

        //implement for loop
        //this is the optimal solution so we dont need to manually compare each element again and again 

        for (int i =1; i < element.length; i++) {
            if (element[i] >largest) {
                largest = element [i];
                
                //a for loop structure consist of (initialize;condition;updater) in case of here
                // we did'nt take 1 as the value as in int, because we put an array above
                //so the code absorb this array in the for loop, i=1 now is referring to the array index location

            }
        }
        System.out.println(largest + ": is the largest element in the array");

    }
    
}
//PS: elements.lenght count the total # of elements in the array it doesn't mean the index 
//nor the index value location