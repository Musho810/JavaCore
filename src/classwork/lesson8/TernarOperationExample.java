package classwork.lesson8;

public class TernarOperationExample {
    public static void main(String[] args) {
        int x=10;
        int y=14;
        int z;
        if(x>y && x<100){
            z=x;
        } else {
            z=y;
        }
        System.out.println(z);

        System.out.println();

        z=x>y ? x : y ;
        System.out.println(z);
    }
}
