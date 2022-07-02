package classwork.lesson18;

public class ExeptionTest {
    public static void main(String[] args) {
        String number = "654a";
        try {
            int a = Integer.parseInt(number);
            System.out.println(a * 2);
        } catch (NumberFormatException e) {
            System.out.println("input only numbers");
        }
        System.out.println("hello");
    }
}