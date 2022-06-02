package homework.arrayutil;

public class ArraySortWithMethod {


    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    double avg(int[] array) {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        return avg;
    }

    int Even(int[] array) {
        System.out.print("Even numbers :  ");
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "  ");
                countEven++;
            }
        }

        return countEven;


    }

    int Odd(int[] array) {
        System.out.print("Odd numbers :  ");
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
                System.out.print(array[i] + "  ");
            }
        }
        return countOdd;

    }

    String SortArray(int[] array) {
        System.out.print(" in descending order ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "  ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.print(" in the ascending order ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "  ");
        }
        System.out.println();
        return "The Array was sorted";
    }
}
