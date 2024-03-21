package arrayObject;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Book books[] = new Book[5];
//		try {
//
//		for(int i = 0;i<books.length; i++) {
//			
//		Book b1 = new Book();
//		
//		System.out.println("Enter book id :");
//		b1.setId(sc.nextInt());
//		
//		System.out.println("Enter book name :");
//		b1.setName(sc.next());
//		
//		System.out.println("Enter book aurther :");
//		b1.setAuther(sc.next());
//		
//		System.out.println("Enter book price :");
//		b1.setPrice(sc.nextDouble());
//		
//		books[i] = b1;
//				
//		}
//		
//		for(Book b : books) {
//			
//			System.out.println(b);
//			
//			
//		}
//		}catch(Exception e) {
//			
//			System.out.println(e.getMessage());
//		}
		
		
		Employee emp[] = new Employee[5];
		
		for(int i= 0; i<emp.length; i++) {
			
			Employee emp1 = new Employee();
			
			System.out.println("Enter id :");
			emp1.setId(sc.nextInt());
			
			System.out.println("Enter name :");
			emp1.setName(sc.next());
			
			System.out.println("Enter Company :");
			emp1.setCompany(sc.next());
			
			System.out.println("Enter salary :");
			emp1.setSalary(sc.nextDouble());
			
			
			emp[i] = emp1;
			
			
		}
		
		for(Employee e : emp) {
			
			System.out.println(e);
			
		}
		
		
		
	}
}
