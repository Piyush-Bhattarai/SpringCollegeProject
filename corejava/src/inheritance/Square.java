package inheritance;

import java.util.Scanner;

public class Square extends Rectangle{

	Square(double length, double breadth) {
		
		super(length, breadth);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double [][] arr = new double[10][10];
		
		for(int i = 0; i<arr.length; i++) {
			
			
			for(int j = 0; j<arr.length; j++) {
				
				System.out.println("Enter length of ${i+1} Square");
				arr[i][j] = sc.nextDouble();
				
				System.out.println("Enter breadth of ${i+1} Square");
				arr[i][j] = sc.nextDouble();
				
			}
		}
			
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				
				double result = arr[i][j] * arr[i][j];	
				System.out.println(result);
				
			}
			
			
			
				
		}
		
		Rectangle r = new Rectangle(7,6);
		
		r.printArea();
		r.printPerimeter();
		
	}
	
	
}
