package aggregation;

public class Car {
	
	private int id;
	private  String model;
	private String price;
	private int cc;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + ", cc=" + cc + "]";
	}
	
	
	

}
