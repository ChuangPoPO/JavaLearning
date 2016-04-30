package scjp.domain;

public class ProductV2 {
	private int id;
	private String name = "";
	private double unitPrice = 100;
	
	public ProductV2() {}
	
	public ProductV2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ProductV2(int id, String name, double price) {
		this(id, name);
		unitPrice = price;
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
