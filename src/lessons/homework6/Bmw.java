package lessons.homework6;



class Bmw extends Car {
    String name;

    @Override
    public void iHave3doors() {
        System.out.println("I have 3 Doors");
    }

    @Override
    public void iHave5doors() {
        System.out.println("I don`t have 5 doors");
    }

    public Bmw(String name) {
        this.name = name;

    }
}