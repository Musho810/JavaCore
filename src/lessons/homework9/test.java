package lessons.homework9;

public class test {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("x6");
        Mersedece mersedece = new Mersedece("S",200);
        Toyota toyota = new Toyota();
        bmw.iHave3doors();
        mersedece.run();
        mersedece.iHave5doors();
        bmw.diesel("Only premium diesel");
        mersedece.hybrde( "electric + diesel");
        toyota.diesel("xxx");
        toyota.hybrde("yyy");
        }

    }
