package homework.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator result = new Calculator();
        System.out.println(result.plus(2.5, 7.5));
        System.out.println();
        System.out.println(result.minus(2.5, 7.5));
        System.out.println();
        System.out.println(result.divide(2.5, 7.5));
        System.out.println();
        System.out.println(result.multiply(2.5, 7.5));
    }
}
