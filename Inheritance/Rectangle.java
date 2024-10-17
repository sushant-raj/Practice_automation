package Inheritance;

public class Rectangle extends FindArea{

	int length;
	int width;
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
		findArea(length, width);
	}
}
