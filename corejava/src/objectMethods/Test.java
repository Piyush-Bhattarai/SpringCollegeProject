package objectMethods;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		
		
		Test t = new Test();
		
		Students s = t.printdetails();
				t.printdetails(s);
				
		
	}
	
	//object as parameter.
		void printdetails(Students s) {
			
			System.out.println("id : "+s.getId());
			System.out.println("name : "+s.getName());
			System.out.println("college : "+s.getCollege());
			
			
		}
		
		
		//object as return type.
		
		Students printdetails(){
			
			Students s1 = new Students();
			
			s1.setId(101);
			s1.setName("Piyush");
			s1.setCollege("Niagara");
			
			return s1;
			
		}

}
