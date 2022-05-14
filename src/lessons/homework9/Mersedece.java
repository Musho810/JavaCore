package lessons.homework9;

public class Mersedece extends Car implements Electric{
    String name;
    int HPS;


    @Override
    public void iHave5doors() {
        System.out.println("Mersedece _i have 5 Doors");
    }

    @Override
    public void iHave3doors() {
        System.out.println("Mersedece _i don`t have 3 doors");
    }

    public Mersedece(String name, int HPS) {
        this.name = name;
        this.HPS = HPS;
    }


    @Override
    public void hybrde(String info) {
        System.out.println( "Mersedece _this is electric car");
    }
}
