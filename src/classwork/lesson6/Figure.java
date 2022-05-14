package classwork.lesson6;

public class Figure {
    public static void main(String[] args) {
        int i;
        i=5;
        for (int k = 0; k < i+1; k++) {
            for (int l = 0; l < k+1; l++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}
