package scjp.domain;

public class OrderV2 {
	private String name;
	private ProductV2 product;
	private int quantity;
	
	public OrderV2() {}
	
	public OrderV2(String n, ProductV2 p) {
		name = n;
		product = p;
	}
	
	public OrderV2(String n, ProductV2 p, int q) {
		this(n, p);
		quantity = q;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	
	public ProductV2 getProduct() {
		return product;
	}
	public void setProduct(ProductV2 p) {
		product = p;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int q) {
		quantity = q;
	}
}
