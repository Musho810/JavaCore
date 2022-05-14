package lessons;

public class Homework2 {
    public static void main(String[] args) {
        String[] sigarettes = {"Winston", "Davidoff", "Camel", "Kent"};
        sigarettes[0] = "Ararat";

        for (int i = 0; i < sigarettes.length; i++){
            System.out.print(sigarettes[i] + " ");
        }

    }
}