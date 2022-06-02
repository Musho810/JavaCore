package homework.arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] numb = {2, 33, 5, 67, 9, 124, 3, 22222, -7, 445333};
        for (int i = 0; i < numb.length; i++) {
            System.out.print(numb[i] + "  ");
        }
        System.out.println();
        int max = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] > max) {
                max = numb[i];
            }
        }
        System.out.println(max);

        int min=numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < min) {
                min = numb[i];
            }
        }
        System.out.println(min);

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 == 0) {
                System.out.print(numb[i] + "  ");
            }
        }
        System.out.println();

        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 != 0) {
                System.out.print(numb[i] + "  ");
            }
        }
        System.out.println();

        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 == 0) {
                countEven++;
            } else countOdd++;
        }
        System.out.println("Quantity of even numbers " + countEven);
        System.out.println("Quantity of odd numbers " + countOdd);
        double avg ;
        double sum = 0;
        for (int i = 0; i < numb.length; i++) {
            sum = sum + numb[i];
        }
        avg = sum / numb.length;
        System.out.println("Sum of numbers  " + sum);
        System.out.println("Average of numbers   " + avg);
    }
}