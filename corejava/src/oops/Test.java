package oops;

import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
			BookObject book1 = new BookObject();
//			
//			book1.bookID = 101;
//			book1.bookAurther = "Piyush";
//			book1.bookName = "Hello World";
//			book1.BookPrice = 1200;
//			
//			book1.printbook();
//			
			BookObject book2 = new BookObject();
			
			System.out.println("Enter book id :");
			book2.bookID = sc.nextInt();
			
			System.out.println("Enter book Aurther :");
			book2.bookAurther = sc.next();
			
			System.out.println("Enter book Name :");
			book2.bookName = sc.next();
			
			System.out.println("Enter book price :");
			book2.BookPrice = sc.nextFloat();
			
			book2.printbook();
	}
}
