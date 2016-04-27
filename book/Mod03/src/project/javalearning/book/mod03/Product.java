package project.javalearning.book.mod03;

public class Product {
	private int id;
	private String name = "";
	private double unitPrice = 100;
	
	
	public int getId() {
		return id ;
	}
	public void setId(int id) {
		this.id = id ;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
