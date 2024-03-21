package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayAsReturnType {
	
	public static void main(String[] args) {
				
		String [] array = Cities();
		
		System.out.println(Arrays.toString(array));
	}
	
	static String[] Cities() {
		
         Scanner sc = new Scanner(System.in);
		
		String []cities = new String[5];
		
		for(int i = 0 ; i<cities.length; i++) {
			
		System.out.println("Enter the name of cities :");
		cities[i] = sc.next();
		
		
	}
		return cities;
	}
}

