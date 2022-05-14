package classwork.lesson6;

public class ArrayExample {
    public static void main(String[] args) {
//        int[] numbers = new int [7];
        int[] numbers= {6,45,-98,8,254,0,98};
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        numbers[0]=15;
        System.out.println(numbers[0]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
