package lessons.homework7;

public class Triangle {
    static int n = 10;

    public static void main(String[] args) {        //  *
        for (int i = 0; i < n; i++) {                   //  **
            for (int j = 0; j <= i; j++) {               //  ***
                if (j < i) {
                    System.out.print("* ");
                } else System.out.println();
            }

        }

        //  ***
        for (int i = 0; i < n; i++) {                       //  **
            for (int j = 0; j <= n - i; j++) {                 //  *
                if (j < n - i) {
                    System.out.print("* ");
                } else System.out.println();
            }

        }

        for (int i = 0; i < n; i++) {               //     **
            for (int j = 0; j < n; j++) {            //    ***
                if (j < n - i) {
                    System.out.print("  ");
                } else System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {               //     **
            for (int j = 0; j < n; j++) {           //      *
                if (j >= i) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = (n - i) / 2; j > 0; j++) {

                System.out.println(" * ");


            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("+");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        for (int i = 1; i < n / 2; ++i) {

            for (int j = n / 2; j > i; --j)
                System.out.print("   ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print(" * ");

            System.out.println();
        }
        for (int i = n / 2; i >= 1; --i) {

            for (int j = n / 2; j > i; --j)
                System.out.print("   ");

            for (int j = 1; j < i * 2; ++j)
                System.out.print(" * ");

            System.out.println();
        }


    }


}



