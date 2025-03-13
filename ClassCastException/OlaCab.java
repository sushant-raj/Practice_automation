package ClassCastException;

public class OlaCab {

}
class MiniCab extends OlaCab{
    int price = 10;
}
class SedanCab extends OlaCab{
    int price = 20;
}

class Driver2{
    public static void main(String[] args) {
        OlaCab c = new MiniCab();
        //System.out.println(c.price);

        SedanCab sc =(SedanCab) c;
        System.out.println(sc.price);
    }
}