package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class randomNumber {
	
	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(random()));
	}

	
	static int[] random() {
		
//		Random rnd = new Random();
//		
//		IntStream nums = rnd.ints(5, 50, 85);
//		
//		int values[] = nums.toArray();		
		
		int values[] = new Random().ints(20, 50, 100).toArray();	
		return values;
	}
}
