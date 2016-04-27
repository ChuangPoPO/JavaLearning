package project.javalearning.book.mod04;

public class ProductV2 {
	private int id;
	private String name = "";
	private double unitPrice = 100;
	
	public ProductV2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
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
