package project.javalearning.book.mod03;

public class Order {
	private String name;
	private Product product;
	private int quantity;
	
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product p) {
		product = p;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int q) {
		quantity = q;
	}
}
