import java.util.ArrayList;
public class MeetSudo {
    public static void main(String []args) {
        String name = "Sudo";
        int age = 500;

        double height = 190.5;

       ArrayList<String> foods = new ArrayList<>();
          foods.add("Ramen");
          foods.add("Sushi");
          foods.add("Pancakes");
          foods.remove("Sushi"); // sudo dont want this anymore
          foods.add("Tacos");
          foods.set(foods.indexOf("Tacos"), "Burritos");


        System.out.println("Hello my name is " +name+ " and I am " +age+ " years old.");
        System.out.println(height + " cm.");
        System.out.println("My favorite foods are:" + foods);
    }
}
