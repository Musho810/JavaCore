package lessons;

public class Homework3 {
    public static void main(String[] args) {
        int[] age = {3, 10, 17, 24, 67};
        int a;
        for (a = 0; age.length > a; a++) {
            if (age[a] < 12) {
                System.out.println("never");
            } else if (age[a] > 12 && age[a] < 18) {
                System.out.println("OO !!!");
            } else {
                System.out.println("yes");
            }

        }
    }}


