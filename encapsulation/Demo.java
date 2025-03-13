package encapsulation;

public class Demo {
    static String name;
    private int id;
    private double sal;

//    Demo(String name, int id, double sal){
//        this.name = name;
//        this.id = id;
//        this.sal = sal;
//    }

    Demo(String name, int id, double sal){
        this.name = name;
        setId(id);
        setSal(sal);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSal(double sal){
        this.sal = sal;
    }

    public int getId(){
        return id;
    }

    public double getSal(){
        return sal;
    }
}

