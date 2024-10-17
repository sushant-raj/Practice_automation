package Constructor_Program;

public class TestArea {

	int length;
	int width;
	double area;
	
	TestArea()
	{
		System.out.println("No argumemt constructor");
	}
	TestArea(int length)
	{
		this();
		this.length = length;
		System.out.println("Calling only length constructor " + length);
	} 
	TestArea(int length, int width)
	{
		this(length);
		this.width = width;
		System.out.println("Calling length and width constructor " + length + " " + width);
	}
	
	TestArea(int length, int width, double area)
	{
		this(length, width);
		this.area = area;
		System.out.println("Calling length, width, area constructor " + length + " " + width + " " + area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 2;
		int width  = 4;
		double area = length * width;
		
        TestArea tr = new TestArea(length, width, area);
        System.out.println(tr.length);
        System.out.println(tr.width);
        System.out.println(tr.area);
	}

}
