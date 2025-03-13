package practice_program;

public class UtilityClass {
    private double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
class Utility{
    public static double getArea(UtilityClass uc){
        return 3.14 * uc.getRadius() * uc.getRadius();
    }
}
class Driver2{
    public static void main(String[] args) {
        UtilityClass uc = new UtilityClass();
        uc.setRadius(4);
        System.out.println(uc.getRadius());
        System.out.println(Utility.getArea(uc));

    }
}
