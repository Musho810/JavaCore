package lessons.homework8;

public class FigureGeometric {
    int a=2, b=3;
    private int c=4;
    static double pi = 3.14;

    public void perimetr() {
        System.out.println("Triangle perimeter"+(a + b + c));
    }

    public  class Pentagone {
        int d=6, e=3;


        public void perimetr (){
            System.out.println("Pentagon perimeter" + (a+b+c+d+e));
        }


    }
    static class Cyrcle{
        static int r = 5;

        static void perimetr (){
            System.out.println("Cyrcle Perimeter " + (2*r*pi));
        }
    }

}
