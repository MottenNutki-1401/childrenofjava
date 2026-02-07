package helpermethodpractice;

public class Even {
    public static boolean isEven(int check){
        
        //this helper method checks the number if is even, then returning it as a boolean       
        return check % 2==0; // "%" is a modullo operator it behaves differenly from "/"
     
    }
    public static void main(String[] args){
        int a=99;

            if(isEven(a)){
                System.out.println("This number is even");
            }
            else {
                System.out.println("This number is odd");
       }
    }
    
}

//note: Its a good prcatice to name mthods as lowercase in start 
// (%) gives remainder
// (/) gives quotient