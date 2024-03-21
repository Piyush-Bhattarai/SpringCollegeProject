package objectMethods;

import java.util.Scanner;

public class TestEmployee {

	
	public static void main(String[] args) {
		
		
		
		
		TestEmployee te =  new TestEmployee();
		
		Employee[] earray = te.getEmployee();
		
		te.printEmployee(earray);
		
		
	}
	void printEmployee(Employee[] emparray) {
		
		for( Employee e : emparray) {
			
			System.out.println(e);
		}
		
		
	}
	
	Employee[] getEmployee(){
		
		Scanner sc = new Scanner(System.in);
		
		
         Employee[] emparray = new Employee[3];
		
		for(int i=0; i<3; i++) {
			
			Employee emp = new Employee();
			
			System.out.println("Enter emp id :");
			emp.setId(sc.nextInt());
			
			System.out.println("Enter emp name :");
			emp.setName(sc.next());
			
			emparray[i] = emp;
			
			System.out.println("employee added!");
			
			
		}
		
		return emparray;
		
	}
}
