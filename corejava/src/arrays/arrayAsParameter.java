package arrays;

import java.util.Scanner;

public class arrayAsParameter {

	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int values[] = new int[10];
		
		for(int i = 0; i<values.length; i++) {
			
			values[i] = sc.nextInt();
			
			
		}
		
		sum(values);
		
	}
	
	static void sum(int array[]) {
		
		int sum = 0;
		
		for(int x : array ) {
			
			sum = sum + x;
			
			
		}
		
		System.out.println("The sum of array is : " +sum);
		
		
	}
}
