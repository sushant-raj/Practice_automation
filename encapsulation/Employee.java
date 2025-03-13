package encapsulation;

import javax.xml.namespace.QName;

public class Employee {
    public static void main(String[] args) {
        Demo emp = new Demo("Sushant", 2171, 189000);
        emp.setId(2171);
        emp.setSal(180000);
        System.out.println(emp.name);
        System.out.println(emp.getId());
        System.out.println(emp.getSal());
    }
}
