package homework.arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {
        int numb[] = {2, 33, 5, 67, 9, 124, 3, 22222, 7, 445333};
        for (int i = 0; i < numb.length; i++) {
            System.out.print(numb[i] + "  ");
        }
        System.out.println();
        int a = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] > a) {
                a = numb[i];
            }
        }
        System.out.println(a);
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < a) {
                a = numb[i];
            }
        }
        System.out.println(a);
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
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 == 0) {
                count1++;
            } else count2++;
        }
        System.out.println("Quantity of even numbers " + count1);
        System.out.println("Quantity of odd numbers " + count2);
        double average = 0;
        double sum = 0;
        for (int i = 0; i < numb.length; i++) {
            sum = sum + numb[i];
        }
        average = sum / numb.length;
        System.out.println("Sum of numbers  " + sum);
        System.out.println("Average of numbers   " + average);
    }
}
