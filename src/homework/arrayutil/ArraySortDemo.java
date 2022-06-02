package homework.arrayutil;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] array = new int[]{12, 67, 4444, -98, 3, -654, 12, 5};
        ArraySortWithMethod aswm = new ArraySortWithMethod();
        System.out.println("Maximum value of array is  " + aswm.max(array));
        System.out.println("Minimum value of array is   " + aswm.min(array));
        System.out.println("The Summ of numbers array  " + aswm.sum(array));
        System.out.println("The average of numbers array  " + aswm.avg(array));
        System.out.println("Quantity of Odd numbers  " + aswm.Odd(array));
        System.out.println("Quantity of Even numbers   " + aswm.Even(array));
        System.out.println( aswm.SortArray(array));

    }
}
