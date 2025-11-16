import java.util.Arrays;
import java.util.ArrayList;
public class Introduction {
    public static void main(String[] args) {
        String name = "John Alrich C. Tecson";
        int age = 19;
        System.out.println("Hello po, My name is " +name + ",and I am " + age + " years old.");

        String[] colors = {"Blue", "Violet", "Pink"};
        System.out.println("My favorite colors are " + colors[0] + ", " + colors[1] + ", " + colors[2] + ".");
        
        String[] foods = new String[5];
        foods[0] = "Ice Cream";
        foods[1] = "Bread";
        foods[2] = "Turon";
        foods[3] = "Stews";
        foods[4] = "Pizza";
        System.out.println("My favorite foods are " +Arrays.toString(foods));

        ArrayList<String> favsongs = new ArrayList<>();
        favsongs.add("So Klingt Liebe - And One");
        favsongs.add("No. 1 Party Anthem - Artic Monkeys");
        favsongs.add("Why'd You Only Call Me When You're High? - Artic Monkeys");
        favsongs.add("Multo - Cup of Joe");
        favsongs.add("A Million Miles Away(Both ENG & JPN) - Belle");
        favsongs.add("Are We Still Friends? - Tyler, The Creator");
        favsongs.add("I Think I Like You - The Band CAMINO");
        favsongs.add("A Pearl - Mitski");
        favsongs.add("What Are We - mrld");
        favsongs.add("Hanggang Kailan - Orange and Lemons");
        favsongs.remove("Why'd You Only Call Me When You're High? - Artic Monkeys");
        System.out.println("My favorite songs are " + favsongs);

    }
}
