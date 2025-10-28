import java.util.ArrayList; //library
public class ArrayListSample{
    public static void main(String[]args){
        
        ArrayList<String> menu = new ArrayList<>();
        menu.add("Ramen"); //adding items
        menu.add("Sushi");
        menu.add("Tempura");
        menu.remove("Tempura"); //deleting items
        menu.add("Udon");
        menu.set(menu.indexOf("Udon"), "Tonkatsu"); //updating items
         
        System.out.println(menu); //printing elements

    }
}
