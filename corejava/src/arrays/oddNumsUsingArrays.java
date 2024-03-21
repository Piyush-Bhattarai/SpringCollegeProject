package arrays;

import java.util.Arrays;

public class oddNumsUsingArrays {
	
	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(getoddnumsfrom1to100()));
		
	}
	
      static int[] getoddnumsfrom1to100() {
		
		int [] arr = new int[50];
		
		int index = 0;
		
		for(int i = 0;i<=100; i++) {
			
			
			if(i % 2 != 0) {
				
				arr[index] += i;
				index++;
			}
			
			
		}
		
		
		return arr;
		
		
	}
}
