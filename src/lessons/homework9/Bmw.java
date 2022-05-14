package lessons.homework9;

class Bmw extends Car implements Fuel{
    String name;

    @Override
    public void iHave3doors() {
        System.out.println("BMW _i have 3 Doors");
    }

    @Override
    public void iHave5doors() {
        System.out.println("BMW _i don`t have 5 doors");
    }
  public Bmw(String name) {
        this.name = name;

    }


    @Override
    public void diesel(String info) {
        System.out.println("BMW this is gasoline car");
    }
}