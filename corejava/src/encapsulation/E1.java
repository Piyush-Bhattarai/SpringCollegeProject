package encapsulation;

public class E1 {

	private int id;
	private String name;
	private String Company;
	private int price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "E1 [id = " + id + ", name = " + name + ", Company = " + Company + ", price = " + price + "]";
	}
	
	
	
	
}
