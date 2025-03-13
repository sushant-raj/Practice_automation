package practice_program;

class Employee{
    String empName;
    int empID;
    Employee(String empName,int empID){
        this.empName =empName;
        this.empID = empID;
    }
}

class EmpDepartment extends Employee{
    String department;
    String profile;

    EmpDepartment(String department, String profile, String empName, int empID ){
        super(empName,empID);
        this.department = department;
        this.profile = profile;


    }

}
public class DemoUp_Down_Cast {
    public static void main(String[] args) {
        /*EmpDepartment dep = new EmpDepartment("Testing", "QA", "John", 219);
        System.out.println(dep);
        System.out.println("Department: " + dep.department + " Profile: " + dep.profile + " Employee: " + dep.empName + " Emp ID: " + dep.empID);*/

        Employee emp = new EmpDepartment("Testing", "QA", "John", 219);
        EmpDepartment empDep = (EmpDepartment)emp;
        System.out.println(emp.empID);
        System.out.println(emp.empName);



    }
}
