package arrays;

import java.util.Scanner;

public class singlearraytext {
	
	
	public static void main(String[] args) {
		
//		
//		int[] marks = new int[5];
//		
//		for(int i = 0; i< marks.length; i++) {
//			
//			marks[i] = 20;
//			
//			
//		}
//		
////		marks[0] = 10;
////		marks[1] = 11;
////		marks[2] = 12;
////		marks[3] = 13;
////		marks[4] = 14;
////		
////		marks[1] = 20;
//		
//		
//		for(int x : marks) {
//		
//		System.out.println(x);
//		
//		}
//		
		Scanner sc = new Scanner(System.in);
		
		float[]  book_price = new float[10];
		
		float total = 0;
		
		float avg = 0;
		
		for(int i = 0; i< book_price.length; i++) {
			
			
				System.out.println("Enter the price of the book :");
				book_price[i] = sc.nextFloat();
				
			     total = total + book_price[i];
			     
			     avg = total / book_price.length;
			    		 
		}
		
		
		for(float x : book_price) {
			
			System.out.println(x);
			
		}
		System.out.println("Total :" +total);
		System.out.println("Avg :"+avg);
		
		
	}

}
