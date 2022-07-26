package classwork.lesson19;

public class ExceptionDemo {
    public static void main(String[] args) {
        printWithoutWhithSpace (null);
    }

    private static void printWithoutWhithSpace(String value) {
        if(value == null){
            throw new NullPointerException();
        }
        System.out.println(value.trim());
    }
}
