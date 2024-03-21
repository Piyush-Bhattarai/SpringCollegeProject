package arrays;

import java.util.Scanner;

public class arrayAsParameterPractice01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String cities[] = new String[10];
		
		for(int i = 0; i< cities.length; i++) {
			
			System.out.println("Enter the name of cities :");
			cities[i] = sc.next();
			
		}
		
		Cities(cities);
		
		
	}
	
	static void Cities(String[] array) {
		
		for(String x : array) {
			
			System.out.println(x);
		}
		
		
		
	}

}
