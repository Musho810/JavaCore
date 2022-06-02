package homework.arrayutil;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] array = new int[]{12, 67, 4444, -98, 3, -654, 12, 5};
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        ArraySortWithMethod aswm = new ArraySortWithMethod();
        System.out.println("Maximum value of array is  " + aswm.max(array));
        System.out.println("Minimum value of array is   " + aswm.min(array));
        System.out.println("The Summ of numbers array  " + aswm.sum(array));
        System.out.println("The average of numbers array  " + aswm.avg(array));
        System.out.println("Quantity of Odd numbers  " + aswm.Odd(array));
        System.out.println("Quantity of Even numbers   " + aswm.Even(array));
        System.out.println( aswm.SortArray(array));
        System.out.println(aswm.ArrayWithoutSpace(spaceArray));
        System.out.println(" Quantity of letters O in char array is   " + aswm.quantityOfLettersO(chars));
        System.out.println(aswm.theMiddleCharacters(chars2));
        System.out.println("last 2 characters of arrai is  ly expression     "+ aswm.charctersLY(chars3));
        System.out.println("the presence of symbols 'b' 'o' 'b' in the array is   " + aswm.bob(bobArray));
        System.out.println((aswm.textWithoutSpace(text)));


    }
}
