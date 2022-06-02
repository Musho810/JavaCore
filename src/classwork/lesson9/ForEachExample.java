package classwork.lesson9;

public class ForEachExample {
    public static void main(String[] args) {
        int [] numbers ={3,5,7,9,12,23,45};
        int sum=0;
        for (int numb:numbers
             ) {
            sum+=numb;
        }
        for (int n: numbers
             ) {
            System.out.println( n + " ");
        }
        System.out.println(sum);
    }
}
