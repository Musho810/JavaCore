package homework;

public class PracticeHomework {
    long convertTime(int minute) {
        System.out.println("the count of seconds  ");
        return minute * 60;
    }

    int calcAge(int years) {
        System.out.println("the numbers of days   ");
        return years * 365;
    }

    int nextNumber(int number) {
        System.out.println("the next number is  ");
        return number + 1;
    }

    boolean isSameNum(int a, int b) {

        System.out.print("a equals to b expression is   ");
        if (a != b) {
            return false;
        } else {
            return true;
        }
    }

    boolean lessThanOrEqualToZero(int number) {
        System.out.print("the Number less or Equal to zero expression is  ");
        if (number <= 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean reverseBool(boolean value) {
        System.out.print("the reverse boolean value is  ");
        if (value == true) {
            return false;
        } else {
            return true;
        }
    }

    int maxLength(int[] array1, int[] array2) {

        if (array1.length > array2.length) {
            return array1.length;
        } else if (array1.length < array2.length) {
            return array2.length;
        } else {
            System.out.println(" The length of arrays is same ");
        }
        return array1.length;
    }

}
