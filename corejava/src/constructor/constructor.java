package constructor;

public class constructor {

		String username;
		String password;
		
		constructor(){
			
			
		}
		
		
		constructor(String Username, String password){
			
			this.username = Username;
			this.password = password;
		}		
		
		void printuser() {
			
			System.out.println("UserName :"+username);
			System.out.println("Password :"+password);
		}	
		
		public static void main(String[] args) {
			
			constructor cons = new constructor("hello", "123");
			
			cons.printuser();
		}
}
