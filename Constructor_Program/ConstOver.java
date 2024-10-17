package Constructor_Program;

public class ConstOver {

	String empName;
	int empID;
	char eBGroup;
	String empDesign;
	double empSal;
	ConstOver()
	{
		System.out.println("This is from no argument constructor");
	}
	ConstOver(String empName)
	{
		this.empName = empName;
		System.out.println("Only initializing Name "+ empName);
	
	}
	ConstOver(String empName, int empID)
	{
		this.empName = empName;
		this.empID = empID;
		System.out.println("Initializing Name and ID "+ empName + " " + empID);
	}
	ConstOver(String empName, int empID, char eBGroup)
	{
		this.empName = empName;
		this.empID = empID;
		this.eBGroup = eBGroup;
		System.out.println("Initializing Name, ID and Blood Group "+ empName + " " + empID + " " + eBGroup);
	}
	ConstOver(String empName, int empID, char eBGroup, String empDesign)
	{
		this.empName = empName;
		this.empID = empID;
		this.eBGroup = eBGroup;
		this.empDesign = empDesign;
		System.out.println("Initializing Name, ID, Designation and Blood Group "+ empName + " " + empID + " " + eBGroup + " " + empDesign);
	}
	ConstOver(String empName, int empID, char eBGroup, String empDesign, double empSal)
	{
		this.empName = empName;
		this.empID = empID;
		this.eBGroup = eBGroup;
		this.empDesign = empDesign;
		this.empSal = empSal;
		System.out.println("Initializing Name, ID, Designation, Salary and Blood Group "+ empName + " " + empID + " " + empDesign + " " + eBGroup + " " + empSal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               /*  ConstOver emp = new ConstOver();
                 System.out.println(emp.empName);
                 System.out.println(emp.empID);
                 System.out.println(emp.eBGroup);
                 System.out.println(emp.empDesign);
                 System.out.println(emp.empSal); */
                 
                 ConstOver fistEmp = new ConstOver("Sushant");
                 System.out.println(fistEmp.empName);
                 System.out.println(fistEmp.empID);
                 System.out.println(fistEmp.eBGroup);
                 System.out.println(fistEmp.empDesign);
                 System.out.println(fistEmp.empSal);
                 
             /*    ConstOver secondaEmp = new ConstOver("Rishu", 2172);
                 System.out.println(secondaEmp.empName);
                 System.out.println(secondaEmp.empID);
                 System.out.println(secondaEmp.eBGroup);
                 System.out.println(secondaEmp.empDesign);
                 System.out.println(secondaEmp.empSal);
            
                 ConstOver thirdEmp = new ConstOver("Pratik", 1233, 'O');
                 System.out.println(thirdEmp.empName);
                 System.out.println(thirdEmp.empID);
                 System.out.println(thirdEmp.eBGroup);
                 System.out.println(thirdEmp.empDesign);
                 System.out.println(thirdEmp.empSal);
                 
                 ConstOver fourthEmp = new ConstOver("Jyoti", 1042, 'B', "SSE" );
                 System.out.println(fourthEmp.empName);
                 System.out.println(fourthEmp.empID);
                 System.out.println(fourthEmp.eBGroup);
                 System.out.println(fourthEmp.empDesign);
                 System.out.println(fourthEmp.empSal);
                 
                 ConstOver fifthEmp = new ConstOver("Varun", 1035, 'A', "SE", 68000 );
                 System.out.println(fifthEmp.empName);
                 System.out.println(fifthEmp.empID);
                 System.out.println(fifthEmp.eBGroup);
                 System.out.println(fifthEmp.empDesign);
                 System.out.println(fifthEmp.empSal);   */

	}
	

}
