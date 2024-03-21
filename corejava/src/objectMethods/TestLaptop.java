package objectMethods;

import java.util.Scanner;

public class TestLaptop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Laptop[] laptoparray = new Laptop[3];
		
		for(int i = 0; i < laptoparray.length; i++) {
			
			Laptop lp = new Laptop();
			
			lp.setId(sc.nextInt());
			lp.setName(sc.next());
			lp.setCompany(sc.next());
			
			System.out.println("Added Successfully!");
			
			laptoparray[i] = lp;
			
		}
		
		TestLaptop tL = new TestLaptop();
		
		tL.printlaptops(laptoparray);
		
	}
	
	void printlaptops(Laptop[] l ) {
		
		for(Laptop laptop : l) {
			
			System.out.println(laptop);
		}
		
	}
	
	
}
