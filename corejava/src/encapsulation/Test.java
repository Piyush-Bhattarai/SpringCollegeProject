package encapsulation;



public class Test {

	
	public static void main(String[] args) {
		
		E1 e1 = new E1();
		
		e1.setId(101);
		e1.setName("LG");
		e1.setCompany("LG");
		e1.setPrice(1000);
	
		
		System.out.println(e1);
		
//		System.out.println("ID :"+e1.getId());
//		System.out.println("Name :"+e1.getName());
//		System.out.println("Company :"+e1.getCompany());
//		System.out.println("Price :"+e1.getPrice());
		
	}
}
