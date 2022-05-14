package lessons.homework9;

public class Toyota extends Car implements Electric,Fuel {


    @Override
    public void iHave3doors() {
        System.out.println("I Dont Have 3 Doors");
    }

    @Override
    public void iHave5doors() {
        System.out.println("I Dont Have 5 Doors");
    }

    @Override
    public void hybrde(String info) {
        System.out.println("Toyata  _this is not hybrid car");
    }

    @Override
    public void diesel(String info) {
        System.out.println("Toyata  _this is not gasoline car");
    }
}
