package inheritance;

public class Rectangle {

	double length;
	double breadth;
	
	
	
	Rectangle(double length, double breadth){
		
		this.length = length;
		this.breadth = breadth;
		
	}
	
	void printArea() {
		
		System.out.println("Area : "+(length*breadth));
	}
	
	void printPerimeter() {
		
		
		System.out.println("Perimeter :"+(length + breadth));
		
	}
}
