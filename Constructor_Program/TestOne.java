package Constructor_Program;
import java.util.Scanner;
public class TestOne {

    int length;
    int width;
    double area;
    
    TestOne()
    {
    	System.out.println("Just no  arg constructor");
    }
    TestOne(int length, int width)
    {
    	this();
    	this.length = length;
    	this.width = width; 
    }
    TestOne(int length, int width,double area)
    {
    	this(length, width);
    	this.area = area; 
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
    	System.out.println("User please enter the length ");
    	int length = sc.nextInt();
    	System.out.println("User please enter the width ");
    	int width = sc.nextInt();
		double area = length * width	;
		TestOne ar = new TestOne(length, width,area);

		
	}

}
