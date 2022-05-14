package lessons.homework6;



public class Mersedece extends Car {
    String name;
    int HPS;


    @Override
    public void iHave5doors() {
        System.out.println("I have 5 Doors");
    }

    @Override
    public void iHave3doors() {
        System.out.println("i don`t have 3 doors");
    }

    public Mersedece(String name, int HPS) {
        this.name = name;
        this.HPS = HPS;
    }

}
