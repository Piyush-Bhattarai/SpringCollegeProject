package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setId(1100);
		c.setModel("Tesla model 3");
		c.setPrice("12000");
		c.setCc(14000);
		
		Employee e1 = new Employee();
		
		e1.setId(101);
		e1.setName("Piyush");
		e1.setAddress("Pembroke");
		e1.setCar(c);
		
		System.out.println(e1);
		
		
	}

}
