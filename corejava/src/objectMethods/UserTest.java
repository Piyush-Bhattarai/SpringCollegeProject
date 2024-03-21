package objectMethods;

import java.util.Scanner;

public class UserTest {
	
	
	public static void main(String[] args) {
		
		User[] userarray = new User[3];
		UserTest ut = new UserTest();
		
		ut.getUser(userarray);
		
		ut.printUser(userarray);
		
		
		
	}
	
	void printUser(User[] userarray) {
		
		for(User values : userarray) {
			
				System.out.println(values);
			
		}
		
	}
	
	User[] getUser(User[] userarray) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < userarray.length; i++) {
			
			User u = new User();
			
			u.setId(sc.nextInt());
			u.setName(sc.next());
			u.setAddress(sc.next());
			
			userarray[i] = u;
			
		}
		
		return userarray;
	}
	
}
