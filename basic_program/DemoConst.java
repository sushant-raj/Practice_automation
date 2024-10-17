package basic_program;

public class DemoConst {
 
	String empName;
	String empDesig;
	int empId;
	int empAge;
	
	DemoConst(String empName, String empDesig, int empId, int empAge)
	{
		this.empName = empName;
		this.empDesig = empDesig;
		this.empId = empId;
		this.empAge = empAge;
		
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DemoConst empData = new DemoConst("Sushant", "SSE", 2171, 28);
        System.out.println(empData.empName);
        System.out.println(empData.empDesig);
		System.out.println(empData.empId);
		System.out.println(empData.empAge);
	}

}
