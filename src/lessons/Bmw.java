package lessons;

public class Bmw {
    String series;
    String model;
    String engine;
    String color;
    String drivetrain;
    int HPS;
    int Year;

    public Bmw(String series, String model, String engine, String color, String drivetrain, int HPS, int Year) {
        this.series = series;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.drivetrain = drivetrain;
        this.HPS = HPS;
        this.Year = Year;
    }

    void runanddrive() {
        System.out.println("Car ready to drive");
    }

    void damaged() {
        System.out.println("The car is damaged");
    }

    public static void main(String[] args) {
        Bmw bmw = new Bmw(" BMW ", " X 7 ", " Diesel", "Black", "All wheel drive", 485, 2020);
        bmw.series = " BMW ";
        bmw.model = " X 7 ";
        bmw.engine = "Diesel";
        bmw.color = "Black";
        bmw.drivetrain = "All wheel drive";
        bmw.HPS = 485;
        bmw.Year = 2020;

        System.out.println(bmw.series);
        System.out.println(bmw.model);
        System.out.println(bmw.engine);
        System.out.println(bmw.color);
        System.out.println(bmw.drivetrain);
        System.out.println(bmw.HPS + " HPS");
        System.out.println(bmw.Year + " year");
        System.out.println();

        bmw.runanddrive();
        bmw.damaged();


    }
}
