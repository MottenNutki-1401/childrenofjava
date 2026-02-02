package loops;

public class NestedFor {
    public static void main(String[] args) {

        for (int i =1; i<4;i++) {
            System.out.println(i);

            for (int j =5; j>1;j--){
                System.out.println("  " + j);
            }
        }

    }
}
