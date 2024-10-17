package OOPS;

public class Setter {

	String empName = "Sushant";
	private int empId = 1234;
	private String reporter = "Ganesh Sir";
	
	public void setId(int empID)
	{
		this.empId = empID;
		System.out.println(empID);
	}
   
	public void setName(String reporter)
	{
		this.reporter = reporter;
		System.out.println(reporter);
	}
	
	public static void main(String[] args) {
		Setter setEmp = new Setter();
		System.out.println(setEmp.empId);
	}
	
}

