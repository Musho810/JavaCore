package lessons.homework8;

public class FibRec {
    public static void main(String[] args) {
        int fib1 = 0;
        int fib2 = 1;
        int fib3;
        System.out.print(fib1 + "   " + fib2);
        for (int i = 2; i < 20; i++) {
            fib3 = fib2 + fib1;
            fib1 = fib2;
            fib2 = fib3;
            System.out.print("  " + fib3);
        }
    }
//
//    private static int factorial(int n) {
//        if (n == 1)
//            return 1;
//        return n * factorial(n - 1);
//    }
//    public static void main(String[] args) {
//        System.out.println("Factorial 1 =" + factorial(1) + ",");
//        System.out.println("Factorial 2 =" + factorial(2) + ",");
//        System.out.println("Factorial 3 =" + factorial(3) + ",");
//        System.out.println("Factorial 4 =" + factorial(4) + ",");
//        System.out.println("Factorial 5 =" + factorial(5) + ",");
//        System.out.println("Factorial 6 =" + factorial(6) + ",");
//        System.out.println("Factorial 7 =" + factorial(7) + ",");
//        System.out.println("Factorial 8 =" + factorial(8) + ",");
//        System.out.println("Factorial 9 =" + factorial(9) + ",");
//        System.out.println("Factorial 10 =" + factorial(10) + ",");
//        System.out.println("Factorial 11 =" + factorial(11) + ",");
//        System.out.println("Factorial 12 =" + factorial(12) + ",");
//        System.out.println("Factorial 13 =" + factorial(13) + ",");
//        System.out.println("Factorial 14 =" + factorial(14) + ",");
//        System.out.println("Factorial 15 =" + factorial(15) + ",");
//        System.out.println("Factorial 16 =" + factorial(16) + ",");
//        System.out.println("Factorial 17 =" + factorial(17) + ",");
//        System.out.println("Factorial 18 =" + factorial(18) + ",");
//        System.out.println("Factorial 19 =" + factorial(19) + ",");
//        System.out.println("Factorial 20 =" + factorial(20) + ",");
//        System.out.println("Factorial 21 =" + factorial(21) + ",");
//    }
}